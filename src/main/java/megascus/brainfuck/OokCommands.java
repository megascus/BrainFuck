package megascus.brainfuck;

import java.util.List;

import static java.util.Arrays.asList;

/**
 * @author megascus
 */
public class OokCommands implements Commands {
    private final List<String> next = asList("Ook. Ook?");
    private final List<String> previous = asList("Ook? Ook.");
    private final List<String> increment = asList("Ook. Ook.");
    private final List<String> decrement = asList("Ook! Ook!");
    private final List<String> putChar = asList("Ook. Ook!");
    private final List<String> getChar = asList("Ook! Ook.");
    private final List<String> open = asList("Ook! Ook?");
    private final List<String> close = asList("Ook? Ook!");

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
