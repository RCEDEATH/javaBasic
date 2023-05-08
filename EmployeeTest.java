import java.time.*;

public class EmployeeTest {
    static class Employee {
        private String name;
        private double salary;
        private LocalDate hireDay;
        private static int nextId = 1;
        private int id;


        public Employee(String n, double s){//,int year, int month, int day) {
            name = n;
            salary = s;
            id = 0;
            //hireDay = LocalDate.of(year, month, day);
        }

        public String getName() {
            return name;
        }

        public double getSalary() {
            return salary;
        }

       // public LocalDate getHireDay() {
       //     return hireDay;
       // }
        public int getId(){
            return id;
        }
        public static int getNextId(){
            return nextId;
        }
        //public void raiseSalary(double byPerent) {
        //    double raise = salary * byPerent / 100;
        //    salary += raise;
        //}

        public void setId(){
            id = nextId;
            nextId++;
        }
        public static void main(String[] arg) // 可以在类里面进行单元测试
        {
            Employee e = new Employee("Harry",50000);
            System.out.println(e.getName()+" "+e.getSalary());

        }
    }
    public static void main(String[] arg){
        Employee[] staff= new Employee[3];
        //Employee harry = new Employee("Harry",75000,1978,7,8);
        //staff[0] = new Employee("Carl Cracker",75000,1987,12,15);
        //staff[1] = new Employee("Harry Hacker",50000,1989,10,1);
        //staff[2] = new Employee("Tony Teser",40000,1990,3,15);
        staff[0] = new Employee("Tom",40000);
        staff[1] = new Employee("Dick",60000);
        staff[2] = new Employee("Harry",65000);

        for(Employee e : staff){
            e.setId();
            System.out.println("name="+e.getName()+" , salary="+e.getSalary()+" , id="+e.getId());
        }
       // System.out.println(harry.id);
        int n = Employee.getNextId();
        System.out.println(n);
        //for (Employee e : staff)
        //    e.raiseSalary(5);
        //for (Employee e : staff)
        //   System.out.println("name="+e.getName()+",salary"+e.getSalary()+",hireday="+e.getHireDay());
    }
}
