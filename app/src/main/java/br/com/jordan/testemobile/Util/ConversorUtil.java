package br.com.jordan.testemobile.Util;

import android.content.Context;

/**
 * Created by User on 21/09/2017.
 */

public class ConversorUtil {

    public static int toCelcius(int f) {
        int resultado = (f - 32) * 5 / 9;
        return resultado;
    }

    public static String traduzir(String mensagem) {
        switch (mensagem.toLowerCase()) {
            case "tornado":
                return "tornado";
            case "tropical storm":
                return "tempestade tropical";
            case "hurricane":
                return "furacão";
            case "severe thunderstorms":
                return "tempestades severas";
            case "thunderstorms":
                return "trovoadas";
            case "mixed rain and snow":
                return "chuva e neve";
            case "mixed rain and sleet":
                return "chuva e granizo fino";
            case "mixed snow and sleet":
                return "neve e granizo fino";
            case "freezing drizzle":
                return "garoa gélida";
            case "freezing rain":
                return "chuva gélida";
            case "drizzle":
                return "garoa";
            case "showers":
                return "chuva";
            case "snow flurries":
                return "neve em flocos finos";
            case "ligth snow showers":
                return "leve precipitação de neve";
            case "blowing snow":
                return "ventos com neve";
            case "snow":
                return "neve";
            case "hail":
                return "chuva de granizo";
            case "sleet":
                return "pouco granizo";
            case "dust":
                return "pó em suspensão";
            case "foggy":
                return "neblina";
            case "haze":
                return "névoa seca";
            case "smoky":
                return "esfumaçado";
            case "blustery":
                return "vendaval";
            case "windy":
                return "ventando";
            case "cold":
                return "frio";
            case "cloudy":
                return "nublado";
            case "clear":
                return "céu limpo";
            case "sunny":
                return "ensolarado";
            case "fair":
                return "tempo bom";
            case "fair (night)":
                return "tempo bom";
            case "fair (day)":
                return "tempo bom";
            case "mixed rain and hail":
                return "chuva e granizo";
            case "hot":
                return "quente";
            case "isolated thunderstorms":
                return "tempestades isoladas";
            case "scattered thunderstorms":
                return "tempestades dispersas";
            case "scattered showers":
                return "chuvas dispersas";
            case "heavy snow":
                return "nevasca";
            case "scattered snow showers":
                return "nevadas dispersas";
            case "partly cloudy (night)":
                return "parcialmente nublado";
            case "partly cloudy (day)":
                return "parcialmente nublado";
            case "partly cloudy":
                return "parcialmente nublado";
            case "thundershowers":
                return "chuvas com trovoadas";
            case "snow showers":
                return "tempestade de neve";
            case "isolated thundershowers":
                return "relâmpagos e chuva isoladas";
            case "mostly cloudy (night)":
                return "muitas nuvens";
            case "mostly cloudy (day)":
                return "muitas nuvens";
            case "mostly cloudy":
                return "muitas nuvens";
            case "mostly sunny (night)":
                return "predominantemente ensolarado";
            case "mostly sunny (day)":
                return "predominantemente ensolarado";
            case "mostly sunny":
                return "predominantemente ensolarado";
            default:
                return "";
        }
    }
}
