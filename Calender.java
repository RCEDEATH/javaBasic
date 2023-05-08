import java.time.DayOfWeek;
import java.time.LocalDate;

public class Calender {
    public static void main(String[] arg){
        //日期初始化
        LocalDate date = LocalDate.now();//对象初始化，静态的工厂方法
        int month = date.getMonthValue();;
        int today = date.getDayOfMonth();
        System.out.println(month);
        // 设置当月的第一天
        date = date.minusDays(today-1);//生成当前日期之前today-1的日期刚好是每月1号
        DayOfWeek weekday = date.getDayOfWeek();
        int value = weekday.getValue();

        // 打印表头
        System.out.println("Mon Tue Wed Thur Fri Sat Sun");
        for (int i = 1 ; i < value ; i++)
            System.out.print("   ");
        // 打印主体
        while(date.getMonthValue() == month){
            System.out.printf("%3d",date.getDayOfMonth());
            if (date.getDayOfMonth() == today)
                System.out.print("*");
            else
                System.out.print(" ");
            date = date.plusDays(1);
            if(date.getDayOfWeek().getValue() == 1)
                System.out.println();
        }
        if(date.getDayOfWeek().getValue() != 1)
            System.out.println();
    }
}
