package ru.job4j.loop;

/**
  *Class {@code Board} используется для построение шахматной доски.
  *@author Halmatov.
  *@since 08.10.2017.
*/
public class Board {

  /**
    *Метод {@code paint} рисует шахматную доску из символов x и пробелов.
    *@param width - ширина доски
	*@param height - высота доски
    *@return возвращает строку в виде шахматной доски.
  */
  public String paint(int width, int height) {
		StringBuilder builder = new StringBuilder();
		String temp = "x";
		for (int i = 0; i < height; i++) {

			for (int j = 0; j < width; j++) {
				builder.append(temp);
				temp = (temp == "x") ? " " : "x";
			}
			builder.append(System.getProperty("line.separator"));
		}
		return builder.toString();
  }
}