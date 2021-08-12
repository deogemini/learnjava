//methodOverloading is kind of polymorphism that one method has more than one property and return types must be different
public class MethodOverloadingDemo {

    public int multiply(int x, int y){
        return (x * y);
    }

    public int multiply(int x, int y, int z){
        return (x * y * z);
    }

    public double multiply(double x, double y){
        return (x * y);
    }

    public static void main(String[] args) {
        MethodOverloadingDemo methodOverloadingDemo = new MethodOverloadingDemo();
        System.out.println(methodOverloadingDemo.multiply(34, 59));
        System.out.println(methodOverloadingDemo.multiply(10,90, 11));
        System.out.println(methodOverloadingDemo.multiply(2.2,33.9));
    }
}