/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cc3.pkg1j;
import java.util.Scanner;
/**
 *
 * @author fcukouy
 */
public class CC31J {
  public static void Input(){
      Scanner in = new Scanner(System.in);
      System.out.println("Enter Number of Index \n"+ ">");
      int amm = in.nextInt();
      int[] var = new int[amm];
      
      /************input*****************/
      
      for(int a = 0; a < var.length; a++){
          System.out.println("Enter number for index "+ a);
          var[a] = in.nextInt();  
      }
       /*****************************/
      
      
      
     double luck= mean(var);
     int muck = mode(var,amm);
      System.out.println("The mean is "+ luck);
      System.out.println("The mode is "+ muck);
  }
  
  
    public static double mean(int[] m) {
    double sum = 0;
    for (int i = 0; i < m.length; i++) {
        sum += m[i];
    }
    return sum / m.length;
}
    public static int mode(int a[],int n) {
      int maxValue = 0, maxCount = 0, i, j;

      for (i = 0; i < n; ++i) {
         int count = 0;
         for (j = 0; j < n; ++j) {
            if (a[j] == a[i])
            ++count;
         }

         if (count > maxCount) {
            maxCount = count;
            maxValue = a[i];
         }
      }
      return maxValue;
   }
      

  
    
    public static void main(String[] args) {
        Input();
    }
    
}
