package config;

public class Utilities {
    public static void sleep (int timeout){
        try {
            Thread.sleep(timeout);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
