
public class Equation {
    // Instance variables
    private String operation;
    private double result, leftVal, rightVal;
    private Equation leftOperand, rightOperand;
    private int weight;
    
    // Constructors
    public Equation() { leftOperand = null; rightOperand = null; result = 0; leftVal = 0; rightVal = 0;}
    public Equation(double val1, String operator, double val2) { leftVal = val1; operator = operation; rightVal = val2; }
    
    // ===========================
    // === Mutators/Observers  ===
    // ===========================
    public void setOperation(String operation) { this.operation = operation; }
    public String getOperation() { return operation; }
    public void setLeftVal(double val) { leftVal = val; }
    public double getLeftVal() { return leftVal; }
    public void setRightVal(double val) { rightVal = val; }
    public double getRightVal() { return rightVal; }
    public void setLeftOperand(Equation leftOperand) { this.leftOperand = leftOperand; }
    public Equation getLeftOperand() { return leftOperand; }
    public void setRightOperand(Equation rightOperand) { this.rightOperand = rightOperand; }
    public Equation getRightOperand() { return rightOperand; }
    public int getWeight() { return weight; }
    
    public void setWeight() { 
        //String[] operations = { "-", "*", "+", "/" };
        if (operation.equals("+") || operation.equals("-")) { weight = 0; }
        else { weight = 1; }
        
    }
            // ==================
            // === Get Result ===
            // ==================
    public double getResult() { result = performOperation(); return result; }
    
    // ==================
    // == Computations ==
    // ==================
    
    // Decide which operation should be executed and assign weights
    private double performOperation() {
        if (operation.equals("-")) { return subtraction(); }
        else if (operation.equals("+")) { return addition(); }
        else if (operation.equals("*")) { return multiplication(); }
        else if (operation.equals("/")) { return division(); }
        else { return -999999999; }
    }
    
    // Calculation methods for +, -, *, /
    private double subtraction() { return leftVal - rightVal; }
    private double addition() { return leftVal + rightVal; }
    private double multiplication() { return leftVal * rightVal; }
    private double division() { return leftVal / rightVal; }
    
    // =====
    // To String
    // =====
    
    public String toString() {
        return String.format("%-10s%-12f%n%-10s%-12s%n%-10s%-12f%-10s%-1d", "leftVal: ", leftVal, "Operation: ", operation, "rightVal: ", rightVal, "weight: ", weight);
    }
    
}
