package ru.job4j.loop;

/**
  *Class {@code Factorial} используется для вычисления факториала.
  *@author Halmatov.
  *@since 08.10.2017.
*/
public class Factorial {

  /**
    *Метод {@code add} находит факториал числа указанного в качестве.
    *@param n параметра
    *@return возвращает факториал числа.
  */
  public int calc(int n) {
		int fact = 1;

		for (int i = 1; i < (n + 1); i++) {
			fact *= i;
		}

		return fact;
  }
}