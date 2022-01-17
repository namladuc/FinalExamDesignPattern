package singleton.breaksingleton;

import java.lang.reflect.Constructor;

public class ReflectionBreak {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = null;
        try {
            Constructor<?>[] constructors = Singleton.class.getDeclaredConstructors();
            for (Constructor<?> constructor : constructors) {
                // Below code will destroy the singleton pattern
                constructor.setAccessible(true);
                instance2 = (Singleton) constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(instance1);
        System.out.println(instance2);
    }
}
