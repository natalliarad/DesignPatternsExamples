package structural.bridge.loggerBlinovRomanchick;

public abstract class Logger {

    LoggerImplementor loggerImplementor;

    Logger() {

    }

    Logger(LoggerImplementor loggerImplementor) {
        this.loggerImplementor = loggerImplementor;
    }

    void setLoggerImplementor(LoggerImplementor loggerImplementor) {
        this.loggerImplementor = loggerImplementor;
    }

    public abstract void log();
}
