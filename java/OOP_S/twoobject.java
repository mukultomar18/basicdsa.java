class car{
    String brand;
    void show(){
        System.out.println(brand);
    }
}
 public class twoobject{
    static void main(){
        car c1 = new car();
        car c2 = new car();

        c1.brand = "honda";
        c2.brand = "hyundai";

        c1.show();
        c2.show();
    }
 }
