package com.example.listycity;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CityListTest {

    private City mockCity(String name, String province) {
        return new City(name, province);
    }

    private CityList mockCityList() {
        CityList list = new CityList();
        list.add(mockCity("Edmonton", "AB"));
        list.add(mockCity("Calgary", "AB"));
        return list;
    }

    @Test
    void testHasCity_true_false() {
        CityList list = mockCityList();
        assertTrue(list.hasCity(new City("Edmonton", "AB")));
        assertFalse(list.hasCity(new City("Vancouver", "BC")));
    }

    @Test
    void testDelete_removes() {
        CityList list = mockCityList();
        list.delete(new City("Calgary", "AB"));
        assertFalse(list.hasCity(new City("Calgary", "AB")));
    }

    @Test
    void testDelete_throws_when_missing() {
        CityList list = mockCityList();
        assertThrows(IllegalArgumentException.class,
                () -> list.delete(new City("Toronto", "ON")));
    }

    @Test
    void testCountCities() {
        CityList list = mockCityList();
        assertEquals(2, list.countCities());
        list.add(new City("Red Deer", "AB"));
        assertEquals(3, list.countCities());
    }
}
