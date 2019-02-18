/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg;
import java.util.Scanner;
/**
 *
 * @author m304user
 */
public class testCharacterduel {
 
    Scanner in = new Scanner(System.in);
    public String x,d;
    static Dice dice = new Dice();
    
    Wizard p1 = new Wizard("Lua", dice.Roll(), dice.Roll(), dice.Roll());
        //Character("Lua", dice.Roll(), dice.Roll(), dice.Roll());
    Archer p2 = new Archer("Qua", dice.Roll(), dice.Roll(),dice.Roll() );
        //Character("Qua", dice.Roll(), dice.Roll(),dice.Roll() );
    int roll = 0;
    int roll2 = 0;
    
    public void displaystatsp1(){
        
        System.out.println("-----------------------");
        System.out.println("P1: ");
        System.out.println("Name: "+p1.getName());
        System.out.println("Class: Wizard" );
        System.out.println("Stats:");
        System.out.println("STR: "+p1.getStrength());
        System.out.println("Dex: " +p1.getDexterity());
        System.out.println("INT: "+p1.getInteligence());
        
        System.out.println("HP: "+p1.getCurrenthealth());
        
    }
    public void displaystatsp2(){
        
        System.out.println("-----------------------");
        System.out.println("P2: ");
        System.out.println("Name: "+p2.getName());
        System.out.println("Class: Archer");
        System.out.println("Stats:");
        System.out.println("STR: "+p2.getStrength());
        System.out.println("Dex: " +p2.getDexterity());
        System.out.println("INT: "+p2.getInteligence());
       
        System.out.println("HP: "+p2.getCurrenthealth());
        System.out.println("----------------------------");
    }
    
    
    public void battle(){
        
        int rond=1;
        
        System.out.println();
        displaystatsp1();
        System.out.println();
        displaystatsp2();
        
        
    for(rond = 1; p1.getCurrenthealth() > 0 && p2.getCurrenthealth()>0 ;rond++){
        roll = dice.Roll();
        roll2 = dice.Roll();
        
        System.out.println("***Round "+ rond+"***");
        System.out.println(p1.getName()+": HP "+p1.getCurrenthealth()+" MP "+p1.getCurrentMagic()+"\n"+p2.getName()+": HP "+p2.getCurrenthealth()+" MP "+p2.getCurrentMagic());
       // System.out.println(p1.getName()+" rolls "+roll+"   |\t"+ p2.getName()+" rolls "+ roll2);
        //System.out.println(p1.getName()+" Deals "+ p1.attack(roll)+" damage on "+p2.getName()+" \n"+p2.getName()+" Deals "+ p2.attack(roll2)+" damage on "+ p1.getName());
        System.out.println("--------------------");
        System.out.println("(P1) select your action   (H)Heal (A)Attack (L)LightningBolt:");
        String act1 = in.next();
        System.out.println("\n");
        switch(act1){
            case "H":
            case "h":
                int h = p1.useArmor(roll);
                p1.heal(h);
                System.out.println("***"+p1.getName() +" heals for "+ h);
               
                break;
            case "A":
            case "a":  
                p1.useWeapon(roll);
                System.out.println("***"+p1.getName()+ " uses weapon and deals "+ p1.attack(roll)+" damage to "+ p2.getName());
                p2.wound(p1.attack(roll));
                break;
            case "L":
            case "l":
                int l =p1.castLightningBolt(roll);
                System.out.println("***"+p1.getName()+" cast Ligthning Bolt and deals "+ l+ " to "+ p2.getName());
                p2.wound(l);
                break;
                default:
                System.out.println("***"+"Skillset not found\nLose turn for this round");
                    break;
        }
        System.out.println("\t----End of action----\n\n");
        if(p2.getCurrenthealth()>0){
        System.out.println("--------------------");
        System.out.println("(P2)CPU");
        
       // System.out.println("(P2) select your action   (H)Heal (A)Attack (C)ChargedShot:");
        //String act2 = in.next();
        System.out.println("\n");
        if(p2.getCurrenthealth()>0){
            if(p2.getCurrentMagic()>=8 && p2.getCurrenthealth() <= 10){
                int h = p2.useArmor(roll2);
                System.out.println("***"+p2.getName() +" heals for "+ h);
                p2.heal(h);
                
            }
            else if(p2.getCurrentMagic()>= 5){
                int c =p2.castChargedShot(roll2);
                System.out.println("***"+ p2.getName()+" cast Charged Shot and deals "+ c + " to ");
                p1.wound(c);
               
            }
             
            else{
                p2.attack(roll2);
                System.out.println("***"+p2.getName()+ " uses weapon and deals "+ p2.attack(roll2)+" damage to "+ p1.getName());
                p1.wound(p2.useWeapon(roll2));
                
            }
            
            
        
        
            
            
        /*switch(act2){
            
            case "H":
            case "h":
                int h = p2.castHeal(roll2);
                p2.heal(h);
                System.out.println("***"+p2.getName() +" heals for "+ h);
                break;
            case "A":
            case "a":  
                p2.attack(roll2);
                System.out.println("***"+p2.getName()+ " deals "+ p2.attack(roll2)+" damage to "+ p1.getName());
                p1.wound(p2.attack(roll2));
                break;
            case "C":
            case "c":
                
                int c =p2.castChargedShot(roll2);
                System.out.println("***"+p2.getName()+" cast Charged Shot and deals "+ c + " to "+ p1.getName());
                p1.wound(c);
                break;
            default:
                System.out.println("***"+"Skillset not found\nLose turn for this round");
                break;
        }*/
        //System.out.println("\t----End of action----\n\n");
    }
        
      
        
        System.out.println("\t--------End of Round! "+rond+"-----------");
       
        
    }
    
    if(p1.getCurrenthealth()>p2.getCurrenthealth() && p2.getCurrenthealth() < 0){
        
    System.out.println("Victory! "+ p1.getName()+" HP: "+ p1.getCurrenthealth());
   
    System.out.println("Defeat! "+ p2.getName()+" HP: "+ p2.getCurrenthealth());
     }
    else if(p2.getCurrenthealth()>p1.getCurrenthealth() && p1.getCurrenthealth() < 0){
        
       System.out.println("Victory! "+ p2.getName()+" HP: "+ p2.getCurrenthealth()); 
       
        System.out.println("Defeat! "+ p1.getName()+" HP: "+ p1.getCurrenthealth());
          }

    else if(p2.getCurrenthealth() == p1.getCurrenthealth()){
        System.out.println("DRAW!");
        
         System.out.println( p1.getName()+" HP: "+ p1.getCurrenthealth());
         System.out.println(p2.getName()+" HP: "+ p2.getCurrenthealth());}
    
    
}
    
    
    
    
}}

    

