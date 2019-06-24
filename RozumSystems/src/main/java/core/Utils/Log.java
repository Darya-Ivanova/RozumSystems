package core.Utils;

import java.util.logging.Logger;

public class Log {
    private static Logger getLog(String className) {
        return Logger.getLogger(className);
    }

    private static String getClassname() {
        StackTraceElement[] stackTrace = (new Throwable()).getStackTrace();
        return stackTrace[2].getClassName();
    }

    public static void info(String message) {
        getLog(getClassname()).info(message);
    }
}
