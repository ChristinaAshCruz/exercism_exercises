import java.util.ArrayList;
import java.util.List;

public class LogLevels {

    public static String message(String logLine) {
        // task 1: Get message from a log line

        // remove any trailing whitespace
        logLine.trim();
        return logLine;

        // throw new UnsupportedOperationException("Please implement the (static)
        // LogLine.message() method");
    }

    public static String logLevel(String logLine) {
        // task 2: Get log level from a log line

        // find the opening square bracket
        Integer openBracketIndex = logLine.indexOf("[");
        Integer closeBracketIndex = logLine.indexOf("]");
        List<Character> logLevelList = new ArrayList<>();

        // use a for loop that goes through the range and add the characters to the log
        // level list
        for (int i = (openBracketIndex + 1); i < closeBracketIndex; i++) {
            // we need to go through each char in the index range
            char currentChar = logLine.charAt(i);
            logLevelList.add(currentChar);
        }

        return logLevel;

        // throw new UnsupportedOperationException("Please implement the (static)
        // LogLine.logLevel() method");
    }

    public static String reformat(String logLine) {
        throw new UnsupportedOperationException("Please implement the (static) LogLine.reformat() method");
    }
}
