package singleton.singletonsolution;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
 
public class BreakSingleton {
 
    public static void main(String[] args)
            throws InstantiationException, IllegalAccessException, InvocationTargetException {
         
        EagerSingleton instanceOne = EagerSingleton.getEagerSingletonInstance();
        EagerSingleton instanceTwo = null;
 
        Constructor<?>[] constructors = EagerSingleton.class.getDeclaredConstructors();
        for (Constructor<?> constructor : constructors) {
            constructor.setAccessible(true);
            instanceTwo = (EagerSingleton) constructor.newInstance();
        }
 
        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());
    }
}
