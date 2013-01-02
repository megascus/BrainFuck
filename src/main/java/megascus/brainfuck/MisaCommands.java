package megascus.brainfuck;

import java.util.List;

import static java.util.Arrays.*;

/**
 * このコマンドは以下のプログラミング言語misaの仕様をハックしたものです。<br/>
 * http://homepage2.nifty.com/kujira_niku/okayu/misa.html
 * <p/>
 * オリジナルの著作権はおかゆぱんち氏にあります。
 * <p/>
 * <pre>
 * > → ～ ー	ポインタを１進めます
 * < ← ★ ☆	ポインタを１戻します
 * + あ ぁ お ぉ	ポインタの指す値を１増やします
 * - っ ッ	ポインタの指す値を１減らします
 * . ！	ポインタの指す値を出力します
 * , ？	１文字入力を読み込んで、ポインタの指す値に設定します
 * [ 「 『	ループの開始を意味します。
 * ポインタの指す値が０ならループを終了して次へ進みます
 * ] 」 』	ループの終了を意味します。
 * この位置まで来ると、対応するループの先頭へ戻ります
 * </pre>
 *
 * @author megascus
 */
public class MisaCommands implements Commands {
    private final List<String> next = asList(">", "→", "～", "ー");
    private final List<String> previous = asList("<", "←", "★", "☆");
    private final List<String> increment = asList("+", "あ", "ぁ", "お", "ぉ");
    private final List<String> decrement = asList("-", "っ", "ッ");
    private final List<String> putChar = asList(",", "？");
    private final List<String> getChar = asList(".", "！");
    private final List<String> open = asList("[", "「", "『");
    private final List<String> close = asList("]", "」", "』");

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
