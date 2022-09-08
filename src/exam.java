class Node {
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}


public class exam {
    Node head;
    public void insertBeg(int data){
        Node n = new Node(10);

        if(head == null){
            head=n;
        }
        else{
            Node temp=head;
            while (temp.next !=null){

            }
        }
    }
    public static void main(String[] args) {
        exam a = new exam();
    }
}
