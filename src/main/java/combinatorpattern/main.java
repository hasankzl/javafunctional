package combinatorpattern;

import java.time.LocalDate;

public class main {

    public static void main(String[] args) {
        Customer customer = new Customer(
                "Alice",
                "alice@gmail.com",
                "0123123123",
                LocalDate.of(2000,1,11)
        );

     //   System.out.println(new CustomerValidatorService().isValid(customer));

        // we can store customer in db if is valid

     // using combinator pattern
     CustomerRegistrationValidator.ValidationResult result = CustomerRegistrationValidator.isEmailValid()
                .and(CustomerRegistrationValidator.isPhoneNumberValid())
             .and(CustomerRegistrationValidator.isAdult())
                .apply(customer);

        System.out.println(result);

        if (result != CustomerRegistrationValidator.ValidationResult.SUCCESS){
            throw  new IllegalStateException(result.name());
        }
    }
}
