import java.util.LinkedList;
import java.util.Stack;

public class reverse {
   static LinkedList<Integer> ll = new LinkedList<>();
   static Stack<Integer> Stack = new Stack<>();

    public static void main(String[] args) {

        input();
        while(!ll.isEmpty()){
            Stack.push(ll.get(0));
            ll.remove(0);
        }
        while(!Stack.isEmpty()){
            ll.add(Stack.pop());
        }
        System.out.println("rev ll is ");

        for(int item:ll)
        {
            System.out.println(item +"\t");
        }
    }

    static void input(){
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.add(6);
        ll.add(7);
        ll.add(8);
        ll.add(9);
        ll.add(10);

    }
}
