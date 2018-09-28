package bridge.loggerBlinovRomanchick;

public abstract class Logger {

    protected LoggerImplementor loggerImplementor;

    public Logger() {

    }

    public Logger(LoggerImplementor loggerImplementor) {
        this.loggerImplementor = loggerImplementor;
    }

    public void setLoggerImplementor(LoggerImplementor loggerImplementor) {
        this.loggerImplementor = loggerImplementor;
    }

    public abstract void log();
}
