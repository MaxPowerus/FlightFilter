package com.gridnine.testing;

import java.util.ArrayList;
import java.util.List;

/**
 * 2. Исключает перелеты если есть сегменты с датой прилёта раньше даты вылета.
 */

public class ArrivalBeforeDepartureFilter implements Filter{
    @Override
    public List<Flight> filter(List<Flight> flightList) {
        List<Flight> resultList = new ArrayList<>();
        for (Flight flight:flightList) {
            resultList.add(flight);
            for (Segment segment:flight.getSegments()) {
                if (segment.getArrivalDate().isBefore(segment.getDepartureDate())) {
                    resultList.remove(flight);
                    break;
                }
            }
        }
        return resultList;
    }
}
