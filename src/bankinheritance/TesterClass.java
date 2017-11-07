package bankinheritance;

import java.util.Scanner;

public class TesterClass {
    public static void main (String[] args) {

        //banktesting        
        Logariasmos kanonikos = new Logariasmos(1000);
        ApotamieutikosLogariasmos apotamieutikos = new ApotamieutikosLogariasmos(1000, 0.02);
        ElegxomenosLogariasmos elegxou = new ElegxomenosLogariasmos(500);
        
        Trapeza bank = new Trapeza();
        
        //no problem to add subclasses to bank
        bank.addAccount(kanonikos);
        bank.addAccount(apotamieutikos);
        bank.addAccount(elegxou);
        
        System.out.println(bank);
      
        
    }
    
}
