public class techno {

    static void gettech(int num) {
        int temp = num;


            int lasttwodigits = num % 100;
            int starttwodigits = num/100;
            int sum = lasttwodigits + starttwodigits;
            int square = sum*sum;
            if(temp==square){
                System.out.println("it is a tech no.");
            }
            else{
                System.out.println("it is not a tech no.");
            }
    }

    public static void main(String[] args) {
        gettech(2055);
    }
}