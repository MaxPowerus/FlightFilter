package com.gridnine.testing;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 1. Исключает перелеты с вылетом до текущего момента времени.
 */

public class DepartureBeforeCurrentTimeFilter implements Filter {

    @Override
    public List<Flight> filter(List<Flight> flightList) {
        return flightList.stream()
                .filter(flight -> flight.getSegments().get(0).getDepartureDate().isAfter(LocalDateTime.now()))
                .collect(Collectors.toList());
    }
}
