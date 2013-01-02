package megascus.brainfuck;

import java.util.List;
import java.util.regex.Pattern;

/**
 * @author megascus
 */
final class PatternBuilder {
    private static String buildString(Commands cmd) {
        return "(" + quote(cmd.getClose()) + "|" + quote(cmd.getDecrement()) + "|" + quote(cmd.getGetChar()) + "|" + quote(cmd.getIncrement()) + "|" + quote(cmd.getNext()) + "|" + quote(cmd.getOpen()) + "|" + quote(cmd.getPrevious()) + "|" + quote(cmd.getPutChar()) + ")";
    }

    private static String quote(List<String> list) {
        StringBuilder build = new StringBuilder();
         for(String s:list) {
             build.append(Pattern.quote(s)).append("|");
         }
        return build.deleteCharAt(build.length() - 1).toString();
    }

    static Pattern build(Commands cmd) {
        return Pattern.compile(buildString(cmd));
    }
}
