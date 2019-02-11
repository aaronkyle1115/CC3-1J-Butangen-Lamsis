/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg;

import java.util.Random;

public class Dice {

    private Random r = new Random();

    public Dice() {

    }

    public int Roll() {
        int x = this.r.nextInt(5)+1;
        return x;
    }
}
