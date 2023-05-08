/**
 * This id the first sample program in care
 */
public class FirstSample {
    public static void main(String[] args){
            StringBuilder builder = new StringBuilder();
            builder.append(23);
            String completedString = builder.toString();

            int x = 4;
            int age = 13;
            int anser = 14;
            String rating = "PG"+age;
            String all = String.join("/","S","M","L","XL");
            x += 3.5;
            String greeting="Hello";
            String s = greeting.substring(0,3);
            greeting = greeting.substring(0,3)+"p!";
            System.out.println("We will not use 'Hello,world'");
            System.out.println();
            System.out.print("Hello");
            System.out.println(2.0-1.1);
            System.out.println('\u2122');
            System.out.println(x);
            System.out.println(s);
            System.out.println(rating);
            System.out.println("The anser is "+anser);
            System.out.println(all);
            System.out.println(greeting);
            //System.out.println(str.equals(""));
            System.out.println(completedString);
    }
}
