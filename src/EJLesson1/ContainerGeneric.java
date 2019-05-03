package EJLesson1;

public class ContainerGeneric<T> {
    private T obj;

    public ContainerGeneric(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }
}
