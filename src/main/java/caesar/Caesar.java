package caesar;

public class Caesar  {
    public static String encrypt(String plainText,int shift) {
        if (shift > 26) {
            shift = shift % 26;
        } else if (shift < 0) {
            shift = (shift % 26) + 26;
        }
}

public static void main (String[] args){
        }
}


