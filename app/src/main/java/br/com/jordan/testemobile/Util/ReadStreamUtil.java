package br.com.jordan.testemobile.Util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by User on 20/09/2017.
 */

public class ReadStreamUtil {
    public static String readStream(InputStream inputStream) throws IOException {
        try{
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            StringBuilder builder = new StringBuilder();
            String linha = null;
            while((linha = reader.readLine()) != null){
                builder.append(linha + "\n");
            }
            reader.close();
            return builder.toString();
        }catch (Exception erro){
            throw erro;
        }
    }
}
