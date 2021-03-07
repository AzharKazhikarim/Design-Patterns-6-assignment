package Ass6.dbcon;

public class Application {
    public static void main(String[] args) throws Exception {
        Database foo = Database.getInstance();
        foo.query("SELECT * FROM employees");
        Database bulochka = Database.getInstance();
        System.out.println("*********************");
        bulochka.query("SELECT * FROM employees ");






    }
}
