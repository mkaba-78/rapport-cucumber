package com.canal.rapport;

public class Rapport {
    public  String play(int number){
        if(number==0) throw new IllegalArgumentException("Number Incorrect");
        if(isDivisibleBy(number, 3) && isDivisibleBy(number, 5)) return "FizzBuzz";
        if(isDivisibleBy(number, 3)) return "Fizz";
        if(isDivisibleBy(number, 5)) return "Buzz";

        return String.valueOf(number);
    }

    private boolean isDivisibleBy(int number, int i) {
        return number % i == 0;
    }
}