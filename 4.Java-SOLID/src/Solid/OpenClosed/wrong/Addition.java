package Solid.OpenClosed.wrong;

class Addition implements  IOperation {

    private double firstOperand;
    private double secondOperand;
    private double result;

    Addition(){
        result = 0;
    }

    Addition(double firstOperand, double secondOperand){
        this.firstOperand = firstOperand;
        this.secondOperand = secondOperand;
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
