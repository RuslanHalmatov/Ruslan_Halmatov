package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
  *Class {@code CounterTest} используется для тестирования метода {@code add}  класса {@code Counter}.
  *@author Halmatov.
  *@since 05.10.2017.
*/
public class CounterTest {

	/**
	  *Метод {@code whenSumEvenNumbersFromOneToTenThenThirty } используется для тестирования метода  {@code add}.
	  *
	*/
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {

		Counter counter = new Counter();
		int start = 1;
		int finish = 10;
		int result = counter.add(start, finish);
		int expect = 30;
		assertThat(result, is(expect));
    }
}