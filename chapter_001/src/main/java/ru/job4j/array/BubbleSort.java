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
		for (int i = array.length - 1; i > 0; i--) {

			for (int j = 0; j < i; j++) {

				if (array[j] > array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
	  }

		return array;
  }
}