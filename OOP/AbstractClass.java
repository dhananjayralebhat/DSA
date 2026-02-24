import java.util.*;
public class AbstractClass{
    abstract static class Phone{
        public void Phone1(){
            System.out.println("hi");
        }
        abstract public void phone2();
    }
    static class SmartPhone extends Phone{
        public void phone2(){
            System.out.println("abc");
        }
    }
    public static void main(String[] args) {
        Phone s1 = new SmartPhone();
        s1.phone2();
    }
}