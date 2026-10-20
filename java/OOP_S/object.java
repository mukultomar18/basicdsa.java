 class student {
    public String name;
    public int age;


    void display(){
        System.out.println(name);
        System.out.println(age);
    }
}
public class object{
    public static void main(String[]args){
        student s1 = new student();
        s1.name = "nitin";
        s1.age =20;
        s1.display();
    }
 }
