/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson18;

import java.util.function.Predicate;

/**
 *
 * @author stanislavhadji
 */
public class Lesson18 {

    public static void main(String[] args) {

        // GreaterThanZeroValidator validator1 = new GreaterThanZeroValidator();
        // LessThenZero validator2 = new LessThenZero ();
        // EqualToZero validator3 = new EqualToZero ();
        // Even validator4 = new Even ();
        // Odd validator5 = new Odd ();
        
        //  Validator validator1 = number -> number > 0;
        //  Validator validator2 = number -> number < 0;
        //  Validator validator3 = number -> number == 0;
        //  Validator validator4 = number -> number %2 == 0;
        //  Validator validator5 = number -> number %2 == 1;
        
        Predicate<Integer> greaterThan = number -> (number > 0);
        Predicate<Integer> lessThan = number -> (number < 0);
        Predicate<Integer> equalTo = number -> (number == 0);
        Predicate<Integer> even = number -> (number % 2 == 0);
        Predicate<Integer> odd = number -> (number % 2 == 1);

        int number = 10;
        //boolean result = validator1.validate(number);
        // boolean result2 = validator2.validate(number);
        // boolean result3 = validator3.validate(number);
        // boolean result4 = validator4.validate(number);
        // boolean result5 = validator5.validate(number);

        // System.out.println("Number " + number + " is greater than zero: " + result);
        // System.out.println("Number " + number + " is less than zero: " + result2);
        // System.out.println("Number " + number + " is equal to zero: " + result3);
        // System.out.println("Number " + number + " is even: " + result4);
        // System.out.println("Number " + number + " is odd: " + result5);
        System.out.println("Number " + number + " is greater than zero: " + greaterThan.test(number));
        System.out.println("Number " + number + " is less than zero: " + lessThan.test(number));
        System.out.println("Number " + number + " is equal to zero: " + equalTo.test(number));
        System.out.println("Number " + number + " is even: " + even.test(number));
        System.out.println("Number " + number + " is odd: " + odd.test(number));
    }
}
