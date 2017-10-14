package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
  *Class {@code TurnTest} используется для тестирования метода {@code back }  класса {@code Turn}.
  *@author Halmatov.
  *@since 14.10.2017.
*/
public class TurnTest {
	/**
	  *Метод {@code whenTurnArrayWithEvenAmountOfElementsThenTurnedArray } используется для тестирования метода  {@code back}.
	  *c массивом из 4 элементов.
	*/
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        Turn turn = new Turn();
		int[] values = new int[] {2, 6, 1, 4};
        int[] result = turn.back(values);
		int[] expected = new int[] {4, 1, 6, 2};
        assertThat(result, is(expected));
    }

	/**
	  *Метод {@code whenTurnArrayWithOddAmountOfElementsThenTurnedArray } используется для тестирования метода  {@code back}.
	  *c массивом из 5 элементов.
	*/
	@Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        Turn turn = new Turn();
		int[] values = new int[] {1, 2, 3, 4, 5};
        int[] result = turn.back(values);
		int[] expected = new int[] {5, 4, 3, 2, 1};
        assertThat(result, is(expected));
    }

}