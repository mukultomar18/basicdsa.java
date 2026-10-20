public class perfectno {
    static void getperfectd(int num){
        int sum=0;
        for(int i=1; i<num; i++){
            if(num%i==0){
                sum = sum+i;
            }
        }
        if(sum==num){
            System.out.println("perfect no.");
        }
        else{
            System.out.println("not a perfect no.");
        }
    }
    static void main(){
        getperfectd(29);
    }
}
