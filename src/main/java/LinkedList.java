public class LinkedList {

    public class Node {

        private int data;
        private Node next;

        public Node(int data){
            this.data = data;
        }

        public Node(int data, Node node){
            this.data = data;
            this.next = node;
        }
    }

    private Node start;

    public void LinkedList(Node start) {
        this.start = start;
    }

    public void LinkedList() {
        this.start = null;
    }


    public void insert(int data) {
        Node node = new Node(data);
        if (start == null){
            start = node;
        } else {
            Node temp = start;
            start = node;
            start.next = temp;
        }
    }

    public void display() {
        Node node = start;
        while(node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }
}
