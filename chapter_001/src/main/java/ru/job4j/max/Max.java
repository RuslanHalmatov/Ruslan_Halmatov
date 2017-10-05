package ru.job4j.max;

/**
  *Class {@code Max} используется для нахождения наибольшего из чисел.
  *@author Halmatov.
  *@since 03.10.2017.
*/
public class Max {

  /**
    *Метод {@code max} находит наиболеешее из двух параметров.
    * первый: @param first и
    *второй: @param second параметр.
    *@return возвращает результат нахождения наибольшего из чисел.
  */
  public int max(int first, int second) {
		return (first > second) ? first : second;
  }

    /**
    *Метод {@code max} находит наиболеешее из трех  параметров.
    * первый: @param first и
    *второй: @param second параметр.
	*третий: @param third параметр.
    *@return возвращает результат нахождения наибольшего из чисел.
  */
  public int max(int first, int second, int third) {
		return max(first, max(second, third));
  }

}