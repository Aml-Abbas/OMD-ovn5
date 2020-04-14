import java.util.EmptyStackException;
import java.util.Vector;

/*
 * The stack shouldn't inherit from Vector directly
 * It should use Vector as attribute
 */
public class Stack<T> {
   // compisition att ha ett attribute
    private Vector<T> vector;

    public Stack() {
        this.vector = new Vector<>();
    }

    public T push(T element) {
        vector.addElement(element);
        return element;
    }

    public T pop(T element) {
        if (vector.size() == 0)
            throw new EmptyStackException();
        T obj = vector.get(vector.size()- 1);
        vector.remove(obj);
        return obj;
    }
    public T peek(){
        if (vector.size() == 0)
            throw new EmptyStackException();
        return vector.get(vector.size()- 1);
    }

    public boolean empty(){
        return vector.size()==0;
    }

    public int search(Object o){
        int index= vector.size()-1;
        while (index>=0){
            if (vector.get(index).equals(o)){
                return index;
            }
            index--;
        }
        return -1;
    }
}
