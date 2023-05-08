import java.time.LocalDate;

public class Employee {
    private String name;
    private Double salary;
    private LocalDate hireDay;

    public Employee(String name , Double salary , int year , int month , int day){
        this.name = name;
        this.salary = salary;
        hireDay = LocalDate.of(year,month,day);
    }

    public String getName(){
        return name;
    }
    public double getSalary() {
        return salary;
    }
    public LocalDate getHireDay(){
        return hireDay;
    }
    public void raisesalary(double byPerent){
        double raise = salary * byPerent;
        salary += raise;
    }
}
