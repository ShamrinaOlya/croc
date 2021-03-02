package com.company;

public class Main {

    public static void main(String[] args) {
        String F ="Fizz";
        String B ="Buzz";
        for (int i=1; i<=100;i++)
            if ((i % 3 != 0) && (i % 5 != 0)) {
                System.out.println(i);
            }
        else {
	    if ((i % 3 == 0) && (i % 5 == 0)){
	        System.out.println(F+B);
        }
        if ((i % 3 == 0) && (i % 5 != 0)) {
            System.out.println(F);
        }
        if ((i % 3 != 0) && (i % 5 == 0)) {
            System.out.println(B);
        }

    }
}
}
