public class JSONHelper
{
    public static Connection getJSONConnection() {
        return new Connection("JSON File(s)");
    }

    public void genereteJSONPDFreport(Connection con , String file,String outputName)
    {
        System.out.println("Get data from JSON file "+file+ " and genrate raport in pdf format and save as " + outputName);
    }
    public void getJSONRawDataCSV(Connection con , String file,String outputName)
    {
        System.out.println("Get raw data from JSON file "+file+" in CSV format and save as " + outputName);
    }
}
