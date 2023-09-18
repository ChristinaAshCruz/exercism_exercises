import java.lang.StringBuilder;

class SqueakyClean {
    static String clean(String identifier) {
        // task 1
        identifier = identifier.replaceAll(" ", "_");
        // task 2: replace all control char first
        // then remove all other non letter characters
        identifier = identifier.replaceAll("\\p{Cntrl}", "CTRL");
        String regex = "[^\\p{L}\\p{N}\\p{P}\\p{Z}]";
        identifier = identifier.replaceAll(regex, "");
        // task 4 + 5: omit lower case Greek letter and numbers
        identifier = identifier.replaceAll("[α-ω0-9]", "");

        // task 3: Convert kebab-case to camelCase
        if (identifier.contains("-")) {
            StringBuilder result = new StringBuilder();
            boolean upCaseFlag = false;

            // for every character in our identifier string
            for (char ch : identifier.toCharArray()) {
                // if that character is a hyphen...
                if (ch == '-') {
                    upCaseFlag = true;
                } else {
                    // if the current char is NOT a hyphen...
                    // we need to check whether the current char's upCaseFlag is true
                    // if the char's upCaseFlag is TRUE...
                    if (upCaseFlag) {
                        result.append(Character.toUpperCase(ch));
                        upCaseFlag = false;
                    } else {
                        // if the char's upCaseFlag is FALSE...
                        result.append(ch);
                    }
                }
            }

            return result.toString();
        } else {
            // if our identifier is clean and does not contain hyphens...
            // return result as is
            return identifier;
        }
    }
}