class Student {

    // private data members
    private String name;
    private int age;
    

    // setter methods
    public void setName(String n) {
        name = n;
    }

    public void setAge(int a) {
        age = a;
    }

    // getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

 class encapsulation {
     static void main(String[] args) {

        Student s1 = new Student();

        // setting values
        s1.setName("Rahul");
        s1.setAge(20);

        // getting values
        System.out.println(s1.getName());
        System.out.println(s1.getAge());
    }
}