package bankinheritance;

public class ElegxomenosLogariasmos extends Logariasmos {
    
    /*Ειδικός τύπος λογαριασμού. Επιβάλει ποινή 0.5 ευρώ 
    για κάθε τρεις συναλλαγές
    */

    private int metritisSynallagon;
    
    public ElegxomenosLogariasmos (double arxikoPoso) {
        
        /*Φτιάχνει ένα λογαριασμό με αρχικό υπόλοιπο όσο το arxikoPoso
        και μηδενίζει το μετρητή συναλλαγών
        */
  
    }
    
    @Override    
    public void katathesi(double poso) { 
        
        /*Κάνει override την katathesi στη γονική κλάση,
         αυξάνει το μετρητή συναλλαγών κατά ένα,
         ελέγχει αν ο metritisSynallagon % 3 == 0 και καλεί
         την afairesiTelous για την επιβολή ποινής. */
        
        //πρέπει να καλεί την αντίστοιχη katathesi της γονικής κλάσης  
    }
    
    public void afairesiTelous() {
        ypoloipo -= 0.5;
    }
    
    public String toString() {
        //πρέπει να επιστρέφει ένα string της μορφής
        //Elegxomenos Logariasmos. Ypoloipo 1000eur, Synallages 15
        
    }
    
}

