package br.com.jordan.testemobile.Model;

import java.io.Serializable;

/**
 * Created by User on 20/09/2017.
 */

public class Condition implements Serializable {
    private int temp;
    private String text;

    public int getTemp() {
        return temp;
    }

    public String getText() {
        return text;
    }

}
