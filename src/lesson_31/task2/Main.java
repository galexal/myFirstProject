package lesson_31.task2;

import lesson_17.CopyWithGuava;
import lesson_31.task2.intefaces.CopyFileTask;
import lesson_31.task2.intefaces.TaskExecutor;
import lesson_31.task2.intefaces.TasksStorage;

public class Main {

    public static void main(String[] args) {


        CopyFileTask task1 = new CopyFileTaskImpl("/Users/galexal/Downloads/TestMovie.mkv", "1.mkv", 1);
        CopyFileTask task2 = new CopyFileTaskImpl("/Users/galexal/Downloads/TestMovie.mkv", "2.mkv", 2);
        CopyFileTask task3 = new CopyFileTaskImpl("/Users/galexal/Downloads/TestMovie.mkv", "3.mkv", 3);
        CopyFileTask task4 = new CopyFileTaskImpl("/Users/galexal/Downloads/TestMovie.mkv", "4.mkv", 4);
        CopyFileTask task5 = new CopyFileTaskImpl("/Users/galexal/Downloads/TestMovie111.mkv", "5.mkv", 5);


        task1.setFileCopyUtils(new CopyWithGuava());
        task2.setFileCopyUtils(new CopyWithGuava());
        task3.setFileCopyUtils(new CopyWithGuava());
        task4.setFileCopyUtils(new CopyWithGuava());
        task5.setFileCopyUtils(new CopyWithGuava());


        TasksStorage tasksStorage = new TaskStorageImpl();
        tasksStorage.add(task1);
        tasksStorage.add(task2);
        tasksStorage.add(task3);
        tasksStorage.add(task4);
        tasksStorage.add(task5);

        TaskExecutor executor1 = new TaskExecutorImpl();
        TaskExecutor executor2 = new TaskExecutorImpl();
        TaskExecutor executor3 = new TaskExecutorImpl();

        executor1.setStorage(tasksStorage);
        executor2.setStorage(tasksStorage);
        executor3.setStorage(tasksStorage);

        executor1.start();
        executor2.start();
        executor3.start();
    }
}
