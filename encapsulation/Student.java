public class Student {
    //encapsulation by using private keyword your hiding everthing to other classes
    private String name;
    private int age;
    private String address;

    //constructor is public in order it's object to accessible
    public Student(
            String name,
            int age,
            String address
    ){
        this.name = name;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setAddress(String address){
        this.address = address;
    }

    // order to be accessed you have to create some get methods
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getAddress() {
        return address;
    }
}