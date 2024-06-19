package lesson_31.task2;

import lesson_31.task2.intefaces.Task;
import lesson_31.task2.intefaces.TasksStorage;

import java.util.ArrayList;
import java.util.List;

public class TaskStorageImpl implements TasksStorage {
    private List<Task> tasks = new ArrayList<>();

    @Override
    public synchronized void add(Task task) throws NullPointerException {
        if (task == null) {
            throw new NullPointerException("Задача не может быть null");
        }
        tasks.add(task);
    }

    @Override
    public synchronized Task get() {
        if (tasks.isEmpty()) {
            return null;
        } else {
            return tasks.remove(0);
        }
    }

    @Override
    public synchronized int count() {
        return tasks.size();
    }
}
