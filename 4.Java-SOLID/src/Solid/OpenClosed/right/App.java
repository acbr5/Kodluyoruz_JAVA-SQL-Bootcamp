package Solid.OpenClosed.right;

public class App {

    public static void main(String[] args) throws Exception{

        BasicCalculator calculator = new BasicCalculator();
        IOperation operation = new Multiplication(12, 6);
        calculator.calculate(operation);

    }

}
