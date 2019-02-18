/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg;

/**
 *
 * @author m304user
 */
public class Archer  extends Character implements Weapon, Armor{
    
private int maxmagic, currentmagic;
    public Archer(String name, int str, int dex, int intel){
        super.Name = name;
        super.Strength = str;
        super.Dexterity = dex;
        super.Inteligence = intel;
        setMaxHealth(20);
        setCurrenthealth(getMaxHealth());
        maxmagic=maxHealth+(Inteligence/3);
        currentmagic=maxmagic;
    }
    public int castChargedShot(int x){
        if(currentmagic >= 5){
            currentmagic -=5;
            return attack(x)+ (Dexterity/2);}
       else
            return 0;
    }
    public int castHeal(int x){
        if(currentmagic>=8){
            currentmagic-=8;
            return x+(Inteligence/2);
        }
        else
            return 0;
    }
    @Override
    public int attack(int r) {
        int x = (r);
        return x;
    }
    public int getMaxMagic(){
        return maxmagic;
    }
    public int getCurrentMagic(){
        return currentmagic;
    }
    @Override
    public int useWeapon(int x) {
     return x + Strength;
    }

    @Override
    public int useArmor(int x) {
     currentmagic -= 8;
     return x + Strength/2;
    }

    
    
}
