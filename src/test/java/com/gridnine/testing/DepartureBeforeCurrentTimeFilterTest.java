package com.gridnine.testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DepartureBeforeCurrentTimeFilterTest {
    List<Flight> list = FlightBuilder.createFlights();

    @Test
    void listShouldHaveFiveElements() {
        List<Flight> expectedList = new DepartureBeforeCurrentTimeFilter().filter(list);
        Assertions.assertEquals(5,expectedList.size());
    }
}