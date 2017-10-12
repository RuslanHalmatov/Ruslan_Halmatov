package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
  *Class {@code PaintTest} используется для тестирования метода {@code piramid }  класса {@code Paint}.
  *@author Halmatov.
  *@since 12.10.2017.
*/
public class PaintTest {
	/**
	  *Метод {@code whenPiramidWithHeightTwoThenStringWithTwoRows } используется для тестирования метода  {@code piramid}.
	  *c параметрами доски 3х3.
	*/
    @Test
    public void whenPiramidWithHeightTwoThenStringWithTwoRows() {
        Paint paint = new Paint();
        String result = paint.piramid(2);
		String sep = System.getProperty("line.separator");
        String expected = String.format(" ^ %s^^^%s", sep, sep);
        assertThat(result, is(expected));
    }

	/**
	  *Метод {@code whenPiramidWithHeightThreeThenStringWithThreeRows } используется для тестирования метода  {@code piramid}.
	  *c параметрами доски 3х3.
	*/
	@Test
    public void whenPiramidWithHeightThreeThenStringWithThreeRows() {
        Paint paint = new Paint();
        String result = paint.piramid(3);
		String sep = System.getProperty("line.separator");
        String expected = String.format("  ^  %s ^^^ %s^^^^^%s", sep, sep, sep);
        assertThat(result, is(expected));
    }

}