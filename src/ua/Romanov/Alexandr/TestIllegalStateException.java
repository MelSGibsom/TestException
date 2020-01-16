package ua.Romanov.Alexandr;

public class TestIllegalStateException {
    static  TestIllegalStateException stateException;

    public static TestIllegalStateException getStateException()  {
        try {
if (stateException==null)
    throw new IllegalStateException();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
        return stateException;
    }
    public static TestIllegalStateException getStateExcBad(){
        return stateException;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
