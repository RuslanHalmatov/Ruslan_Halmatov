/**
* Package for calculate task.
*
* @author Ruslan Halmatov (mailto:HalmatovJava@yandex.ru)
* @version $Id$
* @since 25.09.2017
*/
package ru.job4j.calculator;

public class Calculator {
    private double result;
    
    public void add(double first, double second) {
        this.result = first + second;
    }
	
	public void subtract(double first, double second) {
        this.result = first - second;
    }
	
	public void div(double first, double second) {
        this.result = first / second;
    }
	
	public void multiple(double first, double second) {
        this.result = first * second;
    }
    
    public double getResult() {
        return this.result;
    }
	
	
}