/**
* Test.
*
* @author Ruslan Halmatov (mailto:HalmatovJava@yandex.ru).
* @version $Id$.
* @since 0.1.
*/
package ru.job4j;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;




/**
  *Класс {@code CalculateTest} используется для тестирование.
  *объектов класса {@code Calculate}.
*/
public class CalculateTest {
/**
* Test echo.
*/
	@Test
	public void whenTakeNameThenTreeEchoPlusName() {
		String input = "Ruslan Halmatov";
		String expect = "Echo, echo, echo : Ruslan Halmatov";
		Calculate calc = new Calculate();
		String result = calc.echo(input);
		assertThat(result, is(expect));
	}
}