public class power {

    enum Type
    {
        AC,
        DC

    }
    private int volts;
    private Type type;
    public power ( Type type , int volts)
    {
        this.type = type;
        this.volts = volts;
    }
    public int getVolts(){
        return volts;
    }
    public Type getType()
    {
        return  type;
    }
    public String toString()
    {
        String type = "DC";
        if(type.equals( Type.AC))
        {
            type = "AC";
        }
        return "voltage= " + volts + " type " + type;
    }

}
