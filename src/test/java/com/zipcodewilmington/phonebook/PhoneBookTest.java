package com.zipcodewilmington.phonebook;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by leon on 1/23/18.
 */
public class PhoneBookTest {
    private PhoneBook testPhoneBook;
    String testName = "Mike";
    String testPhoneNumber = "609-868-4500";
    @Before
    public void setup(){
        this.testPhoneBook = new PhoneBook();
    }

    @Test
    public void addTest(){
        //Given

        //When
        testPhoneBook.add(testName, testPhoneNumber);
        String actual = testPhoneBook.lookup(testName);
        //Then
        Assert.assertEquals(testPhoneNumber, actual);

    }

    @Test
    public void removeTest(){
        //Given
        testPhoneBook.add(testName,testPhoneNumber);
        //When
        testPhoneBook.remove(testName);
        String actual = testPhoneBook.lookup(testName);
        //Then
        Assert.assertNull(actual);

    }

    @Test
    public void reverseLookupTest(){
        //Given
        testPhoneBook.add(testName,testPhoneNumber);

        //When
        String expected = testPhoneBook.reverseLookup(testPhoneNumber);
        //Then
        Assert.assertEquals(expected, testName);

    }

    @Test
    public void displayTest(){
        //Given
        testPhoneBook.add("Magneto","1-800-MAGNETBOI");
        testPhoneBook.add(testName,testPhoneNumber);
        String expected = "Magneto 1-800-MAGNETBOI\nMike 609-868-4500\n";
        //When
        String actual = testPhoneBook.display();
        //Then
        Assert.assertEquals(expected, actual);
    }

}
