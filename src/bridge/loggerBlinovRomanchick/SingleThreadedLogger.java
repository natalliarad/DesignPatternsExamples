package bridge.loggerBlinovRomanchick;

public class SingleThreadedLogger implements LoggerImplementor {

    @Override
    public void logToConsole() {
        System.out.println("Single threaded console log");
    }

    @Override
    public void logToFile() {
        System.out.println("Single threaded file log");
    }

    @Override
    public void logToSocket() {
        System.out.println("Single threaded socket log");
    }
}
