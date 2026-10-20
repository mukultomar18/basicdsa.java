public class count{
    static int countt(int num){
        int count=0;
        while(num!=0){
            num=num/10;
            count++;
        }
        return count;
    }
    static void main(){
        System.out.println(countt(53214));
    }
}
