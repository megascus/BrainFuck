package megascus.brainfuck;

/**
 * バッファです。
 *
 * @author megascus
 */
class Buffer {

    private char[] buff = new char[30000];
    private int pointer = 0;

    public void next() {
        pointer++;
    }
    public void previous() {
        pointer--;
    }

    public void increment() {
        buff[pointer]++;
    }

    public void decrement() {
        buff[pointer]--;
    }

    public void putChar(char ch) {
        buff[pointer] = ch;
    }

    public char getChar() {
        return buff[pointer];
    }

}
