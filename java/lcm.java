public class lcm{
    static int getlcm(int a, int b){
        int originalvalueofa = a;
        int originalvalueofb = b;
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        // lcm x gcd = axb
        // lcm = axb/gcd
        int lcm = (originalvalueofa*originalvalueofb)/a;
        return lcm;
    }
        static void main(){
            int ans = getlcm(18,12);
            System.out.println(ans);
        }
    }