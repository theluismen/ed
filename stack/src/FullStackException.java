package bin;

public class FullStackException extends Exception {
    public FullStackException () {}
    public String toString () {
        return "Tried not allowed operation when stack is Full.";
    }
}
