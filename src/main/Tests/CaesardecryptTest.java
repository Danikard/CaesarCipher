import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CaesardecryptTest {
    private Caesardecrypt caesar = new Caesardecrypt();

    @Test
    public void ignoreEmptyStrings() {
        assertEquals("", caesar.decrypt("", 2));
    }

    public void readSentence() {
        String sentence = "hello world";
        assertEquals(sentence, caesar.decrypt(sentence, 2));

    }
}