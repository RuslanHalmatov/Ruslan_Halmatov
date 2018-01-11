package ru.job4j.checked;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
  *Class {@code StringProcessingTest} используется для тестирования метода {@code contains}  класса {@code StringProcessing}.
  *@author Halmatov.
  *@since 10.12.2017.
*/
public class StringProcessingTest {

  /**
    *Метод {@code checkMethod } используется для тестирования метода  {@code contains}.
    *
  */
  @Test
  public void checkMethod() {
        StringProcessing stringFinder = new StringProcessing();
		boolean result = stringFinder.contains("Привет", "иве");
		boolean expected = true;
        assertThat(result, is(expected));
  }

}