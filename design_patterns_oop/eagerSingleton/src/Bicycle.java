public class Bicycle extends  Vehicle
{
    public String wheels;
    public int seats;
    public  Bicycle(String wheels, int seats)
    {
        this.seats = seats;
        this.wheels = wheels;
    }
    public String getNumberOfWheels()
    {
        return wheels;
    }
    public String getNumberOfSeats()
    {
        return Integer.toString(seats);
    }
}
