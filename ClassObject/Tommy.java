package practice;

class TommyDetails{
    public void hit(){
        System.out.println("Hitting");
    }
    public void run(){
        System.out.println("Running");
    }
    public void fire(){
        System.out.println("Firing");
    }
}
public class Tommy {
   
    public static void main(String[] args) {
        
        TommyDetails player= new TommyDetails();
        player.fire();
        player.hit();
        player.run();
    }
}
