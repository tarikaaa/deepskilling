package SingletonPatternExample;

public class SingletonTest {

    public static void main(String[] args) {

        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("First message");
        logger2.log("Second message");

        if (logger1 == logger2) {
            System.out.println("Singleton verified: only one Logger instance exists.");
        } else {
            System.out.println("Singleton failed: multiple Logger instances detected.");
        }
    }
}