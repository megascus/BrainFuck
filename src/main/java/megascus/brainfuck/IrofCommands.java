package megascus.brainfuck;

import java.util.List;

import static java.util.Arrays.asList;

/**
 * @author megascus
 */
public class IrofCommands implements Commands {
    private final List<String> next = asList("足");
    private final List<String> previous = asList("ぐき");
    private final List<String> increment = asList("いろふ");
    private final List<String> decrement = asList("irof");
    private final List<String> putChar = asList("しろめ");
    private final List<String> getChar = asList("白目");
    private final List<String> open = asList("java");
    private final List<String> close = asList("groovy");

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