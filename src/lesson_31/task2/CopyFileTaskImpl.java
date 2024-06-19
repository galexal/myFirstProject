package lesson_31.task2;

import lesson_17.ICopyUtils;
import lesson_31.task2.exception.TaskExecutionFailedException;
import lesson_31.task2.intefaces.CopyFileTask;

public class CopyFileTaskImpl extends TaskImpl implements CopyFileTask {

    private String from;
    private String to;
    private ICopyUtils copyUtils;
    private int id;

    public CopyFileTaskImpl(String from, String to, int id) {
        this.from = from;
        this.to = to;
        this.id = id;
    }

    @Override
    public void setFileCopyUtils(ICopyUtils copyUtils) {
        this.copyUtils = copyUtils;
    }

    @Override
    public void execute() throws TaskExecutionFailedException {
        try{
            copyUtils.copy(from, to);
        }catch (Exception e){
            throw new TaskExecutionFailedException(e.getMessage(), e);
        }
    }

    @Override
    public int getId() {
        return id;
    }
}
