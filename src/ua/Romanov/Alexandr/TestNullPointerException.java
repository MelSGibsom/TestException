package ua.Romanov.Alexandr;

public class TestNullPointerException {
    String string = "bla-bla-bla";
    String string1 = null;

    public String meth() {
        String s = null;
        try {
            s = string.concat(string1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        String s1 = s;
        return s;
    }

    public String meth1() {
        String s2 = null;
        try {
            String s = "Yes, yes, ";
            String s1 = "www";
            s1 = string;
            s2 = s.concat(s1);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return s2;

    }
}

