public class Vehicle
{
    private String wheels;
    private String seats;

    private boolean hasHeatingSeats;
    private boolean hasHorn;

    public String getNumberOfWheels()
    {
        return wheels;
    }

    public String getNumberOfSeats()
    {
        return seats;
    }

    public boolean hasHorn()
    {
        return hasHorn;
    }

    public boolean hasHeatingSeats()
    {
        return hasHeatingSeats;
    }


    private Vehicle(VehicleBuilder builder)
    {
        this.wheels = builder.wheels;
        this.seats = builder.seats;
        this.hasHorn = builder.hasHorn;
        this.hasHeatingSeats = builder.hasHeatingSeats;
    }


    public String toString()
    {
        String st = "This vehicle has " + wheels + " wheels and " + seats + " seats.";
        if (hasHorn)
        {
            st += " It has a horn.";
        }
        if (hasHeatingSeats)
        {
            st += " It has heating seats.";
        }
        return st;
    }