import java.util.Scanner;

public class factorial {
    static int factorial(int num){
        int fact =1;
        for(int i=num; i>0; i--){
            fact = fact*i;
        }
        return fact;
    }
    static void main(){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(factorial(x));
    }
}
