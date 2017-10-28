package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
  *Class {@code ArrayDuplicateTest} используется для тестирования метода {@code remove }  класса {@code ArrayDuplicate}.
  *@author Halmatov.
  *@since 28.10.2017.
*/
public class ArrayDuplicateTest {
	/**
	  *Метод {@code whenRemoveDuplicatesThenArrayWithoutDuplicate } используется для тестирования метода  {@code remove}.
	*/
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        ArrayDuplicate arrayDuplic = new ArrayDuplicate();
		String[] values = new String[] {"Привет", "Мир", "Привет", "Супер", "Мир"};
        String[] result = arrayDuplic.remove(values);
		String[] expected = new String[] {"Привет", "Мир", "Супер"};
        assertThat(result, is(expected));
    }

}