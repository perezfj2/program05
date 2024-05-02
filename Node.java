// Student Name
// Date
// CSCI 3302 Section 001
//
// Files:
//
// Description: The Node<T> class is used to build the dictionary. The class
// stores  a key of generic type S and
// value of generic type T.

public class Node<S, T> {


  private S key;              // reference to the key attribute
  private T value;            // reference to the value attribute
  private Node<S, T> next;    // reference to the next Node in the Disctionary

  /**
   * Construtors a Node and returns the reference.
   * @param newKey - reference to the key
   * @param newValue - reference to the value
   */ 
  public Node(S newKey, T newValue) {
    this.key = newKey;
    this.value = newValue;
    this.next = null;
  }

  // Getter for key within the node.
  public S getKey() {
    return this.key;
  }

  // Getter for value within the node.
  public T getValue() {
    return this.value;
  }

  // Getter for the reference to the next node in the
  // list; if this is the last item, then next is null.
  public Node<S, T> getNext() {
    return this.next;
  }

  // Setter for the reference to the next node.
  public void setNext(Node<S, T> newNext) {
    this.next = newNext;
  }
}
