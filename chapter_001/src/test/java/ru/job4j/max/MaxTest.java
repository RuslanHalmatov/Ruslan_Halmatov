package ru.job4j.max;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
  *Class {@code MaxTest} используется для тестирования метода {@code max}  класса {@code Max}.
  *@author Halmatov.
  *@since 03.10.2017.
*/
public class MaxTest {

  /**
    *Метод {@code checkMethod } используется для тестирования метода  {@code max}.
    *
  */
  @Test
  public void checkMethod() {
      Max maxoper = new Max();
      int first = 10;
      int second = 20;
	  int third = 30;
      int expect = 30;
      int result = maxoper.max(first, second, third);
      assertThat(result, is(expect));
      first = 38;
      second = 23;
	  third  = 5;
      expect = 38;
      result = maxoper.max(first, second, third);
      assertThat(result, is(expect));
      first = 11;
      second = 11;
	  third  = 11;
      expect = 11;
      result = maxoper.max(first, second, third);
      assertThat(result, is(expect));
  }

}