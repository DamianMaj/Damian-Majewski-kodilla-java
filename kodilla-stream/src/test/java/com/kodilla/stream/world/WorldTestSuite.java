package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        World world = new World();
        Continent europe = new Continent("Europe");
        Continent africa = new Continent("Africa");
        Continent asia = new Continent("Asia");
        Continent northAmerica = new Continent("North America");
        Country poland = new Country("Poland", new BigDecimal("56789000000"));
        Country rpa = new Country("RPA", new BigDecimal("12345678923"));
        Country china = new Country("China", new BigDecimal("987654321987"));
        Country usa = new Country("USA", new BigDecimal("67891234567123"));

        europe.addCountry(poland);
        africa.addCountry(rpa);
        asia.addCountry(china);
        northAmerica.addCountry(usa);
        world.addContinent(europe);
        world.addContinent(africa);
        world.addContinent(asia);
        world.addContinent(northAmerica);

        //When
        BigDecimal totalPeopleQuantity = world.getPeopleQuantity();

        //Then
        Assert.assertEquals(new BigDecimal("123456789"), totalPeopleQuantity);

    }
}
