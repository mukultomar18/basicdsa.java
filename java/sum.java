public class sum{
    static int countt(int num){
        int sum=0;
        while(num!=0){
            int s=num%10;
            sum = sum + s;
            num=num/10;
        }
        return sum;
    }
    static void main(){
        System.out.println(countt(532514));
    }
}
