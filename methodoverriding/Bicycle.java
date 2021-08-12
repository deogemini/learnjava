class Bicycle{
    //propeties
    //protected keyword makes properties to be used in the class within same package
    protected int gear;
    protected int speed;

//constructor 
    public Bicycle(int startSpeed, int startGear){
        gear = startGear;
        speed = startSpeed;

    }

    public void setGear(int newValue){
        gear = newValue;

    }

    public void applyBrake(int decrement){
        speed -=decrement;
    }

    public void speedUp(int increment){
        speed += increment;
    }
}