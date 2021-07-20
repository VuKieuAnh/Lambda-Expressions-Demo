public class DemoClass {
    public static void useM1(IDemo iDemo){
        iDemo.m1();
    }

    public static void useM2(IDemo2 i){
        i.m2(3);
    }

    public static void useM3(IDemo3 i){
        i.m3(3, 4);
    }

    public static void useM4(IDemo4 i){
        System.out.println(i.m4(4));

    }
    public static void main(String[] args) {
//        useM1(()->{
//            System.out.println("Lan Anh Le Thi");
//        });
//
//        useM2(i->{
//            System.out.println(i +2);
//        });
//        useM3((a, b)->{
//            System.out.println(a+b);
//        });
//        useM3((a, b)->{
//            System.out.println(a*b);
//        });

        useM4(a -> {
            return a+2;
        });

    }
}
