package ru.job4j.array;
import java.util.Arrays;
/**
  *Class {@code ArrayDuplicate} используется для удаления дубликатов строк массива.
  *@author Halmatov.
  *@since 24.10.2017.
*/
public class ArrayDuplicate {

  /**
    *Метод {@code remove} вырезает дубликаты строк.
    *@param array - массив, который из которого необходимо вырезать дубликаты.
    *@return возвращает  массив без дубликатов.
  */
  public  String[] remove(String[] array) {

		int dublicateCounter = 0;
		int counter = 0;
		for (int i = 0; i < (array.length -  dublicateCounter); i++) {

			for (int j = (i + 1); j < (array.length -  dublicateCounter); j++) {

				if (array[i] == array[j]) {

					counter++;

				}

			}

			for (int j = (i + 1); j < (array.length -  dublicateCounter); j++) {

				while (array[i] == array[j] && counter != 0) {

					sendToEnd(array, j);
					counter--;
					dublicateCounter++;
				}

			}


		}

		return Arrays.copyOf(array, array.length - dublicateCounter);
  }

  /**
    *Метод {@code sendToEnd} переносит дубликат в конец массива.
    *@param array - массив, в котором осуществляется перенос, index.
	*@param index - индекс элемента-дубликата, который необходимо перенести в конец массива.
  */
  public void sendToEnd(String[] array, int index) {

		String temp = array[index];
		for (int i = index; i < array.length; i++) {

			if (array[i] == array[array.length - 1]) {
				array[i] = temp;
			} else {
				array[i] = array[i + 1];
			}

		}

  }

}