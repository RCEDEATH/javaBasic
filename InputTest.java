//import java.io.Console;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class InputTest {
    public static void main(String[] arg){
        Date deadline = new Date();
        LocalDate.now();
        LocalDate newYearsEve = LocalDate.of(2022,8,18);
        LocalDate aTousandDaysLater = newYearsEve.plusDays(1000);

        int year = newYearsEve.getYear();
        int day = newYearsEve.getDayOfMonth();
        int month = newYearsEve.getMonthValue();
        int day2 = newYearsEve.getDayOfYear();
        year = aTousandDaysLater.getYear();
        System.out.println(year+"-"+month+"-"+day+"-"+day2);
        deadline = null;
        if(deadline != null)
            System.out.println(deadline);

        int[] a = new int[10];
        int[] copy_a = Arrays.copyOf(a,a.length);
        double x = 1000000000.0/3.0;
        String name = "jyw";
        int age = 23;
        String message = String.format("Hello,%s.Next year,you'll be %d",name,age);
        for(int i=0;i<=9;i++){
            a[i] = i;
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(copy_a));
        for(int element : a) {
            System.out.println(element);
        }
        for (int copy_element : copy_a) {
            System.out.println(copy_element);
        }
       //Scanner in = new Scanner (System.in);
       /// Console cons = System.console();

       ////System.out.print("User name:");
       ////String us ename = cons.readLine("User name");
       ////System.out.print("Password:");
       ////char[] password = cons.readPassword();
       ////System.out.println("Username is "+usename+"password is "+password);
       //System.out.println("What is your name? ");
       //String name = in.next();
       //System.out.println("How old are you");
       //int age = in.nextInt();
       //double x =in.nextDouble();
       //boolean  = in.hasNext();

       // System.out.println("Hello,"+name+".Next year,you'll be "+(age+1)+"--"+x);
        System.out.println(message);
        System.out.printf("%g",100000.0/3.0);
        System.out.printf("%1$H",new Date());

    }
}
