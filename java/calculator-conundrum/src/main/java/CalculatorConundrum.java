class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) throws IllegalOperationException {

        // creating a StringBuilder to append all of our operand and operations to when
        // we return at the end of our function
        StringBuilder finalString = new StringBuilder();

        // creating a int variable to hold our final total
        int total = 0;

        // if our operation is null
        if (operation == null) {
            // when null -> throw an IllegalArumentException
            throw new IllegalArgumentException("Operation cannot be null");
            // if our operation is empty
        } else if (operation.isEmpty()) {
            // when empty -> throw an IllegalArumentException
            throw new IllegalArgumentException("Operation cannot be empty");
            // if our operation is neither EMPTY or NULL...
        } else {
            // initiate a switch case that will check our operation
            switch (operation) {
                // ADDITION
                case "+":
                    total = operand1 + operand2;
                    finalString.append(operand1 + " " + operation + " " + operand2 + " = " + total);
                    break;
                // MULTIPLICATION
                case "*":
                    total = operand1 * operand2;
                    finalString.append(operand1 + " " + operation + " " + operand2 + " = " + total);
                    break;
                // DIVISION
                case "/":
                    // try this (if we recieve no error)
                    try {
                        total = operand1 / operand2;

                        finalString.append(operand1 + " " + operation + " " + operand2 + " = " + total);
                        // if we do recieve an error...
                    } catch (ArithmeticException e) {
                        throw new IllegalOperationException("Division by zero is not allowed", e);
                    }
                    break;
                // if our operation is NOT any of the above options...
                default:
                    // throw an IllegalOperationException with our message and cause
                    throw new IllegalOperationException(String.format("Operation '%s' does not exist", operation));
            }

            // if successful, convert our StringBuilder finalString to a string and return
            return finalString.toString();
        }

    }
}
