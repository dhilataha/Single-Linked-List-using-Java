public class SinglyLinkedList{
	Node head;                        // node yg paling depan
	Node tail;                         // node yg paling blakang
	

	void addFirst(Node input){      // add Node di depan
		if(head == null){            // kalo linkedlist masi kosong
			head = input;            // input diposisikan sbg head sekaligus tail
			tail = input;
		}
		else{                        // kalo linkedlist udah ada isi
			input.next = head;
			head = input;             // posisi head ada pada input, tail tetap cz nambah di depan
		}
	}
	
	void addLast(Node input){          // add Node di belakang
	    if(head == null){            // kalo linkedlist masi kosong
	        head = input;            // input diposisikan sbg head sekaligus tail
	        tail = input;
	    }
	    else{                        // kalo linkedlist udah ada isi
	        tail.next = input;
	        tail = input;            // posisi tail digeser ke input, head tetap cz nambah di belakang
	    }
	}
	
	void find(int key){                    // method buat nyari node ,,  key = nod yang dicari
		Node pointer = head;            // bikin node pointer di head
		System.out.println("Proses pencarian angka "+key);
		while(pointer!=null){            // nge-loop terus sampe ketemu null
			if(pointer.ip == key){        // kalo pointer = key, print Ketemu!!
				System.out.println("Ketemu!!");
			break;
			}
			else                        // kalo ga sama, pointer digeser ke next-nya
				pointer = pointer.next;
			}
	if(pointer == null)                // kalo pointer uda sampe null, tapi blon ketemu key, print ga Ketemu!!
	System.out.println("ga Ketemu!!");
	
	}
	public Node Find (int data) {        // Node Find, konsepnya sama kayak void find, bedanya Node Find bisa me-return cz bukan void
	Node search = head;                    // bikin node search di head, konsep search sama kayak konsep pointer di void find
	while (search!=null) {                // nge-loop terus sampe ketemu null
	if(search.ip == data)             // kalo search = key, return search
	return search;
	search = search.next;
	}
	return null;                        // kalo pointer uda sampe null, tapi blon ketemu key, return null
	}
	
	void cetakSemuaNode(){                    // nge-cetak semua node pd linkedlist
	Node temp;                            // bikin node temp di head
	temp = head;
	while (temp!=null){                    // nge-loop terus sampe ketemu null
	System.out.print(" "+ temp.ip);    // nge-cetak node satu per satu
	temp = temp.next;
	}
	}
	
	void removeFirst(){                // remove node terdepan
	if(head!=null){
	if(head==tail){
	head = null;
	tail = null;
	}
	else{
	head = head.next;        // posisi head digeser ke next-nya, shg otomatis head awalnya ilang
	}
	}
	}
	
	void removeLast(){            // remove node paling blakang
	if(head!=null){
	if(head==tail){
	head = null;
	tail = null;
	}
	else{
	Node temp = head;            // bikin node temp di head
	while(temp.next!=tail){        // nge-loop terus sampe ketemu tail
	temp = temp.next;        // pointer digeser ke next-nya
	}
	tail=temp;
	temp.next=null;
	}
	}
	}
	
	void remove(int data){                // remove sesuai data yg ingin diremove
	Node pointer = Find(data);        // menepatkan pointer pada posisi data yg ingin diremove
	if(pointer==null)return;
	else if(pointer==head) removeFirst();    // kalo ternyata pointer ada di head, langsung removeFirst aja
	else if(pointer==tail) removeLast();    // kalo ternyata pointer ada di tail, langsung removeLast aja
	else{                                    // tapi kalo tenyata pointer bukan di head / tail…
	Node beforeData = head;                // bikin pointer beforeData di head
	while(beforeData.next!=pointer){    // nge-loop terus sampe ketemu pointer
	beforeData = beforeData.next;
	}
	Node afterData = pointer.next;        // bikin node after data setelah pointer, shg posisi : beforeData-pointer-afterData
	beforeData.next = afterData;        // beforeData langsung dihubungkan ke afterData, shg : beforeData-afterData
	}                                        // dg kata lain pointer dilepas dari link
	}
	
	void insertAfter(int key, int data){        // insert [data] after [key]
	Node pointer = Find(key);                // menepatkan pointer sesuai posisi key
	if(pointer == null) return;
	else{
	Node temp = pointer.next;            // bikin node temp di blakang pointer, posisi: pointer-temp
	Node baru = new Node(data);            // bikin node baru
	pointer.next = baru;                // posisi : pointer-baru
	baru.next = temp;                    // posisi : baru-temp
	}                                        // shg posisi skrg : pointer-baru-temp
	}
	
	void insertBefore(int key, int data){        // insert [data] before [key]
	    Node pointer = Find(key);                // menepatkan pointer sesuai posisi key
	        if(pointer == null) return;
	        else{
	            Node beforeData = head;                // bikin node beforeData di head
	            while(beforeData.next!=pointer){    // nge-loop sampe ketemu pointer
	                beforeData = beforeData.next;}
	        if(beforeData.next==pointer){        // kalo uda ketemu,,
	            Node baru = new Node(data);        // bikin node baru
	            beforeData.next = baru;            // posisi : beforeData-baru
	            baru.next=pointer;                // posisi : baru-pointer
	            }                                    // posisi skrg : beforeData-baru-pointer
            }
        }
}
