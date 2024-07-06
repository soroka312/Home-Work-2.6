import java.util.*;

import static java.util.Collections.frequency;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (Integer num : nums) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }

        System.out.println();

        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 == 0 && nums.get(i) > nums.get(i - 1)) {
                System.out.println(nums.get(i));
            }
        }

        System.out.println();

        List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));
        Set<String> words = new HashSet<>(strings);
        System.out.println(words);

        System.out.println();

        for (String word : words) {
            int task4 = frequency(strings, word);
            System.out.println(task4);
        }
    }
}
