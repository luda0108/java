import java.util.*;
public class A1113305_0421_2 {
    public static void main(String []argv) throws Exception{
        Scanner sc = new Scanner(System.in);
        String day;
        System.out.println("請輸入年月日：(YYYY/MM/DD)(MM/DD/YYYY)");
        day = sc.next();
        if(!day.matches("[0-9]{4}/(0[0-9]|1[1-2])/[0-3]{1}[0-9]{1}")){
            if(day.matches("(0[0-9]|1[1-2])/[0-3]{1}[0-9]{1}/[0-9]{4}")){
                if(day.substring(0,2).compareTo("01")==0 |day.substring(0,2).compareTo("01")==0 |day.substring(0,2).compareTo("03")==0 |day.substring(0,2).compareTo("05")==0 |day.substring(0,2).compareTo("07")==0 |day.substring(0,2).compareTo("08")==0 |day.substring(0,2).compareTo("10")==0 |day.substring(0,2).compareTo("12")==0 ){
                    if(day.substring(3,5).compareTo("31")>0){
                        System.out.println("日期錯誤");
                    }
                    else{
                        System.out.println(day.substring(6,10)+"年"+day.substring(0,2)+"月"+day.substring(3,5)+"日");
                    }
                }
                else{
                    if(day.substring(3,5).compareTo("30")<0){
                        System.out.println("日期錯誤");
                    }
                    else{
                        System.out.println(day.substring(6,10)+"年"+day.substring(0,2)+"月"+day.substring(3,5)+"日");
                    }
                }
            }
            else{
                System.out.println("請重新輸入");
            }
        }
        else{
            if(day.substring(5,7).compareTo("01")==0 |day.substring(5,7).compareTo("01")==0 |day.substring(5,7).compareTo("03")==0 |day.substring(5,7).compareTo("05")==0 |day.substring(5,7).compareTo("07")==0 |day.substring(5,7).compareTo("08")==0 |day.substring(5,7).compareTo("10")==0 |day.substring(5,7).compareTo("12")==0 ){
                if(day.substring(8,10).compareTo("31")>0){
                    System.out.println("日期錯誤");
                }
                else{
                    System.out.println(day.substring(0,4)+"年"+day.substring(5,7)+"月"+day.substring(8,10)+"日");
                }
            }
            else{
                if(day.substring(8,10).compareTo("30")<0){
                    System.out.println("日期錯誤");
                }
                else{
                    System.out.println(day.substring(0,4)+"年"+day.substring(5,7)+"月"+day.substring(8,10)+"日");
                }
            }
        }
    }
}