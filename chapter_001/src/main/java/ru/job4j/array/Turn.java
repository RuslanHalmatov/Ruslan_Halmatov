package ru.job4j.array;

/**
  *Class {@code Turn} используется для переворота массива задом на перед.
  *@author Halmatov.
  *@since 14.10.2017.
*/
public class Turn {

  /**
    *Метод {@code back} переворачивает массив задом на  перед.
    *@param array - массив, который необходимо перевернуть
    *@return возвращает перевернутый массив.
  */
  public int[]  back(int[]  array) {

		int temp = 0;
		for (int i = 0; i < (array.length / 2); i++) {

			temp = array[i];
			array[i] = array[array.length - i - 1];
			array[array.length - i - 1] = temp;
		}
		return array;
  }
}