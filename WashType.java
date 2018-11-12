import java.util.*;
import java.io.*;

public class WashType {
   
   Statistics stats = new Statistics();
   WashCard washC = new WashCard();
   Scanner scan1 = new Scanner(System.in);

   public static void washTypes() {
   
      int [] washType = new int [3];

      washType[0]= 200;
      washType[1]= 250;
      washType[2]= 300;
      
      System.out.println("Press 1 for Bronze wash, the price is 200 kr.");
      System.out.println("Press 2 for Silver wash, the price is 250 kr.");
      System.out.println("Press 3 for Gold wash, the price is 300 kr.");
      
   }
   
   public int cust1Buy0() throws Exception{
      PrintStream writeToFileBronze = new PrintStream(new FileOutputStream("statsBronze.txt", true));
      writeToFileBronze.println("Bronze");
      int curBal = stats.readFromFile1();
      int newBal = curBal - 200;
        
      if (curBal < 200){
         System.out.println("You do not have enough money to purchase this wash.");
         System.out.println("Please recharge your WashCard");
      }else{
         System.out.println("Your new balance is: " + newBal + " DKK");
         PrintStream cust1 = new PrintStream (new File("cust1.txt"));
         cust1.println(newBal);
      }
      System.out.println("Would you like a receipt? Yes = 1 or no = 2");
      int inputR = scan1.nextInt();
      scan1.nextLine();
      
      if (inputR == 1){
         System.out.println("1 Bronze wash purchased: 200 DKK.");
         washC.checkBalance2();
         System.out.println("Thank you for choosing SuperShine. Have a nice day!");
      }else if(inputR == 2){
         System.out.println("Thank you for choosing SuperShine. Have a nice day!>");
      }
      return newBal;
   }
     
   public int cust1Buy1() throws Exception{
      PrintStream writeToFileBronze = new PrintStream(new FileOutputStream("statsSilver.txt", true));
      writeToFileBronze.println("Silver");
      int curBal = stats.readFromFile1();
      int newBal = curBal - 250;
     
      if (newBal < 250){
         System.out.println("You do not have enough money to purchase this wash.");
         System.out.println("Please recharge your WashCard");
      }else{
         System.out.println("Your new balance is: " + newBal + " DKK");
         PrintStream cust1 = new PrintStream (new File("cust1.txt"));
         cust1.println(newBal);
      }
      System.out.println("Would you like a receipt? Yes = 1 or no = 2");
      int inputR = scan1.nextInt();
      scan1.nextLine();
      
      if (inputR == 1){
         System.out.println("1 Silver wash purchased: 250 DKK.");
         washC.checkBalance1();
         System.out.println("Thank you for choosing SuperShine. Have a nice day!");
      }else if(inputR == 2){
         System.out.println("Thank you for choosing SuperShine. Have a nice day!>");
      }
      return newBal;
   }
     
   public int cust1Buy2() throws Exception{
      PrintStream writeToFileBronze = new PrintStream(new FileOutputStream("statsGold.txt", true));
      writeToFileBronze.println("Gold");
      int curBal = stats.readFromFile1();
      int newBal = curBal - 300;
      
      if (newBal < 300){
         System.out.println("You do not have enough money to purchase this wash.");
         System.out.println("Please recharge your WashCard");
      }else{
         System.out.println("Your new balance is: " + newBal + " DKK");
         PrintStream cust1 = new PrintStream (new File("cust1.txt"));
         cust1.println(newBal);
      }
      System.out.println("Would you like a receipt? Yes = 1 or no = 2");
      int inputR = scan1.nextInt();
      scan1.nextLine();
      
      if (inputR == 1){
         System.out.println("1 Gold wash purchased: 300 DKK.");
         washC.checkBalance1();
         System.out.println("Thank you for choosing SuperShine. Have a nice day!>"); 
      }else if(inputR == 2){
         System.out.println("Thank you for choosing SuperShine. Have a nice day!");
      }
      return newBal;
   }
     
   public int cust2Buy0() throws Exception{
      PrintStream writeToFileBronze = new PrintStream(new FileOutputStream("statsBronze.txt", true));
      writeToFileBronze.println("Bronze");
      int curBal = stats.readFromFile2();
      int newBal = curBal - 200;
        
      if (newBal < 200){
         System.out.println("You do not have enough money to purchase this wash.");
         System.out.println("Please recharge your WashCard");
      }else{
         System.out.println("Your new balance is: " + newBal + " DKK");
         PrintStream cust1 = new PrintStream (new File("cust2.txt"));
         cust1.println(newBal);
      }
      System.out.println("Would you like a receipt? Yes = 1 or no = 2");
      int inputR = scan1.nextInt();
      scan1.nextLine();
      
      if (inputR == 1){
         System.out.println("1 Bronze wash purchased: 200 DKK.");
         washC.checkBalance2();
         System.out.println("Thank you for choosing SuperShine. Have a nice day!");
      }else if(inputR == 2){
         System.out.println("Thank you for choosing SuperShine. Have a nice day!>");
      }
      return newBal;
   }
     
   public int cust2Buy1() throws Exception{
      PrintStream writeToFileBronze = new PrintStream(new FileOutputStream("statsSilver.txt", true));
      writeToFileBronze.println("Silver");
      int curBal = stats.readFromFile2();
      int newBal = curBal - 250;
      
      if (newBal < 250){
         System.out.println("You do not have enough money to purchase this wash.");
         System.out.println("Please recharge your WashCard");
      }else{
         System.out.println("Your new balance is: " + newBal + " DKR");
         PrintStream cust1 = new PrintStream (new File("cust2.txt"));
         cust1.println(newBal);
      }
      System.out.println("Would you like a receipt? Yes = 1 or no = 2");
      int inputR = scan1.nextInt();
      scan1.nextLine();
   
      if (inputR == 1){
         System.out.println("1 Silver wash purchased: 250 DKK.");
         washC.checkBalance2();
         System.out.println("Thank you for choosing SuperShine. Have a nice day!");
      }else if(inputR == 2){
         System.out.println("Thank you for choosing SuperShine. Have a nice day!");
      }
      return newBal;
   }
     
   public int cust2Buy2() throws Exception{
      PrintStream writeToFileBronze = new PrintStream(new FileOutputStream("statsGold.txt", true));
      writeToFileBronze.println("Gold");
      int curBal = stats.readFromFile2();
      int newBal = curBal - 300;
        
      if (newBal < 300){
         System.out.println("You do not have enough money to purchase this wash.");
         System.out.println("Please recharge your WashCard");
      }else{
         System.out.println("Your new balance is: " + newBal + " DKK");
         PrintStream cust1 = new PrintStream (new File("cust2.txt"));
         cust1.println(newBal);
      }
      System.out.println("Would you like a receipt? Yes = 1 or no = 2");
      int inputR = scan1.nextInt();
      scan1.nextLine();
   
      if (inputR == 1){
         System.out.println("1 Gold wash purchased: 300 DKK.");
         washC.checkBalance2();
         System.out.println("Thank you for choosing SuperShine. Have a nice day!");
      }else if(inputR == 2){
         System.out.println("Thank you for choosing SuperShine. Have a nice day!>");
      }
      return newBal;     
   }
}
