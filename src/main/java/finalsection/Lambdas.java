package finalsection;

import java.util.Locale;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Lambdas {

    public static void main(String[] args) {

        Integer number = null;
        // not valid
        // int counter = null;
        Function<String, String> upperCaseName =
                name -> {
                    //logic
                    if (name.isEmpty())
                    {
                        throw new IllegalArgumentException("");
                    }
                    return name.toUpperCase(Locale.ROOT);
                };

        BiFunction<String,Integer, String> upperCaseNameAge =
                (name,age) -> {
                    //logic
                    if (name.isEmpty())
                    {
                        throw new IllegalArgumentException("");
                    }
                    return name.toUpperCase(Locale.ROOT) +" "+ age;
                };

        System.out.println(upperCaseName.apply("alex"));
        System.out.println(upperCaseNameAge.apply("hasan",24));
    }
}
