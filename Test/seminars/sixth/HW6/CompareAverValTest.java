package seminars.sixth.HW6;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class CompareAverValTest {
    @Test
    void testCompareAverages_FirstListHasGreaterAverage() {
        List<Integer> list1 = Arrays.asList(5, 6, 7);
        List<Integer> list2 = Arrays.asList(1, -1, 3, 0);
        String result = CompareAverVal.compareAverages(list1, list2);
        assertEquals("Первый список имеет большее среднее значение", result);
    }

    @Test
    void testCompareAverages_SecondListHasGreaterAverage() {
        List<Integer> list1 = Arrays.asList(1, -2, 3);
        List<Integer> list2 = Arrays.asList(5, 6, 7);
        String result = CompareAverVal.compareAverages(list1, list2);
        assertEquals("Второй список имеет большее среднее значение", result);
    }

    @Test
    void testCompareAverages_AveragesAreEqual() {
        List<Integer> list1 = Arrays.asList(5, 6, 7);
        List<Integer> list2 = Arrays.asList(1, 2, 3, 18);
        String result = CompareAverVal.compareAverages(list1, list2);
        assertEquals("Средние значения равны", result);
    }

    @Test
    void testCompareAverages_EmptyLists() {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        assertThrows(IllegalArgumentException.class, () -> CompareAverVal.compareAverages(list1, list2));
    }
}
