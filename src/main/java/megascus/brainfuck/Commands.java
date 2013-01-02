package megascus.brainfuck;

import java.util.List;

/**
 * BrainFuckのコマンドを表します。
 * 一つのコマンドに複数の文字(列)を定義することができます。
 * 一つの文字(列)が複数のコマンドに解釈できる場合の動作は未定義です。
 *
 * @author megascus
 */
public interface Commands {
    /**
     * ポインタをインクリメントします。
     */
    List<String> getNext();

    /**
     * ポインタをデクリメントします。
     */
    List<String> getPrevious();

    /**
     * ポインタの値をインクリメントします。
     */
    List<String> getIncrement();

    /**
     * ポインタの値をデクリメントします。
     */
    List<String> getDecrement();

    /**
     * ポインタの値を出力に書き出します。
     */
    List<String> getPutChar();

    /**
     * ポインタに入力の値を代入します。
     */
    List<String> getGetChar();

    /**
     * ポインタの値が0の時に対応する {@link Commands#getClose()} の直後までジャンプします。
     */
    List<String> getOpen();

    /**
     * ポインタの値が0でない時に対応する {@link Commands#getOpen()} にジャンプします。
     */
    List<String> getClose();
}
