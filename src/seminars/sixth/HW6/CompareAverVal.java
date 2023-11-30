package seminars.sixth.HW6;

import java.util.List;

public class CompareAverVal {
    public static String compareAverages(List<Integer> list1, List<Integer> list2) {
        double average1 = calculateAverage(list1);
        double average2 = calculateAverage(list2);

        if (average1 > average2) {
            return "Первый список имеет большее среднее значение";
        } else if (average2 > average1) {
            return "Второй список имеет большее среднее значение";
        } else {
            return "Средние значения равны";
        }
    }

    private static double calculateAverage(List<Integer> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Список пустой");
        }

        int sum = 0;
        for (int number : list) {
            sum += number;
        }
        return (double) sum / list.size();
    }
}
