import java.util.EmptyStackException;
import java.util.Vector;

/*
 * The stack shouldn't inherit from Vector directly
 * It should use Vector as attribute
 */
public class Stack<T> {
    Vector<T> vector;

    public Stack() {
        this.vector = new Vector<>();
    }

    public T push(T element) {
        vector.addElement(element);
        return element;
    }

    public synchronized T pop(T element) {
        if (vector.size() == 0)
            throw new EmptyStackException();
        T obj = vector.get(vector.size()- 1);
        vector.remove(obj);
        return obj;
    }


}
