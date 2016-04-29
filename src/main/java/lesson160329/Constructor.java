package lesson160329;

import java.util.function.Supplier;

import java.util.function.Function;

public class Constructor {

    static class A {
        A(int x) {

        }
        A() {

        }
    }

    @FunctionalInterface
    interface MySup<T> {
        T create();
    }
    public static void main(String[] args) {
        Supplier<A> aNews = new Supplier<A>() {
            @Override
            public A get() {
                return new A();
            }
        };

        Supplier<A> s1 = () -> {
            return new A();
        };

        Supplier<A> s2 = () -> new A();

        Supplier<A> s3 = A::new;



        MySup<A> aNew = A::new;
        System.out.println(aNew.create());
        Function<Integer, A> fun = A::new;
        System.out.println(fun.apply(0));
    }
}
