package exercise;

import exercise.model.Address;
import exercise.annotation.Inspect;
import java.lang.reflect.Method;

public class Application {
    public static void main(String[] args) {
        var address = new Address("London", 12345678);

        // BEGIN
        //Method getCity returns a value of type String
        for (Method method : Address.class.getDeclaredMethods()) {
            if (method.isAnnotationPresent(Inspect.class)) {

                System.out.printf("Method %s returns a value of type %s%n",
                        method.getName(), method.getReturnType().getName());
            }
        }
        // END
    }
}
