package com.gridnine.testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GroundTimeMoreThanTwoHoursFilterTest {
    List<Flight> list = FlightBuilder.createFlights();

    @Test
    void listShouldHaveFourElements() {
        List<Flight> expectedList = new GroundTimeMoreThanTwoHoursFilter().filter(list);
        Assertions.assertEquals(4,expectedList.size());
    }
}