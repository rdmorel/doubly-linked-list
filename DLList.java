public class DLList<E> {
    private DLListNode<E> front, back;  // sentinel nodes, which will contain no data
    private int count;
    
    public DLListNode<E> contains(E x){
    	DLListNode<E> temp = front.next;
    	while (temp!=back){
    		if (temp.element.equals(x)){
    			return temp;
    		}
    		else{
    			temp = temp.next;
    		}
    	}
    	System.out.println("Not in list");
    	return null;
    }
    
    public E remove(DLListNode<E> n){
    	DLListNode<E> temp = n;
    	if (temp!= null && temp!=front && temp!=back){
    		temp = temp.prev;
    		temp.next = temp.next.next;
    		temp = temp.next;
    		temp.prev = temp.prev.prev;
    		count--;
    		return n.element;
    	}
    	else{
    		return null;
    	}
    }
    
    public void concat(DLList<E> other){
    	DLListNode<E> temp = this.back.prev;
    	temp.next = other.front.next;
    	other.front.next.prev = temp;
    	this.back=other.back;
    	count = count + other.count;
    	other.front.next = other.back;
    	other.back.prev = other.front;
    	other.count = 0;
    }
    
    public DLList() {
        count = 0;
        front = new DLListNode<E>(null, null, null);
        back = new DLListNode<E>(null, null, front);
        front.next = back;
    }
    
    public DLList(E[] arr) {
      this();
      for (int i=0; i<arr.length; i++) {
        if (arr[i] != null)
          insertBack(arr[i]);
      }
    }
          
    
    public void insertFront(E elt) {
        DLListNode<E> temp = new DLListNode<E>(elt, front.next, front);
        front.next.prev = temp;
        front.next = temp;
        count++;
    }
    
    public void insertBack(E elt) {
        DLListNode<E> temp = new DLListNode<E>(elt, back, back.prev);
        back.prev.next = temp;
        back.prev = temp;
        count++;
    }
    
    public E removeFront() {
        if (isEmpty()) 
            return null;
        E result = front.next.element;
        DLListNode<E> temp = front.next;  // optional
        front.next = front.next.next;
        front.next.prev = front;
        temp.next = temp.prev = null;  // optional
        count--;
        return result;
    }
    
    public E removeBack() {
        if (isEmpty())
            return null;
        E result = back.prev.element;
        DLListNode<E> temp = back.prev;  // optional
        back.prev = back.prev.prev;
        back.prev.next = back;
        temp.next = temp.prev = null;  // optional
        count--;
        return result;
    }
    
    public boolean isEmpty() {
        return (front.next == back);
    }
    
    public void printList() {
        DLListNode<E> current = front.next;
        while (current != back) {
            System.out.print(current.element + "  ");
            current = current.next;
        }
        System.out.println();
    }
    
    public int size() {
        return count;
    }
}
