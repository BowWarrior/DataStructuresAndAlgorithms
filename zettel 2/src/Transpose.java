import java.util.NoSuchElementException;

public class Transpose<E> extends SimpleLinkedList<E>{
    //getLast(), get() need to be changed
    //don't need to do getFirst because it is already in the first position

    @Override
    public E get(int n){
        Node<E> node1 = getPointer(n);
        Node<E> node2 = getPointer(n-1);
        Node<E> node3 = getPointer(n-2);
        Node<E> tempPointer = node3.next;
        if(n==0){
            return (E) head.next.element;
        }
        if(n==1){
            node2.next = node1.next;
            node1.next = node2;
            head.next = node1;
            return (E) head.next.element;
        }

        node3.next = node2.next;
        node2.next = node1.next;
        node1.next = node2;





        return (E) node1.element;
    }



    public static void main(String[] args) {
        Transpose<Integer> linkedList = new Transpose<>();
        for(int i = 0; i < 10; i++){
            linkedList.addLast(i);
        }

        linkedList.get(6);
        linkedList.get(5);

        //prints list so I can check it
        for(int i = 0; i < linkedList.size(); i++){
            System.out.println(linkedList.get(i));
        }

    }
}
