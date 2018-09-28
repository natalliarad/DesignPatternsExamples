package bridge.loggerBlinovRomanchick;

public class ConsoleLogger extends Logger {

    public ConsoleLogger() {
    }

    public ConsoleLogger(LoggerImplementor loggerImplementor) {
        super(loggerImplementor);
    }

    @Override
    public void log() {
        loggerImplementor.logToConsole();
    }
}
