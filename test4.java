package test4.java;

public class test4 {
    public static void main(String[] args) {
        
        Graduate graduate = new Graduate();
        graduate.setName("zhangSan");//��������
        graduate.setFeePay(4600, 20000);//����ÿѧ�ڵķ���,�¹���
        System.out.println("ѧ��Ϊ��"+graduate.getFee());
        System.out.println("������Ϊ��"+graduate.getPay()); 
        System.out.println((graduate.getPay() - graduate.getFee())*0.2-16920+"Ϊ˰�ն�"); 
    }
}
