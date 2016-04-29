package lesson160331;

import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FunctionalInterfaceExample {
//    @FunctionalInterface
//    interface Nothing {
//
//    }

    @FunctionalInterface
    interface A {
        void m();
        default void m2() {

        }
    }

    @FunctionalInterface
    interface B extends A {
//        void m2();
    }

    public static void main(String[] args) throws Exception {
        Callable<Integer> c = () -> 42;

        System.out.println(c.call());

        PrivilegedAction<Integer> p = () -> 42;

        System.out.println(p.run());

//        c = p; ERROR
        launch(c);
//        launch(p); ERROR
        launch(() -> 42);
        launch(p::run);

//        Object a = () -> 42; ERROR (only for functional interfaces)

        List<String> list = new ArrayList<>();
        Predicate<String> predicate1 = (s) -> list.add(s);
        Predicate<String> predicate2 = list::add;

        Consumer<String> consumer1 = list::add; // ignore return value (void rule)
    }

    static void launch(Callable<?> c) throws Exception {
        System.out.println(c.call());
    }


}
