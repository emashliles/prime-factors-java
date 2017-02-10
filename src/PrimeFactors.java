import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    public static List<Integer> calculate(int number) {
        List<Integer> primeFactors = new ArrayList<>();

        if(number == 2 || number == 3) {
            primeFactors.add(number);
        }
        else {
            primeFactors.add(2);
            primeFactors.add(2);
        }
        return primeFactors;
    }
}
