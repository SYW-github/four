package test4.java;


public class Graduate implements Student, Teacher{
    private String name;
    private String sex;
    private int age;
    private double fee;
    private double pay;
    public void setName(String a) {
        name = a;
    }
    public void setSex(String a) {
        sex = a;
    }
    public void setAge(int a) {
        age = a;
    }
    public void setFeePay(double a, double b) {
        fee = a;
        pay = b;
    }
    public double setFee(){
        return 0;
    }
    public double getFee(){//����ÿѧ��ķ���
        return fee * 2;
    }
    public double setPay(){
        return 0;
    }
    public double getPay(){//����������
        return pay * 12;
    }
}
