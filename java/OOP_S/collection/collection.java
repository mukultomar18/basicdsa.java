import java.util.*;

public class collection {

    public static void main(String[] args) {

        // ================= ARRAYLIST =================
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(30);
        arr.add(10);
        arr.add(20);
        arr.add(40);

        System.out.println("ArrayList: " + arr);

        System.out.println("Size: " + arr.size());

        System.out.println("Get index 1: " + arr.get(1));

        arr.set(1, 15);
        System.out.println("After set(): " + arr);

        arr.remove(2);
        System.out.println("After remove(): " + arr);

        System.out.println("Index of 40: " + arr.indexOf(40));

        arr.ensureCapacity(20);

        Collections.sort(arr);
        System.out.println("After sort(): " + arr);

        ArrayList<Integer> copy =
                (ArrayList<Integer>) arr.clone();
        System.out.println("Clone: " + copy);

        // Iterator
        System.out.print("Iterator Traversal: ");
        Iterator<Integer> it = arr.iterator();

        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // ================= LINKEDLIST =================
        LinkedList<Integer> ll = new LinkedList<>();

        ll.addFirst(100);
        ll.addLast(200);
        ll.addLast(300);

        System.out.println("\nLinkedList: " + ll);

        System.out.println("First: " + ll.getFirst());
        System.out.println("Last: " + ll.getLast());

        ll.removeFirst();
        ll.removeLast();

        System.out.println("After removals: " + ll);

        // ================= QUEUE =================
        Queue<Integer> q = new LinkedList<>();

        q.offer(1);
        q.offer(2);
        q.offer(3);

        System.out.println("\nQueue: " + q);

        System.out.println("Peek: " + q.peek());

        System.out.println("Poll: " + q.poll());

        System.out.println("Queue after poll: " + q);

        // ================= VECTOR =================
        Vector<Integer> vector = new Vector<>();

        vector.add(11);
        vector.add(22);
        vector.add(33);

        System.out.println("\nVector: " + vector);

        // ================= STACK =================
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("\nStack: " + stack);

        System.out.println("Peek: " + stack.peek());

        System.out.println("Search 20: " + stack.search(20));

        System.out.println("Pop: " + stack.pop());

        System.out.println("Stack after pop: " + stack);

        // ================= CLEAR =================
        arr.clear();

        System.out.println("\nArrayList after clear(): " + arr);
    }
}