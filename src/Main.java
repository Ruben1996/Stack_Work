import java.util.logging.Logger;

public class Main {
    private static final Logger LOGGER = Logger.getLogger( Main.class.getName());
    public static StackImp<String> stack;

    public static void main(String[] args)
    {
        stack = new StackImp <String> ();
        stack.push("1");
        LOGGER.info("Meto un 1 en el stack");
        stack.push("2");
        LOGGER.info("Meto un 2 en el stack");
        stack.push("3");
        LOGGER.info("Meto un 3 en el stack");
        stack.push("4");
        LOGGER.info("Meto un 4 en el stack");
        stack.push("5");
        LOGGER.info("Meto un 5 en el stack");

        stack.pop();
        stack.pop();



    }
}
