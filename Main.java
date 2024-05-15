public class Main {
    public static void main(String[] args){
        DoubleLinkedList dll = new DoubleLinkedList();
        dll.addFirst(45);
        dll.addFirst(10);
        dll.addFirst(10);
        dll.addFirst(15);
        dll.addFirst(150);
        dll.print();
        dll.deleteFirst();
        dll.print();
        //lanjutkan dengan memanggil method addLast, deleteLast, printFromTail
        //lanjutkan dengan memanggil method merge, split
        
        dll.deleteLast();
        dll.print();
        dll.printFromTail();
        System.out.print("Original list: ");
        dll.print();
        split(dll);
    }
    //No. 3 Kode Ganjil
    public static void merge(DoubleLinkedList dll1,
            DoubleLinkedList dll2){
        //complete this method
    }
    //No. 3 Kode Genap
    public static void split(DoubleLinkedList dll){
        //ex: 2,3,4,34,2,3,45,4 (original list)
        //list 1-> 2,3,4,34
        //list 2-> 2,3,45,4
        if (dll.size < 2) {
            return;
        }
        
        DoubleLinkedList dll1 = new DoubleLinkedList();
        DoubleLinkedList dll2 = new DoubleLinkedList();
        
        Node current = dll.head;
        int mid = dll.size / 2; 
        dll1.head = dll.head;
        for (int i = 0; i < mid; i++) {
            current = current.n;
        }
        dll1.tail = current;
        dll1.tail.n = null;
        
        if (dll1.tail.n != null) {
            dll2.head = dll1.tail.n;
            dll2.head.p = null;
            dll2.tail = dll.tail;
        } else {
            dll2.head = dll2.tail = dll.tail;
        }
        
        dll1.size = mid;
        dll2.size = dll.size - mid;
        
        System.out.print("List 1: ");
        dll1.print();
        System.out.print("List 2: ");
        dll2.print();
    }
}
