public class Inner01 {     //这个相当于外部其他类
    public static void main(String[] args) {
        //外部其他类访问成员内部类的方式1:
        Outer outer = new Outer();//先创建一个外部类对象
        //然后再new一个内部类实例,相当于把内部类当作一个成员,相当于把new Inner()当作outer的成员
        //固定语法
        Outer.Inner inner = outer.new Inner();
        inner.hi();
        //外部其他类访问成员内部类的方式2:
        //在外部类中编写一个方法,可以返回Inner对象,然后用外部类的引用调用该方法即可
        Outer.Inner innerInstance = outer.getInnerInstance();
        innerInstance.hi();
    }
}
class Outer{  //外部类
    private int n=10;
    class Inner{  //成员内部类
        public void hi(){ //内部类中的方法
            System.out.println("hi...");
        }
    }
    public void t1(){ //外部类使用成员内部类要先创建成员内部类的对象然后使用相关属性或方法
        Inner inner = new Inner();
        inner.hi();
    }
    //这是一个方法,返回成员内部类的实例,返回类型是成员内部类,用于测试方式2
    public Inner getInnerInstance(){
        return new Inner();
    }
}
