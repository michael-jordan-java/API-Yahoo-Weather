package br.com.jordan.testemobile.Model;

import java.io.Serializable;

/**
 * Created by User on 20/09/2017.
 */

public class Channel implements Serializable {
    private Item item;
    private Location location;

    public Item getItem() {
        return item;
    }

    public Location getLocation() {
        return location;
    }
}
