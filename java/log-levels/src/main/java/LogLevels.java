public class LogLevels {

    public static String message(String logLine) {
        // task 1: Get message from a log line

        // find message after log level + colon
        Integer colonIndex = logLine.indexOf(":");
        StringBuilder messageResult = new StringBuilder();

        for (int i = (colonIndex + 1); i < logLine.length(); i++) {
            // we need to go through each char in the index range
            char currentChar = logLine.charAt(i);
            // append each character to our string builder
            messageResult.append(currentChar);
        }

        // convert to string + remove any trailing whitespace
        return messageResult.toString().trim();
    }

    public static String logLevel(String logLine) {
        // task 2: Get log level from a log line

        // find the opening square bracket
        Integer openBracketIndex = logLine.indexOf("[");
        Integer closeBracketIndex = logLine.indexOf("]");
        // List<Character> logLevelList = new ArrayList<>();
        StringBuilder logLevelResult = new StringBuilder();

        // use a for loop that goes through the range and add the characters to the log
        // level list
        for (int i = (openBracketIndex + 1); i < closeBracketIndex; i++) {
            // we need to go through each char in the index range
            char currentChar = logLine.charAt(i);
            logLevelResult.append(currentChar);
        }

        // return the log level (lowercase result)
        return logLevelResult.toString().toLowerCase();

    }

    public static String reformat(String logLine) {
        // task 3: reformat a log line
        // ex: "Operation completed (info)"

        // use logLevel() to find the lowercase log level + save as a variable
        String logLevel = logLevel(logLine);

        // use message to find the message string
        String message = message(logLine);

        // return reformatted combination of above results
        String result = message + " (" + logLevel + ")";
        return result;
    }
}
