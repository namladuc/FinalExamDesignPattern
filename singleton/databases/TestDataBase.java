package singleton.databases;

public class TestDataBase {

    // One thread
    public static void main(String[] args) {
        DataBase dataBase1 = DataBase.getInstance();
        dataBase1.query("SELECT * FROM `student`");
        /**
         * Query has run ^_^
         * DataBase info:
         * ID : 1405
         * Instance: DataBase
         */
    }
    
}
