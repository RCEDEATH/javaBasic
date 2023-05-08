public class ManagerTest {
    public static void main(String[] arg){
        Manager boss = new Manager("Carl Cracker",80000.00,1987,12,5);
        Manager[] managers = new Manager[10];
        boss.setBonus(5000.00);

        Employee[] Staff = new Employee[3];
        Employee[] Staff1 = managers;

        Staff[0] = boss;
        Staff[1] = new Employee("Harry Hacker",50000.00,1989,10,1);
        Staff[2] = new Employee("Tony Tester",40000.00,1990,3,15);
        //each one salary put
        for (Employee e : Staff){
            System.out.println("name = "+e.getName()+" and salary = "+e.getSalary());
        }
    }
}
