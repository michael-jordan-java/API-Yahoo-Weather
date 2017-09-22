package br.com.jordan.testemobile.Model;

import java.io.Serializable;

/**
 * Created by User on 20/09/2017.
 */

public class Location implements Serializable{
    private String city;
    private String region;

    public String getCity() {
        return city;
    }

    public String getRegion() {
        return region;
    }

}
