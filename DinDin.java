import java.io.IOException;
import java.util.Scanner;

class DinDinThread extends Thread{
    static int pork = 5000;
    static int beef = 3000;
    static int vegetable = 1000;
    static int total = pork + beef + vegetable;
    int temp = 0;
    static int consumer1;
    DinDin orderlist;
    String name;
    public DinDinThread(DinDin orderlist,String name ){
        this.orderlist=orderlist;
        this.name=name;
    }
    public synchronized void run(){ //亂數點餐(種類、數量)
        for(int i =0;i<=consumer1;i++){
            int favor = (int)(Math.random()*3);
            int count = (int)(Math.random()*41)+10;
            if(total==0){
                System.out.println("水餃賣光了，下次再來");
            }
            if(favor==1){
                temp = count;
                pork = pork -count;
            }
            else if(favor == 2){
                temp = count;
                beef = beef - count;
            }
            else{
                temp = count;
                vegetable = vegetable -count ;
            }
            total = pork+beef+vegetable;
            orderlist.getOrder(pork,beef,vegetable,total);
            try{
                sleep(3000);
                System.out.println("有人點餐中請稍等");
            }catch(InterruptedException e){}
        }
    }
}
public class DinDin{
    static int total;
    static int pork ;
    static int beef ;
    static int vegetable ;
    static int consumer1;
    DinDinThread orderArray[] ;
    public void getOrder(int pork , int beef,int vegetable,int total){
        this.total=total;//不確定要不要寫不影響結果
        this.pork=pork;
        this.beef=beef;
        this.vegetable=vegetable;
        System.out.println("目前豬肉水餃剩下:"+pork);
        System.out.println("目前牛肉水餃剩下:"+beef);
        System.out.println("目前蔬菜水餃剩下:"+vegetable);
        System.out.println("目前總水餃剩下:"+total);
    }
    public void startOrder(){
        orderArray = new DinDinThread[consumer1];
        for(int i=1;i<=consumer1;i++){
            orderArray[i-1] = new DinDinThread(this,"位");//?
        }
        for(int i=0;i<consumer1;i++){
            orderArray[i].start();
        }

    }
    public static void main(String[] argv) throws IOException{
        System.out.println("請輸入同時光顧的客人數:");
        Scanner sc = new Scanner(System.in);
        int consumer = sc.nextInt();
        consumer1 = consumer;
        DinDin orderlist = new DinDin();
        orderlist.startOrder();
    }
}
