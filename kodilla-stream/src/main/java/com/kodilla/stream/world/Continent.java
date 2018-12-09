package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;


public final class Continent {
    private final String continentName;
    private final List<Country> theListOfCountry = new ArrayList<>();

    public Continent(String continentName) {
        this.continentName = continentName;
    }

    public void addCountry(Country country) {
        theListOfCountry.add(country);
    }

    public boolean removeCountry(Country country) {
        theListOfCountry.remove(country);
        return false;
    }

    public String getContinentName() {
        return continentName;
    }

    public List<Country> getTheListOfCountry() {
        return theListOfCountry;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Continent)) return false;
        Continent that = (Continent) o;
        return continentName.equals(that.continentName);
    }
}
