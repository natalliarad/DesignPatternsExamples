package structural.bridge.loggerBlinovRomanchick;

public class FileLogger extends Logger {

    public FileLogger() {
    }

    FileLogger(final LoggerImplementor loggerImplementor) {
        super(loggerImplementor);
    }

    @Override
    public void log() {
        loggerImplementor.logToFile();
    }
}
