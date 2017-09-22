package br.com.jordan.testemobile.Model;

import java.io.Serializable;

/**
 * Created by User on 20/09/2017.
 */

public class Weather implements Serializable{
    private Query query;

    public Query getQuery() {
        return query;
    }

    public void setQuery(Query query) {
        this.query = query;
    }
}
