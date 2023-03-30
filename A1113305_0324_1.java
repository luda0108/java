import java.util.*;

class animal{
    String name;
    float height;
    int weight;
    int rate;

    void show(){
        System.out.println("名字:"+name);
        System.out.println("身高:"+height);
        System.out.println("體重:"+weight);
        System.out.println("速度:"+rate);
        System.out.println();
    }
    int distance (int x){
        int dist;
        dist = x*this.rate;
        return dist;
    }
    double distance(int x, double y){
        double dist;
        dist = x*y*this.rate;
        return dist;
    }
}
public class A1113305_0324_1{
    public static void main(String []argv){
        Scanner sc = new Scanner(System.in);
        animal chacter1, chacter2, chacter3, chacter4;

        chacter1 = new animal();
        chacter2 = new animal();
        chacter3 = new animal();
        chacter4 = new animal();
        animal [] chacters = {chacter1,chacter2,chacter3,chacter4};

        chacter1.name = "雪保";
        chacter1.height= 1.1f;
        chacter1.weight= 52;
        chacter1.rate= 100;
        chacter1.show();

        chacter2.name = "驢子";
        chacter2.height= 1.5f;
        chacter2.weight= 99;
        chacter2.rate= 200;
        chacter2.show();

        chacter3.name = "安娜";
        chacter3.height= 1.7f;
        chacter3.weight= 48;
        chacter3.rate= 120;
        chacter3.show();

        chacter4.name = "愛莎";
        chacter4.height= 1.7f;
        chacter4.weight= 50;
        chacter4.rate= 120;
        chacter4.show();

        for(int count = 0;count<chacters.length;count++){
            int num1 = sc.nextInt();
            double num2 = sc.nextDouble();
            boolean choose = sc.nextBoolean();
            if(choose){
                chacters[count].distance(num1,num2);
                System.out.println("距離:"+chacters[count].distance(num1,num2));
            }
            else{
                chacters[count].distance(num1);
                System.out.println("距離:"+chacters[count].distance(num1));
            }
        }
    }
}