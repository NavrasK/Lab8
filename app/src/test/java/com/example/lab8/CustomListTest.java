package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;




public class CustomListTest {
    // Add tests here
    private CustomList list;
    public CustomList MockCityList() {
        list = new CustomList(null, new ArrayList<>());
        return list;
    }

    // Add City test
    @Test
    public void addCityTest() {
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(), listSize+1);
    }

    // Has City test
//    @Test
//    public void hasCityTest() {
//        list = MockCityList();
//        list.addCity(new City("Edmonton", "AB"));
//        // TODO
//    }

    // Delete City test
//    @Test
//    public void deleteCityTest() {
//        // TODO
//    }

    // Count Cities test
    @Test
    public void getCountTest() {
        list = MockCityList();
        list.addCity(new City("Saskatoon", "SK"));
        assertEquals(1, list.getCount());
    }
}
