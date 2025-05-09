public class MySQLHelper
{
    public static Connection getMySQLDBConnection() {
        return new Connection("MySQL");
    }

    public void genereteMySQLPDFREPORT(Connection con , String table,String outputName)
    {
        System.out.println("Get data from MYSQL table "+ table +" and genrate raport in pdf format and save as " + outputName);
    }
    public void getMySQLRawDataCSV(Connection con , String table, String outputName)
    {
        System.out.println("Get raw data from Mysql tables "+table + " in CSV forma and sace as " + outputName);
    }

}
