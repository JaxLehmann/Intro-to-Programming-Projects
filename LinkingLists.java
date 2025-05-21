import java.util.LinkedList;

public class LinkingLists {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        /*
        Linked List as a Stack
        linkedList.push("A");
        linkedList.push("B");
        linkedList.pop();
        */
        // Linked List as a Queue
        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("E");
        // linkedList.poll();
        linkedList.add(4, "F");
        linkedList.remove("F");
        System.out.println(linkedList.indexOf("A"));
        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());
        linkedList.addFirst("0");
        linkedList.addLast("G");
        String first = linkedList.removeFirst();
        String last = linkedList.removeLast();

        System.out.println(linkedList);
    }
}
/*
Comparing arrays and arrays list
Arrays and Arraylists store elements in contiguous memory locations
Struggle for insertion, everything needs to shift to make room, struggles with deletion too
Linked lists have an advantage for insertion and deletion
Contains data and a pointer to the next box
Nodes are noncontiguous, can be anywhere in memory
Each node knows where next node resides
Insertion and deletion is easy, just need to move the pointer
Inferior at searching, start at head, works way through towards the element (On)
Doubly LL- Stores previous address and next address for next node as well as data, traverse head to tail or tail to head
Uses more memory
 */
