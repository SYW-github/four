package test4.java;

public class test4 {
    public static void main(String[] args) {
        
        Graduate graduate = new Graduate();
        graduate.setName("zhangSan");//设置姓名
        graduate.setFeePay(4600, 20000);//设置每学期的费用,月工资
        System.out.println("学费为："+graduate.getFee());
        System.out.println("年收入为："+graduate.getPay()); 
        System.out.println((graduate.getPay() - graduate.getFee())*0.2-16920+"为税收额"); 
    }
}
