package com.company.kata;

public class PhoneNumber {

    public String createPhoneNumber(int[] array) {
        String result= "("+ array[0] + array[1] + array[2] + ") " +
                array[3] + array[4] + array[5] + "-" + array[6] + array[7] +
                array[8] + array[9];

        return result;
    }
}
