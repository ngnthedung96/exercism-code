class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation)  throws IllegalOperationException,IllegalArgumentException  {
        if(operation == null){
            throw new IllegalArgumentException("Operation cannot be null");
        };
        if(operation.isEmpty()){
            throw new IllegalArgumentException("Operation cannot be empty");
        }
        switch (operation) {
            case "+":{
                int result = operand1 + operand2;
                return String.format("%d + %d = %d", operand1, operand2, result);
            }
            case "*":{
                int result = operand1 * operand2;
                return String.format("%d * %d = %d", operand1, operand2, result);
            }
            case "/":{
                if (operand2 == 0) {
                    throw new IllegalOperationException("Division by zero is not allowed", new ArithmeticException());
                }
                int result = operand1 / operand2;
                return String.format("%d / %d = %d", operand1, operand2, result);
            }

            default:
                throw new IllegalOperationException(String.format("Operation '%s' does not exist", operation));
        }
    }

    public static void main(String[] args) {
        try{
            String result = new CalculatorConundrum().calculate(3, 78, null);
            System.out.println(result);
        } catch (IllegalOperationException e) {
            System.out.println("IllegalOperationException: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException: " + e.getMessage());

        }

    }
}
