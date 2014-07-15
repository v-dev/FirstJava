package com.company;

import javax.xml.bind.DatatypeConverter;

public class Main {

    public static void main(String[] args)
    {

        System.out.println("hello this is my first Java");
        Main.add();
    }

    private static void add()
    {
        int num1=10;
        int num2=20;
        int result=num1+num2;

        System.out.println("addition is" +result);
    }
}


