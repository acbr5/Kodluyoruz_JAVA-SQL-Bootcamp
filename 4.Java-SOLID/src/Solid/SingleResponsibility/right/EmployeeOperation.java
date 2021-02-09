package Solid.SingleResponsibility.right;

// Çalışanlara farklı şekillerde e-posta gönderilebilir. Wrong paketinde sadece iki tanesi için metot yazıldı.
// Fakat daha fazla yazıldığında kodun okunabilirliği düşecektir.
// Bu yüzden e-posta göndermek için sadece e-posta göndermek için soyutlama yapılması gerekir.
// Buradaki temel amaç bütün sorumlulukları soyutlayarak ayrık hale getirmek.
// Bu çalışan-eposta örneği dışında birden fazla ödeme yöntemi sunan programlar için de benzer bir yapı oluşturulabilir.

class EmployeeOperation implements IEmployeeOperation {
    private IEmailSender emailSender;
    private EmailContent emailContent;

    EmployeeOperation(){
        emailContent = new EmailContent();
    }

    @Override
    public void addEmployee(Employee employee) {
        emailContent.setType("HTML");
        emailContent.setContent("Ekibimize katıldığınız için teşekkür ederiz.");
        emailSender.sendEmail(employee, emailContent);
        System.out.println("Çalışan bilgisi eklendi.");
    }

    @Override
    public Employee getEmployeeById(int id) {
        return null;
    }
}
