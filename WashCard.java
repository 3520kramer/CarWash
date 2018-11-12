import java.util.Scanner;
import java.io.*;

public class WashCard {

   private static int cardBalance = 0;
   
   Statistics stats = new Statistics();
  
   public void checkBalance1() throws Exception{  
      cardBalance = stats.readFromFile1();
      if (cardBalance >= 200) {
         System.out.println("Your current balance is " + cardBalance + " DKK. You can still purchase a wash.");
      }else if (cardBalance < 200) {
         System.out.println("Your current balance is " + cardBalance + ". You don't have enough on your balance for an additional wash.");
         System.out.println("You need to recharge your WashCard.");
      }              
   }      
 
   public void checkBalance2() throws Exception{     
      cardBalance = stats.readFromFile2();
      if (cardBalance >= 200) {
         System.out.println("Your balance is " + cardBalance + " DKK. You can purchase a wash.");
      }else if (cardBalance < 200) {
         System.out.println("Your current balance is " + cardBalance +" DKK. You don't have enough on your WashCard for an additional wash.");
         System.out.println("You need to recharge your WashCard.");
      }            
   }      
 
   public void rechargeCard1() {
      int stop = 0;
      
      do {
         try {
            cardBalance = stats.readFromFile1();
            
            if (cardBalance >= 1000){
               System.out.println("You cannot recharge your WashCard, since you already have 1000 DKK on it.");
               stop = 1;
            }else{     
               System.out.println("Please write the amount you want to add to your balance.");
              
               Scanner console = new Scanner(System.in);  
               int userInput = console.nextInt();
  
               if ((cardBalance + userInput) <= 1000) {               
                  cardBalance = cardBalance + userInput;             
                  System.out.println("Your WashCard was successfully recharged.");
                  
                  PrintStream cust1 = new PrintStream (new File("cust1.txt"));
                  System.out.println("Your new balance is: "+cardBalance+".");
                  cust1.println(cardBalance);
             
                  stop = 1;
               }else if ((cardBalance + userInput) > 1000) {   
                  System.out.println("You cannot choose this amount, as you can MAX have 1000 DKK on the balance.");
               }
            }
         }
      
         catch (Exception e) {    
            System.out.println("Please type an integer.");
         }
      }while (stop == 0);
   }
   
   public void rechargeCard2() {
      int stop = 0;
      
      do {
         try {
            cardBalance = stats.readFromFile2();
            
            if (cardBalance >= 1000){
               System.out.println("You cannot recharge your WashCard, since you already have 1000 DKK on it.");
               stop = 1;
            }else{         
               System.out.println("Please write the amount you want to add to your balance.");
               Scanner console = new Scanner(System.in);
               int userInput = console.nextInt();
               
               if ((cardBalance + userInput) <= 1000) {               
                  cardBalance = cardBalance + userInput;             
                  System.out.println("Your WashCard was successfully recharged.");
                  
                  PrintStream cust2 = new PrintStream (new File("cust2.txt"));
                  System.out.println("Your new balance is: "+cardBalance+".");
                  cust2.println(cardBalance);
             
                  stop = 1;
                  
               }else if ((cardBalance + userInput) > 1000) {   
                  System.out.println("You cannot choose this amount, as you can MAX have 1000 DKK on the balance.");
               }
            }
         }
         catch (Exception e) {    
            System.out.println("Please type an integer.");             
         }
      }while (stop == 0);
   }

   public void guestWash() {
      int stop = 0;
      
      System.out.println("Welcome guest!");
      System.out.println("You have the unique possibility to buy one of our three excellent washes. \n");
      System.out.println("Press 1 for Bronze wash, the price is 200 kr.");
      System.out.println("Press 2 for Silver wash, the price is 250 kr.");
      System.out.println("Press 3 for Gold wash, the price is 300 kr.");
     
      Scanner console = new Scanner(System.in); 
      int userInput = console.nextInt();

      Scanner scan1 = new Scanner(System.in);
      
      if(userInput == 1){
         System.out.println("You have chosen the Bronze wash, please insert credit card.");
         System.out.println("Purchase confirmed. \n");
         System.out.println("Would you like a receipt? Yes = 1 or no = 2");
         
         int inputR = scan1.nextInt();
         scan1.nextLine();
            
            if (inputR == 1){
               System.out.println("1 Bronze wash purchased: 200 DKK.");
               System.out.println("Thank you for choosing SuperShine. Have a nice day!");
            }else if(inputR == 2){
               System.out.println("Thank you for choosing SuperShine. Have a nice day!");
            }
      }
      
      if(userInput == 2){
         System.out.println("You have chosen the Silver wash, please insert credit card.");
         System.out.println("Purchase confirmed.");
         System.out.println("Would you like a receipt? Yes = 1 or no = 2");
         
         int inputR = scan1.nextInt();
         scan1.nextLine();
         
            if (inputR == 1){
               System.out.println("1 Silver wash purchased: 250 DKK.");
               System.out.println("Thank you for choosing SuperShine. Have a nice day!");
            }else if(inputR == 2){
               System.out.println("Thank you for choosing SuperShine. Have a nice day!");
            }
      }
      if(userInput == 3){
         System.out.println("You have chosen the Gold wash, please insert credit card.");
         System.out.println("Purchase confirmed. \n");
         System.out.println("Would you like a receipt? Yes = 1 or no = 2");
               
         int inputR = scan1.nextInt();
         scan1.nextLine();
         
         if (inputR == 1){
            System.out.println("1 Gold wash purchased: 300 DKK.");                           
            System.out.println("Thank you for choosing SuperShine. Have a nice day!");
         }else if(inputR == 2){
            System.out.println("Thank you for choosing SuperShine. Have a nice day!");
         }
      }
   }
}