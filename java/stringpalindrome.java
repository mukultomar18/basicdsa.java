public class stringpalindrome {
    static void main(){
        String n = "nitin";
        String reversed = "";
        for(int i=n.length()-1; i>=0; i--){
            reversed = reversed + n.charAt(i);
        }
        if(n.equals(reversed)){
            System.out.println("it is palindrome");
        }
        else{
            System.out.println("it is not palindrome");
        }
    }
}
