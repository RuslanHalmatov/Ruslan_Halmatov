package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
  *Class {@code FactorialTest} используется для тестирования метода {@code calc}  класса {@code Factorial}.
  *@author Halmatov.
  *@since 08.10.2017.
*/
public class FactorialTest {

	/**
	  *Метод {@code whenFacNumberFiveThenOneHundredAndTwenty } используется для тестирования метода  {@code calc}.
	  *
	*/
    @Test
    public void whenFacNumberFiveThenOneHundredAndTwenty() {

		Factorial fac = new Factorial();
		int value = 5;
		int result = fac.calc(value);
		int expect = 120;
		assertThat(result, is(expect));

		value = 0;
		result = fac.calc(value);
		expect = 1;
		assertThat(result, is(expect));
    }
}