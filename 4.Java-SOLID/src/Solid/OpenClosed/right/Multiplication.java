package Solid.OpenClosed.right;

public class Multiplication implements IOperation {

    private double firstOperand;
    private double secondOperand;
    private double result;

    Multiplication(){
        result = 0;
    }

    Multiplication(double firstOperand, double secondOperand){
        this.firstOperand = firstOperand;
        this.secondOperand = secondOperand;
    }

    @Override
    public Double performOperation() {
        result = firstOperand * secondOperand;
        return result;
    }

    public double getFirstOperand() {
        return firstOperand;
    }

    public void setFirstOperand(double firstOperand) {
        this.firstOperand = firstOperand;
    }

    public double getSecondOperand() {
        return secondOperand;
    }

    public void setSecondOperand(double secondOperand) {
        this.secondOperand = secondOperand;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

}
