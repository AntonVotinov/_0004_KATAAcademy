package D20220808;

public class MAIN {
    public static void main(String[] args) {
/*        System.out.println(getCallerClassAndMethodName());*/
        anotherMethod();
    }
    private static void anotherMethod() {
        System.out.println(getCallerClassAndMethodName());
    }
    public static String getCallerClassAndMethodName() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length <= 3) {
            return null;
        }
        for (int i = 0; i < stackTrace.length ; i++) {
            System.out.println(stackTrace[i]);
        }
        return stackTrace[stackTrace.length-1].getClassName() + "#" + stackTrace[stackTrace.length-1].getMethodName();
    }
}

