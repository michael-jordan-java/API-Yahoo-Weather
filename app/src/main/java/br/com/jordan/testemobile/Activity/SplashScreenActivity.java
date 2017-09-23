package br.com.jordan.testemobile.Activity;

import android.Manifest;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import br.com.jordan.testemobile.Model.Weather;
import br.com.jordan.testemobile.R;
import br.com.jordan.testemobile.Task.HandlerTask;
import br.com.jordan.testemobile.Task.HandlerTaskAdapter;
import br.com.jordan.testemobile.Task.TaskRest;
import br.com.jordan.testemobile.Util.JsonParser;

/**
 * Created by User on 20/09/2017.
 */

public class SplashScreenActivity extends AppCompatActivity implements LocationListener {
    private static Context context;
    private static final int REQUEST_PERMISSIONS_CODE = 0;

    private AlertDialog alertDialog;
    private double latitude = 0;
    private double longitude = 0;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        context = this;

        startAnimations();
    }

    private void startAnimations() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                readMyCurrentCoordinates();
                if (latitude != 0 && longitude != 0) {
                    new TaskRest(TaskRest.RequestMethod.GET, handlerWeather).execute("https://query.yahooapis.com/v1/public/yql?q=select%20*%20from%20weather.forecast%20where%20woeid%20in%20(SELECT%20woeid%20FROM%20geo.places%20WHERE%20text=\"(" + latitude + "," + longitude + ")\")&format=json");
                }
            }
        }, 2000);
    }

    /**
     * Obtendo coodenadas dos provedores(GPS ou NETWORK) do dispositivo
     */
    private void readMyCurrentCoordinates() {
        LocationManager locationManager = (LocationManager) getSystemService(LOCATION_SERVICE);

        boolean isGPSEnable = locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER);
        boolean isNetworkEnable = locationManager.isProviderEnabled(LocationManager.NETWORK_PROVIDER);
        Location location = null;

        // verificando se os um dos provedores estão ativados
        if (!isGPSEnable && !isNetworkEnable) {
            Toast.makeText(context, "Provedores Indisponiveis", Toast.LENGTH_SHORT).show();
        } else {

            // verifica se tem a  permissão para utilizar a localização do dispositivo
            if (ContextCompat.checkSelfPermission(context, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
                // verificando se o usuário aceitou ou não a permissão
                if (ActivityCompat.shouldShowRequestPermissionRationale(this, Manifest.permission.ACCESS_FINE_LOCATION)) {
                    showDialog("É preciso a permissão ACCESS_FINE_LOCATION para apresentação do tempo!", new String[]{Manifest.permission.ACCESS_FINE_LOCATION});
                } else {
                    // solicitando a permissão
                    ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, REQUEST_PERMISSIONS_CODE);
                }
            } else {

                if (isNetworkEnable) {
                    locationManager.requestLocationUpdates(LocationManager.NETWORK_PROVIDER, 2000, 0, this);
                    location = locationManager.getLastKnownLocation(LocationManager.NETWORK_PROVIDER);
                    if (location != null) {
                        latitude = location.getLatitude();
                        longitude = location.getLongitude();
                    }
                }

                if (isGPSEnable) {
                    if (location == null) {
                        locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 2000, 0, this);
                        location = locationManager.getLastKnownLocation(LocationManager.GPS_PROVIDER);
                        if (location != null) {
                            latitude = location.getLatitude();
                            longitude = location.getLongitude();
                        }
                    }
                }
            }
        }
    }


    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        switch (requestCode) {
            case REQUEST_PERMISSIONS_CODE:
                for (int i = 0; i < permissions.length; i++) {
                    if (permissions[i].equalsIgnoreCase(Manifest.permission.ACCESS_FINE_LOCATION) && grantResults[i] == PackageManager.PERMISSION_GRANTED) {
                        readMyCurrentCoordinates();
                    }
                }
        }

        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }


    /**
     * @param message     Mensagem a ser exibida para o usuário
     * @param permissions Lista de permissões à serem solicitadas ao usuário
     */
    private void showDialog(String message, final String[] permissions) {
        final AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle("Permission");
        builder.setMessage(message);
        builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                ActivityCompat.requestPermissions(SplashScreenActivity.this, permissions, REQUEST_PERMISSIONS_CODE);
                dialog.dismiss();
            }
        });
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        alertDialog = builder.create();
        alertDialog.show();
    }


    @Override
    public void onLocationChanged(Location location) {

    }

    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {

    }

    @Override
    public void onProviderEnabled(String provider) {

    }

    @Override
    public void onProviderDisabled(String provider) {

    }

    /**
     * Handler para fazer devidas operações após o retorno da requisição
     */
    private HandlerTask handlerWeather = new HandlerTaskAdapter() {
        @Override
        public void onPreHandle() {
        }

        @Override
        public void onSuccess(String retorno) {
            // passando o json para objeto
            Weather weather = new JsonParser<Weather>(Weather.class).toObject(retorno);

            // Redirecionando para proxima tela
            Intent intent = new Intent(SplashScreenActivity.this, MainActivity.class);
            intent.putExtra("Weather", weather);
            startActivity(intent);
            finish();
        }

        @Override
        public void onError(Exception error) {
            Toast.makeText(SplashScreenActivity.this, error.getMessage(), Toast.LENGTH_LONG).show();
            finish();
        }
    };
}


