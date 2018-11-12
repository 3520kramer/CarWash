import java.util.*;
import java.io.*;
public class WashCar {
    
   public static void main(String[] args) throws Exception {
     
      MainMenu menu = new MainMenu();
      Statistics stats = new Statistics();
      Scanner one = new Scanner(System.in);
      WashCard washc = new WashCard();
      
   
      menu.welcome();
      int input = one.nextInt();
      one.nextLine();
     
      if (input == 1){
         System.out.println("Type your user-id ;");
         int userid = one.nextInt();
         
         if (userid==1111) {  
            Scanner fileScan = new Scanner (new File("cust1.txt"));
            
            while (fileScan.hasNext()){
            String balance = fileScan.nextLine();
            System.out.println("Welcome back, your current balance is: "+balance+ " DKR");
            }
         }
      
         if (userid==2222){
            Scanner file2scan = new Scanner(new File("cust2.txt"));
          
            while (file2scan.hasNext()){
               String balance2 = file2scan.nextLine();
               System.out.println("Welcome back, your current balance is: "+balance2+ " DKR");
            } 
         }  
      
         if (userid==0000){
      
         stats.readFromFiles();
         
         menu.welcome();
      
         }
     
         System.out.println("You now have 3 options.\n Press 1 to Buy Wash \n press 2 to Recharge Wash Card \n Press 3 to Check Balance ");
         int ip = one.nextInt();
         one.nextLine();
         
         if (ip==1){
            WashType type = new WashType();
            type.washTypes();
            int wt = one.nextInt();
            one.nextInt();          
         }
      
         if (ip==2){
            washc.rechargeCard();
            washc.checkBalance();
            washc.updateBalance();
         }
      
         if (ip==3){
         
            washc.checkBalance();
           
            }
   
         }else if(input ==2){
            washc.rechargeCard();
            washc.checkBalance();
            System.out.println(" You now have 3 options.\n Press 1 to Buy Wash \n press 2 to Recharge Wash Card \n Press 3 to Check Balance ");
            int ip2 = one.nextInt();
            one.nextLine();
         
            if ( ip2 ==1 ){
               WashType type2 = new WashType();
               type2.washTypes();
            
         }
      }
   }
}
