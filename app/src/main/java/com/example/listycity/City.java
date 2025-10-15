package com.example.listycity;

/**
 * This is a class that defines a City.
 */
public class City implements Comparable {
    /**
     * The name of the city
     */
    private String city;

    /**
     * The name of the province
     */
    private String province;

    /**
     * Constructor for City
     * @param city
     *      The name of the city
     * @param province
     *      The name of the province
     */
    City(String city, String province) {
        this.city = city;
        this.province = province;
    }

    /**
     * Gets the city name
     * @return
     *      Return the city name
     */
    String getCityName() {
        return this.city;
    }

    /**
     * Gets the province name
     * @return
     *      Return the province name
     */
    String getProvinceName() {
        return this.province;
    }

    /**
     * Compares this city to another city based on city name
     * @param o
     *      The object to be compared
     * @return
     *      A negative integer, zero, or a positive integer as this city
     *      is less than, equal to, or greater than the specified city
     */
    @Override
    public int compareTo(Object o) {
        City city = (City) o;
        return this.city.compareTo(city.getCityName());
    }
}
