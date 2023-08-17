import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Integer> summetric = new HashSet<>();
        summetric.add(2);
        summetric.add(22);
        Set<Integer> summetric1 = new HashSet<>();
        summetric1.add(2);
        summetric1.add(28);
        System.out.println(summetricDeferensial(summetric, summetric1));
    }
    public static Set<Integer> summetricDeferensial(Set<Integer> summetric, Set<Integer> summetric1) {
        Set<Integer> summetric3 = new HashSet<>(summetric);
        summetric3.removeAll(summetric1);
        summetric1.removeAll(summetric);
        summetric3.addAll(summetric1);
        return summetric3;
    }

}
