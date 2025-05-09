//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
        testSAI();
    }
    private static void  testSAI()
    {
        socketadapterDC adapter = new socekadapterinheritance() {
        };
        power  v5DC = getPower(adapter,power.Type.DC,5);
        power  v12DC = getPower(adapter,power.Type.DC,12);
        power  v30DC = getPower(adapter,power.Type.DC,30);
        if(v5DC != null)
        {
            System.out.println(v5DC.toString());
        }

        if(v12DC != null)
        {
            System.out.println(v12DC.toString());
        }
        if(v30DC != null)
        {
            System.out.println(v30DC.toString());
        }else
        {
            System.out.println("Problem with adapter");
        }
    }
    private static power getPower(socketadapterDC adapter , power.Type type , int voltage)
    {
        if(type == power.Type.DC)
        {
            switch (voltage)
            {
                case 5:
                    return adapter.get5DC();
                case 12:
                    return adapter.get12DC();
                case 24:
                    return adapter.get24DC();
                default:
                    return null;
            }
        }
        return null;
    }

}
