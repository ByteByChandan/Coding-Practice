import java.util.Scanner;
class animal{
    public void walk(){
        System.out.println("Animal walks with 4 legs");

    }
}
class dog extends animal{
    public void walk(){
        super.walk();
        System.out.println("dog has 4 legs");
    }
}
public class method_overriding_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        dog d = new dog();
        d.walk();
    }
}
