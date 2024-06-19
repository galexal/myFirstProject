package lesson_31.task2;

import lesson_31.task2.intefaces.Task;

public abstract class TaskImpl implements Task {

    private int tryCount = 0;

    @Override
    public int getTryCount() {
        return tryCount;
    }

    @Override
    public void incTryCount() {
        tryCount++;
    }

}
