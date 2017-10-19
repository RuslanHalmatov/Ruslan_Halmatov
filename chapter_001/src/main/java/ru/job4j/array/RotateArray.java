package ru.job4j.array;

/**
  *Class {@code RotateArray} используется для поворота двумерного массива по часовой стрелке.
  *@author Halmatov.
  *@since 19.10.2017.
*/
public class RotateArray {

  /**
    *Метод {@code rotate} поворачивает двумерный массив.
    *@param array - массив, который необходимо перевернуть
    *@return возвращает перевернутый массив.
  */
  public  int[][] rotate(int[][] array) {

		int sumIndex = 0;
		int subsEnd = 0;
		int temp = 0;
		int secTemp = 0;
		int end = array.length - 1;
		secTemp = array[sumIndex][subsEnd];
		for (int i = 0; i < (array.length / 2); i++) {

			for (int j = 0; j < (array.length - 1 - i * 2); j++) {

				sumIndex = i + j;
				subsEnd = end - i;
				temp = array[i][sumIndex];
				secTemp = array[sumIndex][subsEnd];
				array[sumIndex][subsEnd] = temp;
				temp = array[subsEnd][subsEnd - j];
				array[subsEnd][subsEnd - j] = secTemp;
				secTemp = array[subsEnd - j][i];
				array[subsEnd - j][i] = temp;
				array[i][sumIndex] = secTemp;

			}

		}

		return array;
  }
}