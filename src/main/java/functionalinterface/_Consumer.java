package functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {

    public static void main(String[] args) {
        Customer customer= new Customer("hasan","040404444");
        greetCustomer(customer);

        greetCostumerConsumer.accept(customer);
        greetCustomerConsumerV2.accept(customer,false);
    }

    static Consumer<Customer> greetCostumerConsumer = customer ->
            System.out.println("Hello "+ customer.getCustomerName() +" number: "
            + customer.getCustomerPhoneNumber());

    static BiConsumer<Customer,Boolean> greetCustomerConsumerV2 = (customer, showPhoneNumber) ->
            System.out.println("Hello "+ customer.getCustomerName() +" number: "
                    +(showPhoneNumber ?  customer.getCustomerPhoneNumber() : "*****"));
    static void greetCustomer(Customer customer){
        System.out.println("Hello "+ customer.getCustomerName() +" number: "
        + customer.getCustomerPhoneNumber());
    }

    static class Customer{

        private final String customerName;
        private final String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }

        public String getCustomerName() {
            return customerName;
        }

        public String getCustomerPhoneNumber() {
            return customerPhoneNumber;
        }
    }
}
