import java.util.*;
public class mainproject1{
    public static void main(String[] argv){
        Scanner sc = new Scanner(System.in);
        animal.showinfo();

        animal character1, character2;
        character1 = new animal("雪保",1.1f,52,100);
        character2 = new animal("驢子",1.5f,99,200);
        animal [] characters = {character1,character2};

        human human1,human2,human3;
        human1 = new human("阿克",1.9f,80,150,"男");
        human2 = new human("漢斯",1.8f,78,130,"男");
        human3 = new human("安娜",1.7f,48,120,"女");
        human[] human_being = {human1,human2,human3};

        snow queen;
        queen = new snow("愛沙",1.7f,50,120,"女","Yes");
        snow[] all_queen = {queen};
        
        character1.show();
        System.out.println();
        character2.show();
        System.out.println();
        human1.show();
        System.out.println();
        human2.show();
        System.out.println();
        human3.show();
        System.out.println();
        queen.show();
        System.out.println();


        for(int count=0;count<characters.length;count++){      //計算animal物件的距離
            int num1;
            double num2;
            System.out.println("請輸入兩個數字x和y:(如果只想輸入x,y就輸入0)");
            num1 = sc.nextInt();
            num2 = sc.nextDouble();
            if(num2>0){
                System.out.println(characters[count].name+"的Distance:"+characters[count].distance(num1,num2));
            }
            else{
                System.out.println(characters[count].name+"的Distance:"+characters[count].distance(num1));
            }

        }
        for(int count=0;count<human_being.length;count++){      //計算human物件的距離
            int num1;
            double num2;
            System.out.println("請輸入兩個數字x和y:(如果只想輸入x,y就輸入0)");
            num1 = sc.nextInt();
            num2 = sc.nextDouble();
            if(num2>0){
                System.out.println(human_being[count].name+"的Distance:"+human_being[count].distance(num1,num2));
            }
            else{
                System.out.println(human_being[count].name+"的Distance:"+human_being[count].distance(num1));
            }
        } 
        for(int count=0;count<all_queen.length;count++){      //計算snow物件的距離
            int num1;
            double num2;
            System.out.println("請輸入兩個數字x和y:(如果只想輸入x,y就輸入0)");
            num1 = sc.nextInt();
            num2 = sc.nextDouble();
            if(num2>0){
                System.out.println(all_queen[count].name+"的Distance:"+all_queen[count].distance(num1,num2));
            }
            else{
                System.out.println(all_queen[count].name+"的Distance:"+all_queen[count].distance(num1));
            }
        }
    }
}