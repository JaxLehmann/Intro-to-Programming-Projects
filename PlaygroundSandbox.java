import java.util.*;

public class PlaygroundSandbox {
    public static void main(String [] args) {
        // ---- stacks ----
        Stack <Integer> bananas = new Stack<>();
        bananas.push(1);
        bananas.push(2);
        bananas.push(3);

        System.out.println("Bananas right now " + bananas);
        System.out.println("Bananas top " + bananas.peek());
        System.out.println("Bananas removing top banana " + bananas.pop());
        System.out.println("Bananas after popping top banana " + bananas);

        // ---- queues ----
        Queue<String> queue = new LinkedList<>();
        queue.add("kid1");
        queue.add("kid2");
        queue.add("kid3");

        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue);

        // ---- maps ----
        Map<String, Integer> map = new HashMap<>();
        map.put("Apples", 5);
        map.put("Cranberries", 7);
        map.put("Grapes", 9);

        System.out.println(map);
        System.out.println(map.get("Cranberries"));
        map.put("Cranberries", 10);
        System.out.println(map);

        Map<String, Integer> settings = new HashMap<>();
        settings.putIfAbsent("volume", 50);
        settings.putIfAbsent("volume", 100);
        System.out.println(settings);
    }
}
