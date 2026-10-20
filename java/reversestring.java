public class reversestring {
    static void main(){
    String str = "madhur";
String reversed = "";

for (int i = str.length() - 1; i >= 0; i--) {
    reversed = reversed + str.charAt(i);
}

System.out.println(reversed);
}
}