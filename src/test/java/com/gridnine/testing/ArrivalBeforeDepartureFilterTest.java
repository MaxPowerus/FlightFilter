package com.gridnine.testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class ArrivalBeforeDepartureFilterTest {
    List<Flight> list = FlightBuilder.createFlights();

    @Test
    void listShouldHaveFiveElements() {
        List<Flight> expectedList = new ArrivalBeforeDepartureFilter().filter(list);
        Assertions.assertEquals(5,expectedList.size());
    }
}