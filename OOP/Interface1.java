import java.util.*;
public class Interface1{
    interface phone{
        void phone1();
        void phone2(int n);
    }
    interface smartPhone extends phone{
        void smartPhone1(int a);
    }
    static class telePhone implements smartPhone{
        @Override
        public void phone1() {
            System.out.println("hi");
        }
        @Override
        public void phone2(int n) {
            System.out.println("hello");
        }
        public void smartPhone1(int a){
            System.out.println("xyz");
        }
    }
    public static void main(String[] args) {
        telePhone t1 = new telePhone();

        t1.phone1();
        t1.phone2(4);
        t1.smartPhone1(2);
    }
}