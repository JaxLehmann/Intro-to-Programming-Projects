import java.util.Random;

public class Fortunes {
    
    static String[] fortunes = {
        "Do not be afraid of competition.",
        "An exciting opportunity lies ahead of you.",
        "You love peace.",
        "Get your mind set… confidence will lead you on.",
        "You will always be surrounded by true friends.",
        "Sell your ideas-they have exceptional merit.",
        "Your ability to juggle many tasks will take you far.",
        "You are wise beyond your years." };

    public static void main(String[] args) {
    	Random rand = new Random();
    	int r = rand.nextInt(fortunes.length);
    	System.out.println(fortunes[r]);
    }
}