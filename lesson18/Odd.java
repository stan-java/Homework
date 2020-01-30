/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson18;

/**
 *
 * @author stanislavhadji
 */
public class Odd implements Validator {

    @Override
    public boolean validate(int numberToValidate) {
        return numberToValidate % 2 == 1;
    }

}
