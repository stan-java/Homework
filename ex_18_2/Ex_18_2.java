/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_18_2;

import java.util.function.Predicate;

/**
 *
 * @author stanislavhadji
 */
public class Ex_18_2 {

    public static void main(String[] args) {
        //  StringContainer valid = new StringContainer();
        // Length length = new Length();
        // NotEmpty emp = new NotEmpty();

        //Validator valid = phrase -> phrase.contains("knowledge");
        //      Validator length = phrase -> phrase.length() > 10;
        //    Validator emp = phrase -> !phrase.isEmpty();
        Predicate<String> contains = phrase -> (phrase.contains("knowledge"));
        Predicate<String> length = phrase -> (phrase.length()>10);
        Predicate<String> emp = phrase -> (phrase.isEmpty());
        
        
        String phrase = "This is a String contains knowledge";

        // boolean result1 = valid.validate(phrase);
        //boolean result2 = length.validate(phrase);
        //boolean result3 = emp.validate(phrase);
        //System.out.println("Contains the string “knowledge”:" + result1);
        //System.out.println("Has a length greater than 10”:" + result2);
        //System.out.println("Is not null:" + result3);
        System.out.println("Contains the string “knowledge”:" + contains.test(phrase));
        System.out.println("Has a length greater than 10”:" + length.test(phrase));
        System.out.println("Is not null:" + emp.test(phrase));
    }

}
