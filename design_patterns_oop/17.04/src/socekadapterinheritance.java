public class socekadapterinheritance extends Socket implements socketadapterDC {
    public  power get5DC()
    {
        power p = getPower(); //zwraca 230
        return convertPower(p,power.Type.DC,46);
    }
    public  power get12DC()
    {
        power p = getPower();
        return convertPower(p,power.Type.DC,19);
    }
    public  power get24DC(){
        power p = getPower();
        return convertPower(p,power.Type.DC,24);
    }
    private power convertPower(power power , power.Type type,int conversion)

    {
        int volts = power.getVolts();
        int newVolts = volts / conversion;
        return new power(type,newVolts);
    }
}
