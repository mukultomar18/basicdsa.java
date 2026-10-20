public class pattern8{
    static void main(){
        int n=5;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if(i==3){
                    if(j==1 || j==3){
                        System.out.print("* ");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
               else if(i==4){
                    if(j==1 || j==4){
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
                else{
                System.out.print("* ");

                }
            }
            System.out.println();
        }
    }
}