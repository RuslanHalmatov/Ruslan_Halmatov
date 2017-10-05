package ru.job4j.loop;

/**
  *Class {@code Counter} используется для нахождения суммы четных чисел в диапазоне.
  *@author Halmatov.
  *@since 05.10.2017.
*/
public class Counter {

  /**
    *Метод {@code add} находит сумму четных чисел в диапазоне параметров.
    *первый: @param start и
    *второй: @param finish параметр.
    *@return возвращает сумму четных чисел.
  */
  public int add(int start, int finish) {
		int sum = 0;

		for (int i = start; i < (finish + 1); i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}

		return sum;
  }
}