package bin;

public class EmptyStackException extends Exception {
    public EmptyStackException () {}
    public String toString () {
        return "Tried not allowed operation when stack is Empty.";
    }
}
