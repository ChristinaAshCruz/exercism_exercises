class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder stbd = new StringBuilder();

        // initiate a for loop that will loop through each char
        for (int i = 0; i < identifier.length(); i++) {
            // create a char variable that will hold our current char
            char currentChar = identifier.charAt(i);
            // check whether our 'currentChar' is a letter value
            // AND check whether currentChar is not a greek letter
            if (!(Character.isLetter(currentChar)) && (currentChar >= 'α') && (currentChar <= 'ω')) {
                // if so, add no value to our stbd
                stbd.append("");
            }
            // if our currentChar is a whitespace, add an underscore instead
            else if (Character.isWhitespace(currentChar)) {
                stbd.append("_");
            }
            // if our currentChar is an ISO Control character, add "CTRL" instead
            else if (Character.isISOControl(currentChar)) {
                stbd.append("CTRL");
            } else if (currentChar == '-' && Character.isLetter(identifier.charAt(i + 1))) {
                stbd.append(Character.toUpperCase(identifier.charAt(i + 1)));
            } else {
                stbd.append(currentChar);
            }

        }
        String finalOutput = stbd.toString();
        // return our new stbd (converted to string) result
        return finalOutput;
    }

}
