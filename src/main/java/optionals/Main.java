package optionals;

import java.util.Optional;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {
        Optional.ofNullable(null)
                //  .orElseThrow(getIs_null());
                //    .orElseGet(()->"default value");
         //       .ifPresent(email -> System.out.println("sending email to " + email));
                .ifPresentOrElse(email -> System.out.println("Sending email to "+email)
                ,
                        ()-> System.out.println("cannot send email"));
    }

    private static Supplier<IllegalStateException> getIs_null() {
        return () -> new IllegalStateException("is null");
    }
}
