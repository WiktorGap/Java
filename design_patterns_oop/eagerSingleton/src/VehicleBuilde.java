public  class VehicleBuilde
{
    private String wheels;
    private String seats;

    private boolean hasHeatingSeats;
    private boolean hasHorn;


    public VehicleBuilde(String wheels, String seats)
    {
        this.wheels = wheels;
        this.seats = seats;
        this.hasHeatingSeats = false;
        this.hasHorn = false;
    }


    public VehicleBuilde hasHeatingForSeats(boolean has)
    {
        hasHeatingSeats = has;
        return this;
    }


    public VehicleBuilde hasHorn(boolean has)
    {
        hasHorn = has;
        return this;
    }


    public Vehicle build()
    {
        return new Vehicle(this);
    }
}
}