public class palindrome {
    static void checkpalindrome(int num){
        int reverse =0;
        int a = num;
        while(num!=0){
            int digit = num%10;
            reverse = reverse*10 + digit;
            num=num/10;
        }
        if (a==reverse){
            System.out.println("it is a palindrome");
        }
        else{
            System.out.println("it is not a palindrome");
        }
    }
    static void main(){
        checkpalindrome(12251561);
    }
}
