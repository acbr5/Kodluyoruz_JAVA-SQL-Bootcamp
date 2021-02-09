package Solid.SingleResponsibility.right;

// Interface olduğu belli olsun diye sınıfın ismi I ile başlar.
// Bu arayüzün implemente edileceği sınıf, bu sınıf ile baş harfi hariç aynı olmalıdır.
// IEmployeeOperation -> EmployeeOperation ya da
// EmployeeOperation -> EmployeeOperationImpl

interface IEmployeeOperation {

    // çalışan eklemek için metot
    public void addEmployee(Employee employee);

    // girilen id'ye sahip çalışan bilgilerini getirmek için metot
    public Employee getEmployeeById(int id);

}
