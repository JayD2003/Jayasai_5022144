package exercise_1;

public class Singleton {
    public static void main (String args []){
        Logger instance1 = Logger.getInstance();
        Logger instance2 = Logger.getInstance();
        
        instance1.displayLog("Hi, I'm The First Logger");
        instance2.displayLog("Hi, I'm The Second Logger");
        
        if (instance1 == instance2)
        System.out.println("We are of Same Instance");
        
        else 
         System.out.println("We are of Different Instance");
    
    }
}
