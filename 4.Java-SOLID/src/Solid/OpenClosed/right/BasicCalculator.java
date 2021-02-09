package Solid.OpenClosed.right;

import java.security.InvalidParameterException;

// Diğer bütün hesaplama (çarpma, bölme, karekök vs) işlemleri için ayrı ayrı else-if yazmak zorundaydık.
// Uygulamayı geliştirmek için uygulamanın iskeletini değiştirmek zorunda olduğumuz için soyut sınıflardan faydalanacağız.
// Her işlemin içerisinde kendilerine özgü bir hesaplama mekanizması olması gerekiyor.

class BasicCalculator implements ICalculator {

    @Override
    public void calculate(IOperation operation) {
        if (operation == null) {
            //System.out.println("İşlem Girilmedi");
            throw new InvalidParameterException("İşlem Girilmedi!");
        }

        System.out.println("Sonuç: " + operation.performOperation());
    }
}
