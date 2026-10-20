public class armstrong {
    static void getarmstrong(int num){
        int a = num;
        int sum=0;
        while(num!=0){
            int digit = num%10;
            digit = digit*digit*digit;
            sum += digit;
            num = num/10;
        }
        if(a==sum){
            System.out.println("it is a armstrong value");
        }
        else{
            System.out.println("it is not a armstrong value");
        }
    }
    static void main(){
        getarmstrong(153);
    }
}
