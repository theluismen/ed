package bin;

public class StaticStack {
    /* Atributos */
    public int[]   data;
    public int     nElem;
    /* Constructor */
    public StaticStack ( int size ) {
        this.data  = new int[ size ];
        this.nElem = 0;
    }
    /* Metodos */
    /* Function to check is the stack is empty */
    public boolean isFull () {
        return this.nElem >= this.data.length;
    }

    /* Function to check is the stack is empty */
    public boolean isEmpty () {
        return this.nElem == 0;
    }

    /* Function to push a new element at the top of the stack */
    public void push ( int n ) throws FullStackException {
        if ( this.isFull() ) {
            throw new FullStackException();
        } else {
            this.data[nElem] = n;
            this.nElem ++;
        }
    }

    /* Function to delete the element at the top of the stack  */
    public void pop () throws EmptyStackException {
        if ( this.isEmpty() ) throw new EmptyStackException();
        this.nElem--;
    }

    /* Function to get the element at the top of the stack  */
    public int top () throws EmptyStackException {
        if ( this.isEmpty() ) throw new EmptyStackException();
        return this.data[this.nElem - 1];
    }

    /* Function to show the elements in the stack */
    public void show () {
        int i;
        for ( i = this.data.length - 1; i >= 0; i--) {
            System.out.println(" " + this.data[ i ]);
        }
    }
}
