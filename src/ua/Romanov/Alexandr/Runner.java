package ua.Romanov.Alexandr;

public class Runner extends TestNullPointerException {


    public static void main(String[] args) {

        System.out.println(new TestNullPointerException().meth());
        System.out.println(new TestNullPointerException().meth1());
        System.out.println(new TestIllegalArgumentException(-34, 23).getAge());
        System.out.println(new TestIllegalArgumentException(-45, -24).geAge2());
        System.out.println(TestIllegalStateException.getStateException());
        System.out.println(TestIllegalStateException.getStateExcBad());
        // TestNoSuchMethodException.meth4();
        new TestClassCastException().cast();
        new TestClassCastException().castBAd();

    }
}
