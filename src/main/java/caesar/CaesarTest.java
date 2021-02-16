package caesar;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CaesarTest {
    private Caesar caesar = new Caesar();
    @Test
    public void ignoreEmptyStrings(){
        assertEquals("", caesar.encrypt("", 2));
    }
    public void readSentence(){
        String sentence ="hello world";
        assertEquals(sentence, caesar.encrypt(sentence, 2));

    }


}


