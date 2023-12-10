package functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {

        int incremented =incrementByOne(0);
        System.out.println(incremented);

      Integer incremented2 = incrementByOneFunction.apply(1);
        System.out.println(incremented2);

        int multiply = multiplyByTen.apply(incremented2);
        System.out.println(multiply);

        Function<Integer,Integer> addBy1andThenMultiplyBy10 =incrementByOneFunction.andThen(multiplyByTen);

        int multiply2  =  addBy1andThenMultiplyBy10.apply(4);
        System.out.println(multiply2);

        System.out.println(incByOneAndMultiplyBiFunction.apply(2,300));
    }
     static    Function<Integer,Integer> incrementByOneFunction=
             number->number+1;

    static Function<Integer,Integer> multiplyByTen = number -> number*10;

    static BiFunction<Integer,Integer,Integer> incByOneAndMultiplyBiFunction =
            (numberToInc,numberToMultiply) -> (numberToInc+1)*numberToMultiply;
    static int incrementByOne(int number){
        return number+1;
    }
}
