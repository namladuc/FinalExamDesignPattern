package singleton.singletonsolution;

public class DoubleCheckLockingSingleton {
   private static DoubleCheckLockingSingleton instance;

   private DoubleCheckLockingSingleton() {
   }

   public static DoubleCheckLockingSingleton getInstanceUsingDoubleLocking() {
      if (instance == null) {
         synchronized (DoubleCheckLockingSingleton.class) {
            if (instance == null) {
               instance = new DoubleCheckLockingSingleton();
            }
         }
      }
      return instance;
   }
}
