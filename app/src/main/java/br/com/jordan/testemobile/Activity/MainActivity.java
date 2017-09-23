package br.com.jordan.testemobile.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import br.com.jordan.testemobile.Model.Weather;
import br.com.jordan.testemobile.R;
import br.com.jordan.testemobile.Util.ConversorUtil;


public class MainActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private TextView tvTemperatura;
    private int temperatura;
    private String cidade, regiao, situacao;

    private long backPressedTime = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // alterando a barra de ferramentas
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        tvTemperatura = (TextView) findViewById(R.id.tvTemp);

        // recuperando o objeto
        Weather weather = (Weather) getIntent().getExtras().get("Weather");

        // convertendo a temperatura em C°
        temperatura = ConversorUtil.toCelcius(weather.getQuery().getResults().getChannel().getItem().getCondition().getTemp());

        // cidade
        cidade = weather.getQuery().getResults().getChannel().getLocation().getCity();

        // regiao
        regiao = weather.getQuery().getResults().getChannel().getLocation().getRegion();

        // situacao
        situacao = ConversorUtil.traduzir(weather.getQuery().getResults().getChannel().getItem().getCondition().getText());

        if (situacao.isEmpty()) {
            tvTemperatura.setText(R.string.error);
        } else {
            tvTemperatura.setText(temperatura + getString(R.string.primeira_parte_mens) + " " + cidade + "," + regiao + " " + getString(R.string.segunda_parte_mens, situacao));
        }
    }

    @Override
    public void onBackPressed() {
        long time = System.currentTimeMillis();
        if (time - backPressedTime > 2000) {    // 2 secs
            backPressedTime = time;
            Toast.makeText(this, getString(R.string.sair_message), Toast.LENGTH_SHORT).show();
        } else {
            // clean up
            super.onBackPressed();
        }
    }

}
