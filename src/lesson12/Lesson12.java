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
public class Lesson12 {
    public static void main(String[] args) {
        String s1 = new String("Let`s go home, it`s late already!");
        String s2 = new String("Let`s go home, it`s LATE already!");
        System.out.println(s1.charAt(6));
        System.out.println(s1.charAt(10));
        System.out.println(s1.contains("h"));
        System.out.println(s1.contains("it is"));
        System.out.println(s1.endsWith("!"));
        System.out.println(s1.endsWith("already !"));
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
    }
    
}
