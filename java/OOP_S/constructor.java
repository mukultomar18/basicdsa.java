class student{
    String name;

    student(String name){
        this.name = name;
    }
    
    void show(){
        System.out.println(name);
    }
}

public class constructor {
    static void main(){
        student s1 = new student("madhur");
        student s2 = new student("divy");

        s1.show();
        s2.show();
        

    }   
}
