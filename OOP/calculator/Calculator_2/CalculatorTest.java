import java.util.*;

public class CalculatorTest { 
    public static void main(String[] args) {
        // ================================================
        // Initialized with user input from internal method
        // ================================================
        /*
        Scanner userIn = new Scanner(System.in);
        Calculator testCalc = new Calculator();
        testCalc.getUserInput(userIn);
        testCalc.getResult();
        */
        
        // ========================================================
        // Initialized with an array of Strings, one item at a time
        // ========================================================
        /* 
        Calculator testCalc = new Calculator();
        String[] dojoInput = {"10.5", "+", "5.2", "*", "10", "="};
        for (int i = 0; i < dojoInput.length; ++i) { testCalc.performOperation(dojoInput[i]); }
        testCalc.getResult();
        */
        
        // =========================
        // Initialized with an array
        // =========================
        
        String[] dojoInput = {"10.5", "+", "5.2", "*", "10"};
        Calculator testCalc = new Calculator(dojoInput);
        testCalc.getResult();
        
    }
}
