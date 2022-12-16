package linkedlist;

public class RemoveLoop {
    public static void main(String[] args) {
        Node h = new Node(null);
//        makeCirculerLinkedList(h);
//        findAndRemoveLoop(h);
        makeLinkedList(h);
//        h=reverseLinkedListInLoop(h.next);
        h=reverseLinkedListRecursion(h.next);
        while (h != null) {
            System.out.println(h.val);
            h = h.next;
        }

    }

    public static Node reverseLinkedListInLoop(Node head) {
        Node curr = head;
        Node prev = null;
        Node next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head=prev;
        return head;
    }

    public static Node reverseLinkedListRecursion(Node head)
    {

            if (head == null || head.next == null)
                return head;

        /* reverse the rest list and put
        the first element at the end */
            Node rest = reverseLinkedListRecursion(head.next);
            head.next.next = head;

            /* tricky step -- see the diagram */
            head.next = null;

            /* fix the head pointer */
            return rest;

    }
    public static void findAndRemoveLoop(Node n) {
        if (n.next == null) {
            return;
        }
        Node s = n;
        Node f = n;
        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next.next;
            if (s == f) {
                break;
            }
        }

        if (s == f) {
            s = n;
            if (s != f) {
                while (f.next != s.next) {
                    f = f.next;
                    s = s.next;
                }
                f.next = null;
            } else {
                while (f.next != s) {
                    f = f.next;
                }
                f.next = null;
            }
        }


    }

    public static void makeCirculerLinkedList(Node n) {
        Node h = n;
        Node l;
        if (n.val == null) {
            n.next = new Node("a");
            n.next.next = new Node("b");
            n.next.next.next = new Node("c");
            n.next.next.next.next = new Node("d");
            n.next.next.next.next.next = new Node("e");
            n.next.next.next.next.next.next = new Node("f");
            n.next.next.next.next.next.next.next = new Node("g");
            n.next.next.next.next.next.next.next.next = new Node("h");
            n.next.next.next.next.next.next.next.next.next = new Node("i");
            n.next.next.next.next.next.next.next.next.next.next = n.next.next.next.next;
        }
    }

    public static void makeLinkedList(Node n) {
        Node h = n;
        Node l;
        if (n.val == null) {
            n.next = new Node("a");
            n.next.next = new Node("b");
            n.next.next.next = new Node("c");
            n.next.next.next.next = new Node("d");
            n.next.next.next.next.next = new Node("e");
            n.next.next.next.next.next.next = new Node("f");
            n.next.next.next.next.next.next.next = new Node("g");
            n.next.next.next.next.next.next.next.next = new Node("h");
            n.next.next.next.next.next.next.next.next.next = new Node("i");
        }
    }
}

class Node {
    String val;
    Node next, prev;

    public Node(String val) {
        this.val = val;
    }
}