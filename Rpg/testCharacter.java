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
public class testCharacter {
    
    
    Character p1 = new Character("juny", 6, 6, 6);
    Character p2 = new Character("Mats", 6, 6, 6);
    int roll = 0;
    int roll2 = 0;
    
    public void displaystatsp1(){
        System.out.println("P1: ");
        System.out.print("Name: "+p1.getName());
        System.out.println("Stats:");
        System.out.println("STR: "+p1.getStrength());
        System.out.println("Dex: " +p1.getDexterity());
        System.out.println("INT: "+p1.getInteligence());
        p1.setCurrenthealth(30);
        System.out.println("HP: "+p1.getCurrenthealth());
    }
    public void displaystatsp2(){
        System.out.println();
        System.out.println("P2: ");
        System.out.println("Name: "+p2.getName());
        System.out.println("Stats:");
        System.out.println("STR: "+p2.getStrength());
        System.out.println("Dex: " +p2.getDexterity());
        System.out.println("INT: "+p2.getInteligence());
        p2.setCurrenthealth(30);
        System.out.println("HP: "+p2.getCurrenthealth());
        System.out.println("----------------------------");
    }
    
    public void battle(){
        Dice dice = new Dice();
        int rond=1;
        System.out.println();
        displaystatsp1();
        System.out.println();
        displaystatsp2();
        
        
    for(rond = 1; p1.getCurrenthealth() > 1 && p2.getCurrenthealth()>1 ;rond++){
        roll = dice.Roll();
        roll2 = dice.Roll();
        System.out.println("Round "+ rond);
        System.out.println(p1.getName()+": "+p1.getCurrenthealth()+"\n"+p2.getName()+": "+p2.getCurrenthealth());
       // System.out.println(p1.getName()+" rolls "+roll+"   |\t"+ p2.getName()+" rolls "+ roll2);
        System.out.println(p1.getName()+" Deals "+ p1.attack(roll)+" damage on "+p2.getName()+" \n"+p2.getName()+" Deals "+ p2.attack(roll2)+" damage on "+ p1.getName());
        p1.wound(p2.attack(roll2));
        p2.wound(p1.attack(roll));
        System.out.println("--------end of round "+rond+"-----------");
       
        
    }
    if(p1.getCurrenthealth()>p2.getCurrenthealth()){
        if(p1.getCurrenthealth()<0){
        p1.setCurrenthealth(0+3);}
    System.out.println("The winner is "+ p1.getName()+" HP: "+ p1.getCurrenthealth());
    p2.setCurrenthealth(0);
    System.out.println("The loser is "+ p2.getName()+" HP: "+ p2.getCurrenthealth());
     }
    else if(p2.getCurrenthealth()>p1.getCurrenthealth()){
        if(p2.getCurrenthealth()<0){
        p2.setCurrenthealth(0+3);}
       System.out.println("The winner is "+ p2.getName()+" HP: "+ p2.getCurrenthealth()); 
       p1.setCurrenthealth(0);
        System.out.println("The loser is "+ p1.getName()+" HP: "+ p1.getCurrenthealth());
          }

    else {
        System.out.println("draw");
        p1.setCurrenthealth(0);
        p2.setCurrenthealth(0);
         System.out.println( p1.getName()+" HP: "+ p1.getCurrenthealth());
         System.out.println(p2.getName()+" HP: "+ p2.getCurrenthealth());}
    
    
}
    
        
        
}
