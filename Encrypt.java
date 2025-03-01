public class Encrypt {
    private int key;
    private char[] chars;

    // Constructor
    public Encrypt(int key, char[] chars) {
        this.key = key;
        this.chars = chars;
    }

    // Encryption method
    public String encrypt() {
        char[] encryptedChars = new char[chars.length];

        for (int i = 0; i < chars.length; i++) {
            encryptedChars[i] = (char) (chars[i] + key); // Use key instead of hardcoding '5'
        }
        return new String(encryptedChars);
    }

    public static void main(String[] args) {
        char[] inputChars = {'H', 'e', 'l', 'l', 'o'};
        Encrypt encryption = new Encrypt(5, inputChars);
        String encryptedString = encryption.encrypt();
        System.out.println(encryptedString); // Should print "Mjqqt"
    }
}