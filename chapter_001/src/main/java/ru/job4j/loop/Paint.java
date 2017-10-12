package ru.job4j.loop;

/**
  *Class {@code Paint} используется для построение пирамиды.
  *@author Halmatov.
  *@since 12.10.2017.
*/
public class Paint {

  /**
    *Метод {@code piramid} рисует пирамиду из символов ^ и пробелов.
    *@param h - высота пирамиды
    *@return возвращает строку в виде пирамиды.
  */
  public String piramid(int h) {
		StringBuilder builder = new StringBuilder();
		int length = h + h - 1;
		int end = length - 1;
		int middle = length / 2;

		for (int i = 0; i < h; i++) {

			for (int j = 0; j < length; j++) {

				if (j <= middle) {

					if (middle - i <= j && j <= middle) {

						builder.append("^");

					} else {

						builder.append(" ");

					}
				} else {

					if (j <= middle + i) {

						builder.append("^");
					} else {

						builder.append(" ");
					}
				}

			}

			builder.append(System.getProperty("line.separator"));

		}

		return builder.toString();
  }
}