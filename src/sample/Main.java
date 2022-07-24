package sample;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {

        Actions obj = new Actions();
        Class<?> cls = Actions.class;

        Method[] methods = cls.getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(Test.class)) {
                Test annotation = method.getAnnotation(Test.class);
                method.invoke(obj, annotation.a(), annotation.b());
            }
        }
    }
}
