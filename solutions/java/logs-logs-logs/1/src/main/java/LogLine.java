public class LogLine {
    private String logLine;
    public LogLine(String logLine) {
        this.logLine = logLine;
    }

    public LogLevel getLogLevel() {
        String logLevelString = this.logLine.split(": ")[0];
        switch (logLevelString) {
            case "[TRC]":
                return LogLevel.TRACE;
            case "[DBG]":
                return LogLevel.DEBUG;
            case "[INF]":
                return LogLevel.INFO;
            case "[WRN]":
                return LogLevel.WARNING;
            case "[ERR]":
                return LogLevel.ERROR;
            case "[FTL]":
                return LogLevel.FATAL;
            default:
                return LogLevel.UNKNOWN;
        }
    }

    public String getOutputForShortLog() {
        LogLevel logLevel = this.getLogLevel();
        String logContent = this.logLine.split(": ")[1];
        int logLevelNumber = 0;

        switch (logLevel) {
            case LogLevel.UNKNOWN:
                logLevelNumber =  0;
                break;
            case LogLevel.TRACE:
                logLevelNumber =  1;
                break;
            case LogLevel.DEBUG:
                logLevelNumber =  2;
                break;
            case LogLevel.INFO:
                logLevelNumber =  4;
                break;
            case LogLevel.WARNING:
                logLevelNumber =  5;
                break;
            case LogLevel.ERROR:
                logLevelNumber =  6;
                break;
            case LogLevel.FATAL:
                logLevelNumber =  42;
                break;
        };
        return String.format("%d:%s", logLevelNumber, logContent);
    }
}
