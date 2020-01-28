

public class Calculator implements java.io.Serializable {
    private double operandOne;
    private double operandTwo;
    private String operation;
    private double result;
    
    public Calculator() { }
    
    public double getOperandOne() { return operandOne; }
    public void setOperandOne(double operandOne) { this.operandOne = operandOne; }
    public double getOperandTwo() { return operandTwo; }
    public void setOperandTwo(double operandTwo) { this.operandTwo = operandTwo; }
    public void setOperation(String operation) { this.operation = operation; }
    public double getResult() { return result; }
    
    public void performOperation() {
        if (operation.equals("+")) { result = performAddition(); }
        else if (operation.equals("-")) { result = performSubtraction(); }
    }
    
    public double performSubtraction() { return operandOne - operandTwo; }
    public double performAddition() { return operandOne + operandTwo; }
}
