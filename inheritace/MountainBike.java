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


}