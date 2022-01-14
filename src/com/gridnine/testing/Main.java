package com.gridnine.testing;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        FilterManager filterManager = new FilterManager();
        List<Flight> flightList = FlightBuilder.createFlights();

        System.out.println("Фильтруем перелёты согласно правилу №1:");
        filterManager.setFilter(new DepartureBeforeCurrentTimeFilter());
        filterManager.toFilter(flightList).forEach(System.out::println);

        System.out.println("\nФильтруем перелёты согласно правилу №2:");
        filterManager.setFilter(new ArrivalBeforeDepartureFilter());
        filterManager.toFilter(flightList).forEach(System.out::println);

        System.out.println("\nФильтруем перелёты согласно правилу №3:");
        filterManager.setFilter(new GroundTimeMoreThanTwoHoursFilter());
        filterManager.toFilter(flightList).forEach(System.out::println);

    }
}
