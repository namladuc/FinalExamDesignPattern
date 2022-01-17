package singleton.breaksingleton;

public class Singleton {
   public static Singleton instance;
   private int id;

   private Singleton() {
      id = (int) (Math.random() * 100);
   }

   public static Singleton getInstance() {
      if (instance == null) {
         synchronized (Singleton.class) {
            if (instance == null) {
               instance = new Singleton();
            }
         }
      }
      return instance;
   }

   public String toString() {
      return "Singleton Number: " + id;
   }
}
