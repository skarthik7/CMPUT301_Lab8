package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {

    private CustomList list;
    /**
     * create a mocklist for my citylist
     * @return
     */
    public CustomList MockCityList(){
        list = new CustomList(null,new ArrayList<>());
        return list;
    }
    /**
     * get the size of the list
     * increase the list by adding a new city
     * check if our current size matches the initial size plus
     one.
     */


    @Test
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(),listSize + 1);
    }

    @Test
    public void deleteCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        City testCity = new City("Estevan", "SK");
        list.addCity(testCity);
        assertEquals(list.getCount(),listSize + 1);
        list.deleteCity(testCity);
        assertEquals(list.getCount(),listSize );
    }


    @Test
    public void hasCityTest(){
        list = MockCityList();
        City testCity = new City("Estevan", "SK");
        City testCity2 = new City("Saskatoon", "SK");
        list.addCity(testCity);
        assertTrue(list.hasCity(testCity));
        assertFalse(list.hasCity(testCity2));
    }

    @Test
    public void countCitiesTest(){
        list = MockCityList();
        City testCity = new City("Estevan", "SK");
        City testCity2 = new City("Saskatoon", "SK");
        list.addCity(testCity);
        assertEquals(list.countCities(),2);
        //assertEquals(list.countCities(),1);
    }



}
