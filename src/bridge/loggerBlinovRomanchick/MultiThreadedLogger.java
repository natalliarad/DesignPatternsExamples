package bridge.loggerBlinovRomanchick;

public class MultiThreadedLogger implements LoggerImplementor {

    @Override
    public void logToConsole() {
        System.out.println("Multithreaded console log");
    }

    @Override
    public void logToFile() {
        System.out.println("Multithreaded file log");
    }

    @Override
    public void logToSocket() {
        System.out.println("Multithreaded socket log");
    }
}
