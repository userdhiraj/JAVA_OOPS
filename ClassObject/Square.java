package practice;
class SquareDetails{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}
public class Square {

    public static void main(String[] args) {
        SquareDetails sq = new SquareDetails();
        sq.side=5;
        System.out.println("Area=" +sq.area());
        System.out.println("Perimeter=" +sq.perimeter());
    }
    
}
