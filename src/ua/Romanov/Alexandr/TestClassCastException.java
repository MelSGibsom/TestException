package ua.Romanov.Alexandr;

public class TestClassCastException {
    void cast() {
        try {
            String s = new String("asdfsdfd");
            Object o = (Object)s;
            Object o1 = new Object();
            String s1 = (String)o1;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    void castBAd(){
        String s = new String("ccxvcc");
        Object o = (Object)s;
        Object o1 = new Object();
        String s1 = (String)o1;
    }
}
