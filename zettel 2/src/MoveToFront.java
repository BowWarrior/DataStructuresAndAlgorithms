import java.util.NoSuchElementException;

public class MoveToFront<E> extends SimpleLinkedList<E>{
    //getLast(), get() need to be changed
    //don't need to do getFirst because it is already in the first position

    @Override
    public E get(int n){
        Node<E> node = getPointer(n);
        if(n==0){
            return (E) head.next.element;
        }
        getPointer(n-1).next = getPointer(n).next;
        node.next = head.next;
        head.next = node;

        return (E) node.element;
    }

    public static void main(String[] args) {
        MoveToFront<Integer> linkedList = new MoveToFront<>();
        for(int i = 0; i < 10; i++){
            linkedList.addLast(i);
        }

        linkedList.get(0);

        //prints list so I can check it
        for(int i = 0; i < linkedList.size(); i++){
            System.out.println(linkedList.get(i)); //this flips the list
            //System.out.println(linkedList.get(linkedList.size()-1)); //counts from the end of the list
        }
    }
}
