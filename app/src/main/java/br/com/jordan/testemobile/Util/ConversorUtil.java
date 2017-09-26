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
                return "chuva mista e neve";
            case "mixed rain and sleet":
                return "chuva mista e aguaceiro";
            case "freezing drizzle":
                return "chuvisco gelado";
            case "showers":
                return "chuveiros";
            case "snow flurries":
                return "Flocos de neve";
            case "ligth snow showers":
                return "leve neve";
            case "blowing snow":
                return "soprando neve";
            case "snow":
                return "neve";
            case "hail":
                return "saudar";
            case "sleet":
                return "granizo";
            case "dust":
                return "poeira";
            case "foggy":
                return "nebuloso";
            case "haze":
                return "neblina";
            case "smoky":
                return "esfumaçado";
            case "blustery":
                return "blustery";
            case "windy":
                return "ventoso";
            case "cold":
                return "frio";
            case "cloudy":
                return "nublado";
            case "mostly cloudy (night)":
                return "geralmente nublado (noite)";
            case "mostly cloudy (day)":
                return "mais nublado (dia)";
            case "partly cloudy (night)":
                return "parcialmente nublado (noite)";
            case "Partly cloudy (day)":
                return "parcialmente nublado (dia)";
            case "clear":
                return "limpo";
            case "sunny":
                return "ensolarado";
            case "fair (night)":
                return "feira (noite)";
            case "fair (day)":
                return "justo (dia)";
            case "mixed rain and hail":
                return "chuva mista e granizo";
            case "hot":
                return "quente";
            case "isolated thunderstorms":
                return "tempestades isoladas";
            case "scattered thunderstorms":
                return "tempestades dispersas";
            case "scattered showers":
                return "chuvas dispersas";
            case "heavy snow":
                return "neve pesada";
            case "scattered snow showers":
                return "nevadas dispersas";
            case "partly cloudy":
                return "parcialmente nublado";
            case "thundershowers":
                return "trovoadas";
            case "snow showers":
                return "chuvas de neve";
            case "isolated thundershowers":
                return "trovoadas isoladas";
            case "mostly cloudy":
                return "predominantemente nublado";
            default:
                return "";
        }
    }
}
