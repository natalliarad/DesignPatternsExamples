package bridge.loggerBlinovRomanchick;

public class FileLogger extends Logger {

    public FileLogger() {
    }

    public FileLogger(LoggerImplementor loggerImplementor) {
        super(loggerImplementor);
    }

    @Override
    public void log() {
        loggerImplementor.logToFile();
    }
}
