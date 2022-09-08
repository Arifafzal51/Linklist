class NodeNew{
        int data;
        Node next;
        NodeNew(int x){
            data=x;
            next=null;
        }
    }

    class Test
    {
        public static void main(String[] args) {
            Node head = new Node(10);
            Node temp1 = new Node(20);
            Node temp2= new Node(30);
            head.next=temp1;
            temp2.next=temp2;
        }
    }

