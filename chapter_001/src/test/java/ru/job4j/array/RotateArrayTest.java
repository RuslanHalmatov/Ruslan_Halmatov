package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
  *Class {@code RotateArrayTest} используется для тестирования метода {@code rotate }  класса {@code RotateArray}.
  *@author Halmatov.
  *@since 19.10.2017.
*/
public class RotateArrayTest {
	/**
	  *Метод {@code whenRotateTwoRowTwoColArrayThenRotatedArray } используется для тестирования метода  {@code rotate}.
	  *проверяющий поворот массива размером 2 на 2.
	*/
    @Test
    public void whenRotateTwoRowTwoColArrayThenRotatedArray() {
        RotateArray rotateArray = new RotateArray();
		int[][] values = {{1, 2}, {3, 4}};
        int[][] result = rotateArray.rotate(values);
		int[][] expected = {{3, 1}, {4, 2}};
        assertThat(result, is(expected));
    }

	/**
	  *Метод {@code whenRotateThreeRowThreeColArrayThenRotatedArray } используется для тестирования метода  {@code rotate}.
	  *проверяющий поворот массива размером 3 на 3.
	*/
	 @Test
    public void whenRotateThreeRowThreeColArrayThenRotatedArray() {
		RotateArray rotateArray = new RotateArray();
		int[][] values = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] result = rotateArray.rotate(values);
		int[][] expected = {{7, 4, 1}, {8, 5, 2}, {9, 6, 3}};
        assertThat(result, is(expected));
    }

}