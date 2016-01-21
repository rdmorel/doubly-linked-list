# doubly-linked-list
doubly linked list in java

Assignment: 

1. Download the DLListNode and DLList classes, and optional TestDoublyLinkedList. Add the following methods to the DLList class:

1a. A method called contains:

public DLListNode<E> contains(E x)

that checks whether the element x is in the doubly linked list, and if so returns a reference to the DLListNode<E> that contains x; if x is not in the list, this method should return null.

1b. A method that removes a specified DLListNode from the doubly linked list; this node can appear anywhere in the list, although the sentinel nodes - the DLListNodes referred to by front and back, which don't contain elements - should never be removed.

public E remove(DLListNode<E> n)

This method should return the element from the DLListNode that was removed, or null if nothing was removed.

Note that you can remove a particular value y from the list by first calling contains( y ) and then passing the (non-null) result to remove.

1c. An O(1) method to concatenate two DLList objects:

public void concat(DLList<E> other)

After I call a.concat(b), I expect that DLList a will contain all its own elements followed by all b's elements, in order, and that DLList b will be empty. (Note: you may assume that a and b contain elements of the same type!) This is called a destructive concatenation, since b's contents are not retained.

Upload your DLList.java file; do not change the DLListNode class; no need to upload your driver class.
