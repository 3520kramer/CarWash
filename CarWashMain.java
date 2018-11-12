import java.util.*;
import java.io.*;

public class CarWashMain{

   public static void main(String[] args) throws Exception{
   
      MainMenu menu = new MainMenu();
      Statistics stats = new Statistics();
      WashCard washC = new WashCard();
      WashType wt = new WashType();
      
      Scanner scan1 = new Scanner(System.in);
      
      boolean bool = true;
           
      menu.welcome();         
      do{
         
         int input = scan1.nextInt();
         scan1.nextLine();
         
         if(input == 1){
            System.out.println("Type your user-id:");
            int userid = scan1.nextInt();
          
            if(userid == 1111){
                           
               Scanner fileScan = new Scanner(new File("cust1.txt"));
               
               while(fileScan.hasNext()){
                  String balance = fileScan.nextLine();
                  System.out.println("Welcome back!");  
               }
               do{
                  menu.fourOptions();
                  int ip = scan1.nextInt();
                  scan1.nextLine();
               
                  if(ip == 1){
                     wt.washTypes();
                     int input1 = scan1.nextInt();
                     scan1.nextLine();
                  
                     if(input1 == 1){
                        wt.cust1Buy0();
                     }  
                  
                     if(input1 == 2){
                        wt.cust1Buy1();
                     }
                     
                     if(input1 == 3){
                        wt.cust1Buy2();                        
                     }
                  }
                  
                  if(ip == 2){
                     washC.rechargeCard1();
                     washC.checkBalance1();
                  }
                
                  if(ip == 3){
                     washC.checkBalance1();
                  }
                     
                  if(ip == 4){
                     bool = false;
                  }
               }while(bool==true);
            }   
            if(userid == 2222){
               Scanner fileScan = new Scanner(new File("cust2.txt"));
               
               while(fileScan.hasNext()){
                  String balance2 = fileScan.nextLine();
                  System.out.println("Welcome back!");
               }
               
               do{
                  menu.fourOptions();
    
                  int ip2 = scan1.nextInt();
                  scan1.nextLine();
            
                  if(ip2 == 1){
                  wt.washTypes();
                  int input2 = scan1.nextInt();
                  scan1.nextLine();
               
                     if(input2 == 1){
                        wt.cust2Buy0();
                     }
                  
                     if(input2 == 2){
                        wt.cust2Buy1();
                     }
                  
                     if(input2 == 3){
                        wt.cust2Buy2();
                     }
                  }
            
                  if(ip2 == 2){
                     washC.rechargeCard2();
                     washC.checkBalance2();
                  }
            
                  if(ip2 == 3){
                     washC.checkBalance2();
                  }
            
                  if(ip2 == 4){
                     bool = false;
                  }
               }while(bool==true);
            
            }
            if(userid == 0000){
               stats.getStats();
               bool = false;
            }            
         }
         if(input == 2){
            washC.guestWash();
            bool = false;
         }
         if (input == 3){
            bool = false;
         }     
      }while(bool == true);              
   } 
}