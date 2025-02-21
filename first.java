public class Main {
    public static void main(String[] args)
    {
        boolean b = 2 >1;
        if(b)
        {
            System.out.println("TTT");
        }

        /*
        byte - 8 bitów
        char - 16 bitów
        short - 16 bitów
        int - 32 bity
        long - 64 bity
        */
        byte b1  = 64;
        System.out.println(b1);
        b1 = (byte)130;
        System.out.println(b1);


        char c = 'a';
        System.out.println((int)Character.MAX_VALUE);
        System.out.println(c);

        c = '\u0104';
        System.out.println(c);
        /*
        float - 32b
        double - 64b
        */
        float f = 1.2f;
        Float ff = 3.4f;//new Float(f);
        Float ff2 =1.1f;
        System.out.println(f);
        System.out.println(Float.MAX_VALUE);
        System.out.println(ff.toString());
        System.out.println(ff+ff2);
        System.out.println(ff.equals(ff2));

        long l =123_456_789_101L;
        System.out.println(l);

        /*
        double d = 9.4d;
        System.out.println(d);
        */


    }
}
