public class Utama {
    public static void main(String[] args) {
    System.out.println("**    Simulasi Single Linked List    **\n");
    
    SinglyLinkedList singleLinkedList = new SinglyLinkedList();    // bikin linkedlist namanya singleLinkedList
    Node a = new Node(1);        // bikin node a isinya ip=1
    Node b = new Node(2);        // bikin node b isinya ip=2
    Node c = new Node(3);        // bikin node c isinya ip=3
    Node d = new Node(4);        // bikin node d isinya ip=4
    Node e = new Node(5);        // bikin node e isinya ip=5
    singleLinkedList.addLast(a);    // @ node di-addLast
    singleLinkedList.addLast(b);
    singleLinkedList.addLast(c);
    singleLinkedList.addLast(d);
    singleLinkedList.addLast(e);
    
    System.out.println("Node awal");
    singleLinkedList.cetakSemuaNode();    // dicetak, output : 1 2 3 4 5
    System.out.print("\n");
    
    singleLinkedList.removeFirst();        // ngeremove awal. output : 2 3 4 5
    singleLinkedList.removeLast();        // ngeremove akhir. output : 2 3 4
    System.out.println("\nSetelah diremoveFirst (1) & removeLast (5)");
    singleLinkedList.cetakSemuaNode();    // dicetak, output : 2 3 4
    System.out.print("\n");
    
    singleLinkedList.remove(3);        // ngeremove 3. output : 2 4
    System.out.println("\nSetelah diremove (3)");
    singleLinkedList.cetakSemuaNode();
    System.out.print("\n");
    
    singleLinkedList.insertAfter(4,5);    // masukin 5 setelah 4
    System.out.println("\nSetelah di-insertAfter  (insert 5 after 4)");
    singleLinkedList.cetakSemuaNode();        // output : 2 4 5
    System.out.print("\n");
    
    singleLinkedList.insertBefore(4,3);    // masukin 3 sebelum 4
    System.out.println("\nSetelah di-insertBefore (insert 3 before 4)");
    singleLinkedList.cetakSemuaNode();        // output : 2 3 4 5
    System.out.print("\n");
    
    System.out.println(" ");
    singleLinkedList.find(1);            // nyari 1, tapi di list tidak ada data 1
    System.out.print("\n");                // shg outputnya Ga ketemu !!!
    
    singleLinkedList.find(5);            // nyari 5, di list ada
    System.out.println(" ");            // shg outputnya Ketemu !!!
    }
    }