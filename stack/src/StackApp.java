package bin;

public class StackApp {
    public static void main ( String[] args ) {
        StaticStack sstack = new StaticStack( 10 );
        int i;
        try {
            for ( i = 0; i < 10; i++ ) {
                sstack.push( i + 100 );
            }
            sstack.show();
            System.out.println(sstack.nElem);
            while ( ! sstack.isEmpty() ) {
                System.out.println(sstack.top());
                sstack.pop();
            }
        } catch ( EmptyStackException e ) {
            System.out.println("EXCEPION:" + e.toString());
        } catch ( FullStackException e ) {
            System.out.println("EXCEPION:" + e.toString());
        }
    }
}
