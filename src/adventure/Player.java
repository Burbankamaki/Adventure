/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package adventure;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author lisapage
 */
public class Player {
    
    
    String [] items = {"wallet", "keys", "phone", "lunch"};
    String [] currentItems= new String[4];
    ArrayList cItems= new ArrayList();
    int x =0;
    
    public void getInventoryItems(){
            for (int i=0; i<4; i++ ){
                System.out.println("do you want to bring your "+items[i]+"\n type yes or no.");
                String input=this.getCommand();
                if (input.equals("yes")){
                    System.out.println("you decide to bring your"+items[i]);
                    currentItems[x]=(items[i]);
                    x++;
                    }
                else if (input.equals("no")){
                    System.out.println("you leave your "+items[i]+" behind.");
                    currentItems[x]="";
                    x++;
                    }
                    
                    }
            
            
             int j;
            boolean flag = true;  // will determine when the sort is finished
            String temp;

            while ( flag )
            {
                  flag = false;
                  for (j=0;  j<currentItems.length-1;  j++ )
                  {
                          if (currentItems[j].compareToIgnoreCase(currentItems[j+1])>0){                                                                 
                                 temp = currentItems [j];
                                 currentItems[j]= currentItems[j+1];  
                                 currentItems[j+1]= temp; 
                                 flag = true;
                           } 
                   } 
            }
           //this must use a for statement!!!! \/\/\/
            System.out.println("here are all your items, in alphabetical order! \n");
            int y;
            for (y=0; y<4; y++){
                System.out.println(currentItems[y]);
                }
            
                
}
    
    
    protected final String getCommand() {
      
            String choice;
            Scanner input = new Scanner(System.in);
        boolean valid = false;
        do {
            choice = input.next();
            if (choice.equals("yes")) {
                break;
            }
            if (choice.equals("no")) {
                break;
            }
            else {
                  System.out.println("Invalid command. Please enter a valid command.");
                  continue;
            }
                
        } while (!valid);
        
        return choice;
    }
    
    
    
    
    
}