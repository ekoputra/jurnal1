
package jurnal1;
import java.util.Scanner;

public class Jurnal1 {

    public Jurnal1(){
    }
    
    public static void main(String[] args) {
        int a, batang, i;
        Scanner input = new Scanner(System.in);
        System.out.println("Silahkan Masukkkan Batas Derret Fibbonaci = ");
        a = input.nextInt();
        
            for(i=0; i<=a; i++)
            {
        batang = countFibbo(i);
                System.out.println(batang+" ");
            }
    }
    
    public static int countFibbo(int a){
        int ting;
        if(a==0)
            return 0;
        if(a==1)
            return(1);
        else 
            ting = countFibbo(a-1) + countFibbo(a-2);
        return ting;
    }
    
}
