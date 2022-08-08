package D20220808;

public class Stacktrace {
    public void anotherMethod1(){
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        for (int i = 0; i < stackTrace.length; i++) {
            System.out.println(stackTrace[i]);
        }
    }
}
