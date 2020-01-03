/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson12;

/**
 *
 * @author stanislavhadji
 */
public class replace {
    public static void main (String [] args){
        String phrase = "The quick brown fox jumps over the lazy dog";
        System.out.println(phrase.replace('d', 'f'));
        System.out.println(phrase.toLowerCase());
        String s2 = "   Java Exercises   ";
        System.out.println(s2.trim());
        
    }
}
