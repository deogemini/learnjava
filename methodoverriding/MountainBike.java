class MountainBike extends Bicycle{
    //extend keyword defines inheritance

    public int seatHeight;

//constructor of MountainBike with properties from the Bicycle class
    public MountainBike(
        int startHeight,
        int startSpeed,
        int startGear
    ){
        //super keyword refer to the properties of Bicycle constructor
        super(startSpeed, startGear);
        this.seatHeight = startHeight;
    }

    public void setHeight(int newValue){
        seatHeight = newValue;

    }


    //Override keyword for doing overriding of methods in superclass
    @Override
    public void setGear(int newValue){
        gear = newValue+2;
    }

    @Override
    public void applyBrake(int decrement){
        speed = speed-decrement-10;
    }

    @Override
    public void speedUp(int increment){
        speed = speed + increment + 10;
    }


}