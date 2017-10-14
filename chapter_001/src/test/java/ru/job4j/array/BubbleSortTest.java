package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
  *Class {@code BubbleSortTest} используется для тестирования метода {@code sort }  класса {@code BubbleSort}.
  *@author Halmatov.
  *@since 14.10.2017.
*/
public class BubbleSortTest {
	/**
	  *Метод {@code whenSortArrayWithTenElementsThenSortedArray } используется для тестирования метода  {@code sort}.
	  *c массивом из 4 элементов.
	*/
    @Test
    public void whenSortArrayWithTenElementsThenSortedArray() {
        BubbleSort bubbleSort = new BubbleSort();
		int[] values = new int[] {1, 5, 4, 2, 3, 1, 7, 8, 0, 5};
        int[] result = bubbleSort.sort(values);
		int[] expected = new int[] {0, 1, 1, 2, 3, 4, 5, 5, 7, 8};
        assertThat(result, is(expected));
    }

}