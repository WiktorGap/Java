//class LazySingleton{
//    private static  LazySingleton instance;
//    private LazySingleton(){
//        System.out.println("Constructor..");
//    }
//    private int x = 567;
//    public static synchronized LazySingleton getInstance()
//    {
//        if(instance == null)
//        {
//            instance = new LazySingleton();
//        }
//        return instance;
//    }
//    public void setX(int x)
//    {
//        this.x=x;
//    }
//    public int getX()
//    {
//        return x;
//    }
//}
//
//public class Main
//{
//    public static void main(String[] args) {
//
//        LazySingleton s1 = LazySingleton.getInstance();
//        LazySingleton s2 = LazySingleton.getInstance();
//    LazySingleton l = LazySingleton.instance;
//        l.setX(123);
//        s1.setX(123);
//        System.out.println(s2.getX());
//    }
//}




public class Main
{
    public static void main(String[] args) {
        Car c = (Car)Factory.getVehicle("car",4,4);
        Bicycle b = (Bicycle)Factory.getVehicle("bicycle",2,1);
        System.out.println(c.toString());
        System.out.println(b.toString());
    }
}
