package megascus.brainfuck;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

/**
 * @author megascus
 */
public class BrainFuckTest {

    private BrainFuck fuck;

    @Before
    public void setUp() {
        fuck = new BrainFuck(new BrainFuckCommands());
    }

    @Test
    public void 基本入出力ができること() throws Exception {
        String helloWorld = "++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++.\n" +
                "+++++++++++++++++++++++++++++.+++++++..+++.\n" +
                "-------------------------------------------------------------------------------.\n" +
                "+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++.\n" +
                "--------.+++.------.--------.";
        assertThat(fuck.fuck(helloWorld), is("Hello world"));
    }

    @Test
    public void ループができること() throws Exception {
        String helloWorld = "+++++++++[>++++++++>+++++++++++>+++++<<<-]>.>++.+++++++..+\n" +
                "++.>-.------------.<++++++++.--------.+++.------.--------.>+.";
        assertThat(fuck.fuck(helloWorld), is("Hello, world!"));
    }
}
