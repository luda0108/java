import java.util.*;
public class A1113321_0317_1 {
    public static void main(String[] argv){
        int [][] abc;
        int n,m;
        System.out.print("請輸入兩個正整數:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        abc = new int[n][m];


        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                //System.out.println((i+1)+"*"+(j+1)+"="+(i+1)*(j+1)+"\t");
                //System.out.println((i+1)*(j+1)+"\t");
                abc[i][j]=(i+1)*(j+1);
            }
            System.out.println("");
        }
        
        for(int[] a : abc){
            for(int b : a){
                System.out.println(b+ "\t");
            }
        System.out.println("");
        }
    }
}
