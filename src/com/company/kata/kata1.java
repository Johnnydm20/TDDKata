package com.company.kata;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;

public class kata1 {
    @Test
    public void createPhoneNumberTest(){
        //AAA
        //Arrange
        //int[]  integerArray = new int[10];
        //int[] integerArray = new int[]{ 1,2,3,4,5,6,7,1,1,0 };
        PhoneNumber phoneNumber = new PhoneNumber();
        String expected = "(123) 456-7890";

        //Act
        String actual = phoneNumber.createPhoneNumber(new int[]{ 1,2,3,4,5,6,7,8,9,0 });
        //Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void countCharTest(){
        //AAA
        //Arrange
        int expected = 5;

        //Act
        int actual = countChar("fancy fifth fly aloof", 'f');

        //Assert
        Assert.assertEquals(expected, actual);

    }

    private int countChar(String cadena, char letra) {
        int contador = 0;
        for (int i =0; i < cadena.length(); i++){
            if (cadena.charAt(i) == letra){
                contador++;
            }
        }
        return contador;
    }

    @Test
    public void camelCaseTest(){
        //AAA
        //Arrange


        //Act


        //Assert

    }
}
