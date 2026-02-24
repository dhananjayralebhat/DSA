import java.util.*;
public class ConstructorsInheritance{
    static class Base1{
        Base1(){
            System.out.println("hello");
        }
        Base1(int x){
            System.out.println("dhananjay");
        }
    }
    static class Derived extends Base1{
        Derived(){
            super(0);
            System.out.println("hi");
        }
    }
    public static void main(String[] args) {
        Derived d1 = new Derived();
    }
}