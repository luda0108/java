import java.util.*;
public class A1113305_0421_1{
    public static void main(String []argv) throws Exception{
        Scanner sc = new Scanner(System.in);
        String a;

        System.out.println("請輸入您的電子郵件：");
        a = sc.next();
        if(a.matches("[a-z0-9]+@([a-z]+.[a-z]+)+")){
            System.out.println(a);
        }
        else{
            System.out.println("請重新輸入");
        }
    }
}