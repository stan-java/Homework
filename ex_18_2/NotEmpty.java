/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_18_2;

/**
 *
 * @author stanislavhadji
 */
public class NotEmpty implements Validator{

    @Override
    public boolean validate(String stringToValidate) {
        
        return !stringToValidate.isEmpty();
        }
    
}
