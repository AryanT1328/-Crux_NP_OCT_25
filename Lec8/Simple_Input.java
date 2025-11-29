package Lec8;
import java.util.*;
public class Simple_Input {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        int sum=0;
        while(true){
            int x=sc.nextInt();
            sum+=x;
            if(sum<0){
                break;
            }
            System.out.println(x);

        }

    }
}