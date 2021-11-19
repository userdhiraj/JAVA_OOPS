package practice;


class CellPhoneDetails {
    public void ring(){
        System.out.println("Ringing");
    }
    public void vibrate(){
        System.out.println("Vibrating");
    }
    public void calling(){
        System.out.println("Calling");
    }
}
public class CellPhone{
    public static void main(String[] args) {
        CellPhoneDetails phone= new CellPhoneDetails();
        phone.calling();
        phone.ring();
        phone.vibrate();
    }
}
