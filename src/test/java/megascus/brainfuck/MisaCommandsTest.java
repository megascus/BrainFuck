package megascus.brainfuck;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * @author megascus
 */
/*
 * テスト用のデータとして以下のページのサンプルを使用させていただきました。
 * http://homepage2.nifty.com/kujira_niku/okayu/misa.html
 */
public class MisaCommandsTest {
    private BrainFuck fuck;

    @Before
    public void setUp() {
        fuck = new BrainFuck(new MisaCommands());
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

    @Test
    public void testFuck3() throws Exception {
        String helloWorld = "ああああああああ　ああああああああ　ああああああああ　ああああああああ\n" +
                "ああああああああ　ああああああああ！　あ！あ！あ！あ！あ！あ！あ！あ！あ！";
        assertThat(fuck.fuck(helloWorld), is("0123456789"));
    }

    @Test
    public void testFuck4() throws Exception {
        String helloWorld = "ごっ、ごぉおっ、ご～きげんよおぉおおぉおほっ。ほおぉおぉおっ。\n" +
                "\n" +
                "「ごきげん☆みゃぁああ”あ”ぁ”ぁああ～っ」\n" +
                "\n" +
                "さわやかな朝の☆ご挨拶！　お挨拶がっ。\n" +
                "澄みきった青空にこだましちゃうぉ～ああぉおおおぉん。\n" +
                "\n" +
                "「は、はひっ、はろおぉっ☆わぁるどおおぉっぉ～っ」\n" +
                "\n" +
                "こ、この文章は☆おサンプル！　おおぉおぉおおサンプルプログラム！！\n" +
                "どんなおプログラム言語でも基本のご挨拶させていただくのぉぉおッ！\n" +
                "\n" +
                "「ぽうっ」\n" +
                "\n" +
                "長々と書くのがこ、ここでの～、ここでのぉおおぉおぉぉおたしなみぃぃいぃ。\n" +
                "\n" +
                "「長いぃ。長すぎましゅう。ご挨拶にこんなプログラム長すぎまひゅぅうぅ☆\n" +
                "　んおおぉぉ、ばかになる、おばかになっちゃいましゅ～ッ」\n" +
                "\n" +
                "長いのがっ、バッファの奥まで入ってきましゅたぁあぁあっ！\n" +
                "ばっふぁ☆溢れちゃいまひゅぅ～。あみゃぁあ”あ”ぁ”ぁああ”あ”ぁぁ。\n" +
                "\n" +
                "「で、出ます☆　んおおぉぉおおっ、エラー出ちゃいまひゅっ」\n" +
                "\n" +
                "ほひぃ☆！　え、えらーっ、んお”お”ぉお”お”ぉおぉおおぉっっ。\n" +
                "\n" +
                "「出た☆　出た出た出た出たぁぁあっ　えらあぴゅるーっって出たあぁっ」\n" +
                "\n" +
                "はしたない☆！　ぉおおぉはしたないっ！　おはしたない言語ですっっっっっっっ！\n" +
                "おほっほおぉっっっほおぉっっっっっっっっっ！\n" +
                "\n" +
                "「えらあらいしゅきぃぃぃいぃっっ」\n" +
                "\n" +
                "止まらない　すごい　エラーみるく\n" +
                "こってりしたのがいっぱい出てるよぉぉぉおおぉぉおおぉぉおっっ。\n" +
                "\n" +
                "「んほぉっ☆ っおぉぉぉおお国が分からなくなっちゃいまひゅう～っ」\n" +
                "\n" +
                "ま、まだ出るぅ☆　出てるのおぉっ☆　エラーまだまだ出ましゅぅぅ！\n" +
                "ばんじゃ～ぁぁあい、ばんじゃいぃぃ、ばんにゃんじゃぁんじゃあぁぁああぁい！";
        assertThat(fuck.fuck(helloWorld), is("Hello World!\n"));
    }
}
