package Solid.SingleResponsibility.wrong;

class EmployeeOperation implements IEmployeeOperation{

    @Override
    public void addEmployee(Employee employee) {
        System.out.println("Çalışan bilgisi eklendi.");
    }

    @Override
    public Employee getEmployeeById(int id) {
        return null;
    }

    @Override
    public void sendEmail(Employee employee, String emailContent) {
        System.out.println("E-posta gönderildi.");
    }

    @Override
    public void sendHTMLEmail(Employee employee, String emailContent) {

    }
}
