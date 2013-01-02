package megascus.brainfuck;

import static java.util.Arrays.asList;
import java.util.List;

/**
 * @author megascus
 */
public class BrainFuckCommands implements Commands {
    private final List<String> next = asList(">");
    private final List<String> previous = asList("<");
    private final List<String> increment = asList("+");
    private final List<String> decrement = asList("-");
    private final List<String> putChar = asList(",");
    private final List<String> getChar = asList(".");
    private final List<String> open = asList("[");
    private final List<String> close = asList("]");

    @Override
    public List<String> getNext() {
        return next;
    }

    @Override
    public List<String> getPrevious() {
        return previous;
    }

    @Override
    public List<String> getIncrement() {
        return increment;
    }

    @Override
    public List<String> getDecrement() {
        return decrement;
    }

    @Override
    public List<String> getPutChar() {
        return putChar;
    }

    @Override
    public List<String> getGetChar() {
        return getChar;
    }

    @Override
    public List<String> getOpen() {
        return open;
    }

    @Override
    public List<String> getClose() {
        return close;
    }
}