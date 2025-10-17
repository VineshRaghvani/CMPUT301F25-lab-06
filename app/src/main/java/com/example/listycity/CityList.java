package com.example.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Keeps a list of City objects.
 */
public class CityList {
    private final List<City> cities = new ArrayList<>();

    /**
     * Adds a city; throws if already present.
     * @param city city to add
     * @throws IllegalArgumentException if city already exists
     */
    public void add(City city) {
        if (hasCity(city)) {
            throw new IllegalArgumentException("City already exists: " + city.getCityName());
        }
        cities.add(city);
    }

    /**
     * Returns true if the list contains the given city.
     * @param city city to check
     * @return presence flag
     */
    public boolean hasCity(City city) {
        return cities.contains(city);
    }

    /**
     * Removes the given city if present; throws otherwise.
     * @param city city to remove
     * @throws IllegalArgumentException if city not found
     */
    public void delete(City city) {
        boolean removed = cities.remove(city);
        if (!removed) {
            throw new IllegalArgumentException("City not found: " + city.getCityName());
        }
    }

    /**
     * Returns a sorted copy of the cities by natural order.
     * @return sorted list
     */
    public List<City> getCities() {
        List<City> copy = new ArrayList<>(cities);
        Collections.sort(copy);
        return copy;
    }

    /**
     * Returns how many cities are in the list.
     * @return count
     */
    public int countCities() {
        return cities.size();
    }
}
