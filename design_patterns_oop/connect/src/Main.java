//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Connection con = MySQLHelper.getMySQLDBConnection();
        MySQLHelper storage = new MySQLHelper();
        storage.genereteMySQLPDFREPORT(con,"TBL_PERSON","person.pdf");

        Connection con1 = JSONHelper.getJSONConnection();
        JSONHelper storage1 = new JSONHelper();
        storage1.genereteJSONPDFreport(con1,"person.json","person.pdf");

        System.out.println("---------------------------");

        Facade.generateOutput(Facade.StorageType.MYSQL,Facade.OutputType.REPORT_PDF,"person","person.pdf");
        Facade.generateOutput(Facade.StorageType.JSON,Facade.OutputType.REPORT_PDF,"person","person.pdf");

    }
}