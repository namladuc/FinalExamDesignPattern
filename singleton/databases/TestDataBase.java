package singleton.databases;

public class TestDataBase {

    // One thread
    // public static void main(String[] args) {
    //     DataBase dataBase1 = DataBase.getInstance();
    //     dataBase1.query("SELECT * FROM `student`");
    //     /**
    //      * Query has run ^_^
    //      * DataBase info:
    //      * ID : 1405
    //      * Instance: DataBase
    //      */
    // }

    // multi thread
    public static void main(String[] args) throws InterruptedException {
        // Chúng tôi có hai luồng, mỗi luồng thực thi mã này.    
        Thread thread1 = new Thread(() -> DataBase.getInstance().getDataBaseInfo());
        Thread thread2 = new Thread(() -> DataBase.getInstance().getDataBaseInfo());

        // Khi chạy và đưa ra kết quả cho mỗi ID của DataBase ta sẽ được 
        // các ID khác nhau.
        thread1.start();
        thread2.start();

        thread1.join();
    }
    
}
