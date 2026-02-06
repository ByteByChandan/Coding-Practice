import java.util.Scanner;
class cat{
    void walk(){
        System.out.println("cat Walk with his 4 legs");
    }
    void eat(){
        System.out.println("cat eats fish and milk");
    }
}
class fish extends cat{
    void walk(){
        System.out.println("A fish has no legs");
    }
    void Swim(){
        System.out.println("it can swims in water");
    }
}
public class method_overriding {
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        System.out.println("This is eaxmple of method overriding");
        fish obj=new fish();
        obj.walk();
        obj.Swim();
        obj.eat();
    }
}
