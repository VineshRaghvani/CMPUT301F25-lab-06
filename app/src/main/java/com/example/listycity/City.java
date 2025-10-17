package com.example.listycity;

import java.util.Objects;

/**
 * Defines a City with a name and province.
 */
public class City implements Comparable<City> {
    private String city;
    private String province;

    /**
     * Constructs a City.
     * @param city city name
     * @param province province name
     */
    public City(String city, String province) {
        this.city = city;
        this.province = province;
    }

    /**
     * @return city name
     */
    public String getCityName() { return this.city; }

    /**
     * @return province name
     */
    public String getProvinceName() { return this.province; }

    /**
     * Natural order: by city name, case-insensitive.
     */
    @Override
    public int compareTo(City other) {
        return this.city.compareToIgnoreCase(other.city);
    }

    /**
     * Logical equality: same city and province.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof City)) return false;
        City other = (City) o;
        return Objects.equals(city, other.city)
                && Objects.equals(province, other.province);
    }

    /**
     * Hash based on city and province fields.
     */
    @Override
    public int hashCode() {
        return Objects.hash(city, province);
    }
}
