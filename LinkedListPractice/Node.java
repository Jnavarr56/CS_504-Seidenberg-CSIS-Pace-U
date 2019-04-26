public class Node {

    public Node prev;
    public Node next;
    private String data;
    

    public Node() {
        
        next = null;

        prev = null;

    }

    public Node(String data) {

        this.data = data;
        
        next = null;

        prev = null;

    }

    public void setData(String data) {

        this.data = data;

    }

    public String getData() {

        return data;

    }

    public void setNext(Node next) {

        this.next = next;

    }

    public Node getNext() {

        return next;

    }
    
    public void setPrev(Node prev) {

        this.prev = prev;

    }

    public Node getPrev() {

        return prev;

    }

}