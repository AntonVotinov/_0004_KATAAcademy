package D20220806;

public class Main {
    public static void main(String[] args) {
        new Main().someMethod();
    }
    void someMethod() {
        try {
            System.out.println("Try");
            throw new Error();
        } catch (Error e) {
            System.out.println("Catch");
        }
    }
}
