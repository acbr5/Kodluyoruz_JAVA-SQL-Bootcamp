package Solid.OpenClosed.wrong;

import java.security.InvalidParameterException;

class BasicCalculator implements ICalculator{

    @Override
    public void calculate(IOperation operation) {
        if(operation == null){
            //System.out.println("İşlem Girilmedi");
            throw new InvalidParameterException("İşlem Girilmedi!");
        }

        //instanceof, bu türde mi anlamında kullanılır
        if(operation instanceof Addition){
            Addition addition = (Addition) operation;
            addition.setResult(addition.getFirstOperand() + addition.getSecondOperand());
        }
        else if(operation instanceof Substraction){
            Substraction substraction = (Substraction) operation;
            substraction.setResult(substraction.getFirstOperand() - substraction.getSecondOperand());
        }
        // diğer bütün hesaplama (çarpma, bölme, karekök vs) işlemleri için ayrı ayrı else-if yazmak zorundayız.
        
    }

}
