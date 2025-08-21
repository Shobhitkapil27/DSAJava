package DesignPatterns;

public class Singleton {
    public static void main(String[] args) {
        Test t1=Test.getInstance();
        Test t2=Test.getInstance();
        System.out.println(t1);
        System.out.println(t2);
    }
}

class Test {
    // Volatile ensures changes made by one thread are visible to others
    private static volatile Test instance;

    // Private constructor prevents instantiation from outside
    public Test() {
        System.out.println("Test instance created");
    }

    // Public method to provide access to the instance
    public static Test getInstance() {
        if (instance == null) {
            synchronized (Test.class) { // Thread-safe block
                if (instance == null) {
                    instance = new Test();
                }
            }
        }
        return instance;
    }

    // Example method
    public void showMessage() {
        System.out.println("Hello from Test!");
    }
}

