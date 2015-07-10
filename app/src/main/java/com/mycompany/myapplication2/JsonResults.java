package com.mycompany.myapplication2;

import java.io.Serializable;
import java.util.List;

/**
 * Created by yedids on 6/25/2015.
 */

public class JsonResults implements Serializable{
    List<JsonBean> results;

    public List<JsonBean> getResults() {
        return results;
    }

    public void setResults(List<JsonBean> results) {
        this.results = results;
    }
}
