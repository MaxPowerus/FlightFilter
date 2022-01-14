package com.gridnine.testing;

import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

/**
 * 3. Исключает перелеты если общее время, проведённое на земле превышает два часа.
 */

public class GroundTimeMoreThanTwoHoursFilter implements Filter {

    @Override
    public List<Flight> filter(List<Flight> flightList) {
        List<Flight> resultList = new ArrayList<>(flightList);
        for(Flight flight:flightList){
            long groundTime = 0;
            if (flight.getSegments().size() > 1) {
                for (int i = 1; i < flight.getSegments().size(); i++) {
                    long minutes = ChronoUnit.MINUTES.between(flight.getSegments().get(i - 1).getArrivalDate(), flight.getSegments().get(i).getDepartureDate());
                    groundTime += minutes;
                }
            }
            if (groundTime > 120) resultList.remove(flight);
        }
        return resultList;
    }


}
