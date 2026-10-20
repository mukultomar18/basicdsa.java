import java.util.Scanner;

public class array {
    static void main(){
        int arr[] = new int[5];
        int n=arr.length;
        int mul=1;
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<=n-1; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<=n-1; i++){ 
            mul=mul*arr[i];
        }
        System.out.println(mul);
    }
}
