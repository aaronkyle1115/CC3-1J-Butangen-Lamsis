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
public class Character {

    static Dice dice = new Dice();
    private String Name;
    private int Strength, Dexterity, Inteligence;
    private int maxHealth;
    private int currentHealth;
    private int roll = dice.Roll();

    public Character(String name, int str, int dex, int intel) {
        this.Name = name;
        this.Strength = str;
        this.Dexterity = dex;
        this.Inteligence = intel;
    }

    public int attack(int r) {
        int x = (this.Strength / 2)  + r;
        return x;
    }

    public void wound(int a ) {
        this.currentHealth -= a;
        
    }

    public void heal(int heal) {
        if (currentHealth < maxHealth) {
            this.currentHealth += heal + this.Dexterity / 2;
        }
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
}
