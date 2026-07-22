package com.wipro.test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;
import com.wipro.task.Sort;
public class TestSort {
    @Test
    public void testSortValues() {
        Sort obj = new Sort();
        int[] input = {5, 2, 8, 1, 3};
        int[] expected = {1, 2, 3, 5, 8};
        assertArrayEquals(expected, obj.sortValues(input));
    }
}
