package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
  *Class {@code BoardTest} используется для тестирования метода {@code }  класса {@code Board}.
  *@author Halmatov.
  *@since 08.10.2017.
*/
public class BoardTest {

	/**
	  *Метод {@code whenPaintBoardWithWidthThreeAndHeightThreeThenStringWithThreeColsAndThreeRows } используется для тестирования метода  {@code paint}.
	  *c параметрами доски 3х3.
	*/
    @Test
    public void whenPaintBoardWithWidthThreeAndHeightThreeThenStringWithThreeColsAndThreeRows() {

		Board board = new Board();
        String result = board.paint(3, 3);
        final String line = System.getProperty("line.separator");
        String expected = String.format("x x%s x %sx x%s", line, line, line);
        assertThat(result, is(expected));
    }
	/**
	  *Метод {@code whenPaintBoardWithWidthFiveAndHeightFourThenStringWithFiveColsAndFourRows } используется для тестирования метода  {@code paint}.
	  *с параметрами доски 5х4.
	*/
	@Test
    public void whenPaintBoardWithWidthFiveAndHeightFourThenStringWithFiveColsAndFourRows() {

		Board board = new Board();
        String result = board.paint(5, 4);
        final String line = System.getProperty("line.separator");
        String expected = String.format("x x x%s x x %sx x x%s x x %s", line, line, line, line);
        assertThat(result, is(expected));
    }
}