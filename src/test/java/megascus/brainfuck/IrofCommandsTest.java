package megascus.brainfuck;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * @author megascus
 */
public class IrofCommandsTest {
    private BrainFuck fuck;

    @Before
    public void setUp() {
        fuck = new BrainFuck(new IrofCommands());
    }

    @Test
    public void helloWorld() throws Exception {
        String helloWorld = "いろふいろふいろふいろふいろふいろふいろふいろふいろふjava足いろふいろふいろふいろふいろふいろふいろふいろふ足いろふいろふいろふいろふいろふいろふいろふいろふいろふいろふいろふ足いろふいろふいろふいろふいろふぐきぐきぐきirofgroovy足白目足いろふいろふ白目いろふいろふいろふいろふいろふいろふいろふ白目白目いろふいろふいろふ白目足irof白目irofirofirofirofirofirofirofirofirofirofirofirof白目ぐきいろふいろふいろふいろふいろふいろふいろふいろふ白目irofirofirofirofirofirofirofirof白目いろふいろふいろふ白目irofirofirofirofirofirof白目irofirofirofirofirofirofirofirof白目足いろふ白目";
        assertThat(fuck.fuck(helloWorld), is("Hello, world!"));
    }
}
