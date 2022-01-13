package singleton.databases;

public class DataBase {
    private int ID;
    private static DataBase instance;

    private DataBase() {
        createDataBase();
        ID = (int) (Math.random() * 10000);
    }

    // public static DataBase getInstance() {
    //     if (instance == null) {
    //         synchronized (DataBase.class) {
    //             if (instance == null) {
    //                 instance = new DataBase();
    //             }
    //         }
    //     }
    //     return instance;
    // }

    public static DataBase getInstance() {
        if (instance == null) {
            instance = new DataBase();
        }
        return instance;
    }

    public void reset() {
        instance = null;
    }

    private void createDataBase() {
        // Some initialization code, such as the actual
        // connection to a database server.
        // ...
    }

    public void query(String sql) {
        // For instance, all database queries of an app go
        // through this method. Therefore, you can place
        // throttling or caching logic here.
        // ...
        System.out.println("Query has run ^_^");
        System.out.println("DataBase info:");
        getDataBaseInfo();
    }

    public void getDataBaseInfo() {
        System.out.println("DataBase ID : " + ID + " From thread " + Thread.currentThread().getName());
        // System.out.println("Instance: " + instance);
        //System.out.println();
    }
}
