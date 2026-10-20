public class primeno {
    static void prime(int num){
        for(int i=2; i<num; i++){
        if (num%i==0){
            System.out.println("it is not a prime no.");
            return;
        }
    }
            System.out.println("it is a prime no.");
        }
    static void main(){
        prime(7);
    }
}