/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg;


public interface Weapon {
    public abstract int useWeapon(int x);
       
        
    
}
 class Johnny_Sins_Meat_Scepter implements Weapon{

    @Override
    public int useWeapon(int x) {
    return x + 15;
    }
    
}
