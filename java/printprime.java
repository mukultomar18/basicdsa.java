public class printprime {
    static void prime(int num){
        for(int j=1; j<=num; j++){
         for(int i=2; i<num; i++){
           if (num%i!=0){
            System.out.println(j);
        }
    }
        }
    }
    static void main(){
        prime(5);
    }
}