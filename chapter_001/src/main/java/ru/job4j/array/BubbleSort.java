package ru.job4j.array;

/**
  *Class {@code BubbleSort} используется сортировки массива алгоритмом пузырьковой сортировки.
  *@author Halmatov.
  *@since 14.10.2017.
*/
public class BubbleSort {

  /**
    *Метод {@code sort} сортирует массив по возрастанию.
    *@param array - массив, который необходимо отсортировать
    *@return возвращает отсортированный массив.
  */
  public int[]  sort(int[]  array) {

		int temp = 0;
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {

				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
	  }

		return array;
  }
}