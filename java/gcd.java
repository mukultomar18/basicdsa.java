public class gcd{
    static int getgcd(int a, int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
        static void main(){
            int ans = getgcd(18,12);
            System.out.println(ans);
        }
    }