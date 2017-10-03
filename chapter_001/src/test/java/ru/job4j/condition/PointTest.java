package ru.job4j.condition;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
  *Class {@code PointTest} используется для тестирования метода класса {@code Point}.
 */
public class PointTest {

	/**
	  *Метод {@code whenPointOnLineThenTrue} проверяет метод {@code is} класса {@code Point}}.
	*/
    @Test
    public void whenPointOnLineThenTrue() {
        //create of new point.
        Point a = new Point(1, 1);
        // execute method - is and get result;
        boolean rsl = a.is(0, 1);
        // assert result by excepted value.
        assertThat(rsl, is(true));
   }
}