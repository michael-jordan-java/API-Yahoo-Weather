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
        switch (mensagem) {
            case "Tornado":
                return "tornado";
            case "Tropical storm":
                return "tempestade tropical";
            case "Hurricane":
                return "furacão";
            case "Severe thunderstorms":
                return "tempestades severas";
            case "Thunderstorms":
                return "trovoadas";
            case "Mixed rain and snow":
                return "chuva mista e neve";
            case "Mixed rain and sleet":
                return "chuva mista e aguaceiro";
            case "Freezing drizzle":
                return "chuvisco gelado";
            case "Showers":
                return "chuveiros";
            case "Snow flurries":
                return "Flocos de neve";
            case "Ligth snow showers":
                return "leve neve";
            case "Blowing snow":
                return "soprando neve";
            case "Snow":
                return "neve";
            case "Hail":
                return "saudar";
            case "Sleet":
                return "granizo";
            case "Dust":
                return "poeira";
            case "Foggy":
                return "nebuloso";
            case "Haze":
                return "neblina";
            case "Smoky":
                return "esfumaçado";
            case "Blustery":
                return "blustery";
            case "Windy":
                return "ventoso";
            case "Cold":
                return "frio";
            case "Cloudy":
                return "nublado";
            case "Mostly cloudy (night)":
                return "geralmente nublado (noite)";
            case "Mostly cloudy (day)":
                return "mais nublado (dia)";
            case "Partly cloudy (night)":
                return "parcialmente nublado (noite)";
            case "Partly cloudy (day)":
                return "parcialmente nublado (dia)";
            case "Clear":
                return "limpo";
            case "Sunny":
                return "ensolarado";
            case "Fair (night)":
                return "feira (noite)";
            case "Fair (day)":
                return "justo (dia)";
            case "Mixed rain and hail":
                return "chuva mista e granizo";
            case "Hot":
                return "quente";
            case "Isolated thunderstorms":
                return "tempestades isoladas";
            case "Scattered thunderstorms":
                return "tempestades dispersas";
            case "Scattered showers":
                return "chuvas dispersas";
            case "Heavy snow":
                return "neve pesada";
            case "Scattered snow showers":
                return "nevadas dispersas";
            case "Partly cloudy":
                return "parcialmente nublado";
            case "Thundershowers":
                return "trovoadas";
            case "Snow showers":
                return "chuvas de neve";
            case "Isolated thundershowers":
                return "trovoadas isoladas";
            default:
                return "";
        }
    }
}
