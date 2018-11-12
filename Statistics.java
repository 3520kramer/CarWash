import java.util.*;
import java.io.*;

public class Statistics{
  
   
   //metode til at læse fra en fil
   public int readFromFile1() throws Exception{
      Scanner scan = new Scanner(new File("cust1.txt"));
      int bal = 0;
      
      while(scan.hasNextInt()){
         bal = scan.nextInt();
      }
      return bal;
   }
   
   public int readFromFile2() throws Exception{
      Scanner scan = new Scanner(new File("cust2.txt"));
      int bal = 0;
      
      while(scan.hasNextInt()){
         bal = scan.nextInt();
      }
      return bal;
   }

   //metode til at læse fra flere filer
   public static void readFromFiles() throws Exception{
      Scanner scanBronze = new Scanner(new File("statsBronze.txt"));
      Scanner scanSilver = new Scanner(new File("statsSilver.txt"));
      Scanner scanGold = new Scanner(new File("statsGold.txt"));
            
      while(scanBronze.hasNextLine()){
         String ordBronze = scanBronze.nextLine();
         System.out.println(ordBronze);
      }
      
      while(scanSilver.hasNextLine()){
         String ordSilver = scanSilver.nextLine();
         System.out.println(ordSilver);
      }
      
      while(scanGold.hasNextLine()){
         String ordGold = scanGold.nextLine();
         System.out.println(ordGold);
      }
   }
   
   //METODE DER VIRKER TIL AT TÆLLE TOKENS
   public static void getStats() throws Exception{
      Scanner scan1 = new Scanner(new File("statsBronze.txt"));
      Scanner scan2 = new Scanner(new File("statsSilver.txt"));
      Scanner scan3 = new Scanner(new File("statsGold.txt"));
      int count1 = 0;
      int count2 = 0;
      int count3 = 0;
      int countTotal = 0;
      
      while(scan1.hasNext()){
         scan1.next();
         count1+=1;
      }
      
      while(scan2.hasNext()){
         scan2.next();
         count2+=1;
      }
       
      while(scan3.hasNext()){
         scan3.next();
         count3+=1;
      }
      
      countTotal = count1 + count2 + count3;
      System.out.println("Number of bronze washes: " + count1);
      System.out.println("Number of silver washes: " + count2);
      System.out.println("Number of gold washes: " + count3);
      System.out.println("Washes in total: " + countTotal + "\n");
   }    
}

