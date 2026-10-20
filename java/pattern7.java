public class pattern7 {

     static void main() {

        int n = 4;

        for(int row = 1; row <= n; row++) {

            for(int col = 1; col <= 6; col++) {

                // first and last row
                if(row == 1 || row == n) {
                    System.out.print("* ");
                }

                else {

                    // first and last column
                    if(col == 1 || col == 6) {
                        System.out.print("* ");
                    };

                    // middle spaces
                    else {
                        System.out.print("  ");
                    }
                }
            }

            System.out.println();
        }
    }
}