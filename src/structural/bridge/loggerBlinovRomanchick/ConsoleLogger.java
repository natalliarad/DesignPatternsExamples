package structural.bridge.loggerBlinovRomanchick;

public class ConsoleLogger extends Logger {

    public ConsoleLogger() {
    }

    ConsoleLogger(final LoggerImplementor loggerImplementor) {
        super(loggerImplementor);
    }

    @Override
    public void log() {
        loggerImplementor.logToConsole();
    }
}
