public class MethodOverridingDemo {

    public static void main(String[] args) {

        
        // Bicycle bicycle = new Bicycle(22, 2);//initialization of Bicycle class
        // System.out.println("Bicycle gear is: " + bicycle.gear);
        // System.out.println("Bicycle speed is: " + bicycle.speed);
        // bicycle.applyBrake(1);
        // System.out.println("Bicycle speed after applying breaks is: " + bicycle.speed);
        // run first the code snipet above while commenting below to observe well

        Bicycle mountainBike = new MountainBike(50, 55, 4);
        System.out.println("MountainBike Gear is: " + mountainBike.gear);
        System.out.println("MountainBike speed is: " + mountainBike.speed);

//

        mountainBike.applyBrake(1);
        System.out.println("MountainBike speed after applying break is: " + mountainBike.speed);
//

        mountainBike.speedUp(10);
        System.out.println("MountainBike speed after speed up is: " + mountainBike.speed);
        

 }
}