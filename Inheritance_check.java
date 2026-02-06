class vehicle{
     vehicle(){
        System.out.println("this is a vehicle");
    }

}
class bike extends vehicle{
     bike(){
        System.out.println("this is a bike");
    }

}
class bullet extends bike{
     bullet(){
        System.out.println ("this is a bullet bike");
    }

}
public class Inheritance_check {
    public static void main(String []args){
        bullet obj=new bullet();
//        obj.bullet();
//        obj.bike();
//        obj.vehicle();
    }
}
