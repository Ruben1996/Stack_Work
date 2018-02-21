import static org.junit.Assert.*;

public class StackTest {
    Stack <String> pila;

    @org.junit.Before
    public void setUp() throws Exception{
        pila = new StackImpl<>(5);
        pila.push(1);
        pila.push(2);
    }

    @org.junit.After
    public void tearDown () throws Exception{
        this.pila = null;
    }

    @org.junit.Test
    public void push() throws Exception {
        asserNoEquals(3, pila.size());
        pila.push(3);
        assertEquals(3, pila.size());
    }
    @org.junit.Test
    public void pop() throws Exception {
        asserNoEquals(1, pila.size());
        pila.pop();
        assertEquals(1, pila.size());
    }
    @org.junit.Test
    public void size() throws Exception {
        pila.push(3);
        pila.push(4);
        pila.push(5);
        assertEquals(5, pila.size());
    }
    @org.junit.Test (expected = PilaBuida.class)
    public void pilaBuida() throws Exception {
        pila.pop();
        pila.pop();
        pila.pop();
    }
    @org.junit.Test (expected = PilaPlena.class)
    public void pilaPlena() throws Exception {
        pila.push(3);
        pila.push(4);
        pila.push(5);
        pila.push(6);
    }
}
