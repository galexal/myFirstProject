package lesson_31.task2.intefaces;

import lesson_31.task2.exception.TaskExecutionFailedException;

/**
 * Интерфейс абстрактной задачи. 
 * 
 * @author nedis
 * @version 1.0
 */
public interface Task {

	/**
	 * Возвращает количество попыток исполнения задачи
	 * 
	 * @return количество попыток исполнения задачи
	 */
	int getTryCount();
	
	/**
	 * Увеличить количество попыток исполнения задачи на 1. 
	 */
	void incTryCount();
	
	/**
	 * Метод, который исполняет задачу. 
	 * 
	 * @throws TaskExecutionFailedException если задача не была выполнена корректно
	 */
	void execute() throws TaskExecutionFailedException;

	int getId();
}
