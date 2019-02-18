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
public abstract class Character {

    static Dice dice = new Dice();
    protected String Name;
    protected int Strength, Dexterity, Inteligence, Heal;
    protected int maxHealth;
    protected int currentHealth;
    protected int roll = dice.Roll();
    

    public Character() {
        this.Name = "";
        this.Strength = 0;
        this.Dexterity = 0;
        this.Inteligence = 0;
    }
    public Character(String name, int str, int dex, int intel) {
        this.Name = name;
        this.Strength = str;
        this.Dexterity = dex;
        this.Inteligence = intel;
    }

    public abstract int attack(int r) ;

    public void wound(int a ) {
        this.currentHealth -= a;
        
    }

    public void heal(int x) {
        
        
            this.currentHealth += x;
        
    }
    public int getHeal(){
        return Heal;
    }

    public String getName() {
        return Name;
    }
    public int getRoll(){
        return roll;
    }

    public int getStrength() {
        return Strength;
    }

    public int getDexterity() {
        return Dexterity;
    }

    public int getInteligence() {
        return Inteligence;
    }
    public int getCurrenthealth(){
        return currentHealth;
    }

    public void setCurrenthealth(int x) {
        this.currentHealth = x;
    }

    public void setMaxHealth(int x) {
        this.maxHealth = x;
    }
    public int getMaxHealth(){
        return maxHealth;
    }
}
