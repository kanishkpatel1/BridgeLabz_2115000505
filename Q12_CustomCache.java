import java.lang.annotation.*;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface CacheResult {}

class ExpensiveComputation {
    private final Map<Integer, Integer> cache = new HashMap<>();

    @CacheResult
    public int computeSquare(int num) {
        if (cache.containsKey(num)) {
            System.out.println("Returning cached result for " + num);
            return cache.get(num);
        }
        int result = num * num;
        cache.put(num, result);
        System.out.println("Computed result for " + num);
        return result;
    }
}

public class Q12_CustomCache {
    public static void main(String[] args) throws Exception {
        ExpensiveComputation computation = new ExpensiveComputation();
        System.out.println(computation.computeSquare(5));
        System.out.println(computation.computeSquare(5));
        System.out.println(computation.computeSquare(10));
        System.out.println(computation.computeSquare(10));
    }
}
