public class CalculatorTest {
    public static void main(String[] args) {
        Calculator testCalc = new Calculator();
        testCalc.setOperandOne(10.5);
        testCalc.setOperation("+");
        testCalc.setOperandTwo(5.2);
        testCalc.performOperation();
        System.out.println(testCalc.getResult());
    }
}
