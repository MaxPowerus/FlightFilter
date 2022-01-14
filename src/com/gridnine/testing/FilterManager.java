package com.gridnine.testing;

import java.util.List;

public class FilterManager {
    private Filter filter;

    public void setFilter(Filter filter) {
        this.filter = filter;
    }

    public List<Flight> toFilter(List<Flight> flightList){
        return filter.filter(flightList);
    }
}
