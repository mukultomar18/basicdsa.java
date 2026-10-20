public class pattern6 {
    static void main(){
        int n=5;
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i-1; j++){
                System.out.print(" ");
            }
            for(int k=9; k>=2*i-1; k--){
                System.out.print("*");
            }
            System.out.println();
    }
}
}

