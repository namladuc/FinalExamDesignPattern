package singleton.singletonsolution;

public class EagerSingleton {
   private static EagerSingleton uniqueInstance = new EagerSingleton();

   private EagerSingleton() {
   }

   public static EagerSingleton getEagerSingletonInstance() {
      return uniqueInstance;
   }
}
