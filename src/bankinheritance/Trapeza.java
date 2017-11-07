package bankinheritance;

import java.util.ArrayList;

public class Trapeza {
    
    //αποτελείται από μια λίστα λογαριασμών με το όνομα accounts
    
    public void addAccount (Logariasmos account) {
        //προσθήκη λογαριασμού στη λίστα       
    }
    
    
    public String toString () {
        String s = "";
        for (Logariasmos account : accounts) {
            s += account.toString();
        }
        return s;
    }
}
