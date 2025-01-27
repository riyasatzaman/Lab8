package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;

    // Create a mock list for testing
    public CustomList MockCityList() {
        list = new CustomList(null, new ArrayList<>());
        return list;
    }

    @Test
    public void addCityTest() {
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(), listSize + 1);
    }

    @Test
    public void testHasCity() {
        list = MockCityList();
        City city = new City("Estevan", "SK");
        list.addCity(city);
        assertEquals(true, list.hasCity(city));  // Expected to pass once functionality is implemented
    }

    @Test
    public void testDeleteCity() {
        list = MockCityList();
        City city = new City("Estevan", "SK");
        list.addCity(city);
        list.deleteCity(city);
        assertEquals(false, list.hasCity(city));  // Expected to pass once functionality is implemented
    }

    @Test
    public void testCountCities() {
        list = MockCityList();
        list.addCity(new City("Estevan", "SK"));
        list.addCity(new City("Regina", "SK"));
        assertEquals(2, list.countCities());  // Expected to pass once functionality is implemented
    }


}
