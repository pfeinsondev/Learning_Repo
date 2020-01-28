import java.util.*;

public class Calculator {
    private String rawEquation;
    private String [] expressions;
    private Equation root;
    private boolean initializedWithArray = false;
    
    
    public Calculator() { this(""); }
    public Calculator(String[] expressions) { this.expressions = expressions; initializedWithArray = true; convertToEquations(); }
    public Calculator(String rawEquation) { this.rawEquation=rawEquation; root=null; }
    
    public void setRoot(Equation root) { this.root = root;}
    // =======================================
    // === Collects raw equation from user === 
    // = Requiers a Scanner object be passed =
    // =======================================
    public void getUserInput(Scanner input) { 
        String userIn = "";
        System.out.println("Please enter as many expressions as you like in the format \n(integer)\n(operation)\n(integer)\nEnter \"=\" to compute\n");
        userIn = input.next();
        while (!userIn.equals("=")) { 
            rawEquation += userIn + ":";
            userIn = input.next();
        }
        convertToEquations();
        //System.out.println("Equation stored! Successful execution of getUserInput(Scanner)");
    }
    
    // If using internal Scanner:
    //      Splits the rawEquation string into appropriate members in expressions String[]
    public void processRawEquation() {
        expressions = rawEquation.split(":", 0); 
    }
    
    // ===================================================
    // === For use with coding dojo sample interaction ===
    // ===================================================
    public void performOperation(String input) {
        if (input.equals("=")) { convertToEquations(); }
        else { rawEquation += input + ":"; }
    }
    
    public void getResult() {
        System.out.println(compute());
    }
    
    
    public void resizeArray() {
        String[] temp = new String[expressions.length - 1];
        for (int i = 0; i < temp.length; ++i) { temp[i] = expressions[i]; }
        expressions = temp;
    }
    // ================================================================
    // === Store the given equation as a series of Equation objects ===
    // ================================================================
    public void convertToEquations() {
        if (initializedWithArray) 
            if (expressions[expressions.length-1].equals("=")) 
                resizeArray();
        // Local variables
        if (!initializedWithArray) { processRawEquation(); }  
        Equation focus; // Equation Pointer
        String[] items = expressions;
        int itemNumber = 3;
        String singleOperation;
        double val1 = 0;
        double val2 = 0;
        boolean boolSingleOperation = false;
        boolean boolVal1 = false; 
        boolean boolVal2 = false;
        
        // manual assignment (start at itemNumber = 2;
        if (tryParse(items[0])) { val1 = Double.parseDouble(items[0]); boolVal1 = true;}
        singleOperation = items[1]; boolSingleOperation = false;  
        if (tryParse(items[2])) { val2 = Double.parseDouble(items[2]); boolVal2 = false;}
        
        this.setRoot(new Equation(val1, singleOperation, val2));
        root.setLeftVal(val1); root.setRightVal(val2); root.setOperation(singleOperation);
        // Shift pointer/storage
        focus = root;
        val1 = val2; 
        
        while (itemNumber < expressions.length || (boolVal1 && boolVal2 && boolSingleOperation) ) { // While there are untouched items
                if (boolVal1 && boolVal2 && boolSingleOperation) { // if data is ready
                    focus.setRightOperand(new Equation(val1, singleOperation, val2)); // create new Equation to the right of this one
                    focus.getRightOperand().setLeftOperand(focus); // set the new Equation's left operand to this Equation
                    focus = focus.getRightOperand(); // Move focus to the rightOperand
                    focus.setLeftVal(val1); focus.setRightVal(val2); focus.setOperation(singleOperation);
                    val1 = val2; boolVal2 = false; boolSingleOperation = false;} // Shift data for next cycle
                else if (!boolSingleOperation) { singleOperation = items[itemNumber++]; boolSingleOperation = true; } // if singleOperation is null set it
                else if (!boolVal2) { if (tryParse(items[itemNumber])) val2 = Integer.parseInt(items[itemNumber++]); boolVal2 = true; } // if val2 is mull set it
        }
        
        setWeights();
    }
    

    
    // ============================
    // === Set Equation Weights ===
    // ===    +/- (0) *// (1)   ===
    // ============================
    
    public void setWeights() {
        Equation focus = root;
        while (focus != null) {
            focus.setWeight();
            focus = focus.getRightOperand();
        }
    }
    // ================================
    // === Solve the given Equation ===
    // ================================
    public double compute() {
        Equation focus = root;
        while (focus.getRightOperand() != null || focus.getLeftOperand() != null) { 
            if (focus.getRightOperand() != null && focus.getRightOperand().getWeight() > focus.getWeight()) {
                focus.setRightVal(focus.getRightOperand().getResult());
                if (focus.getRightOperand().getRightOperand() != null) {
                    focus.setRightOperand(focus.getRightOperand().getRightOperand());
                    focus.getRightOperand().setLeftOperand(focus);
                    focus.getRightOperand().setLeftVal(focus.getRightVal());
                } else { focus.setRightOperand(null); }
            } else {
                System.out.println(focus.getRightOperand());
                focus.getRightOperand().setLeftVal(focus.getResult());
                focus.getRightOperand().setLeftOperand(null);
                focus = focus.getRightOperand();
            } 
            
        }
        return focus.getResult();
    }
    
    // Verifys a String can be stored as a digit
    private boolean tryParse(String input) {
        try {
            Double.parseDouble(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
    public String printEquations() {
        Equation focus = root;
        String output = ""; 
        while (focus != null) { output += focus + "\n"; focus = focus.getRightOperand();  }
        return output;
    }
    
}
