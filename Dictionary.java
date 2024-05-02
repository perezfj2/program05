
// Student Name Fernando Perez
// Date
// CSCI 3302 Section 001
//
// Files: Dictionary.java, DictionaryException.java, IDictionary.java, Node.java
//
// Description:

public class Dictionary<S, T> implements IDictionary<S, T> {
    private Node<S, T> head;

    public Dictionary(){
        this.head = null;
    }

    /**
     * Returns value if the dictionary is empty or not
     */
    public boolean isEmpty() {
        return (this.head == null);
    }

    /**
     * @param key - this is the reference and is unique
     * @param value - this is the value that the key reference holds does not have to be unique
     * 
     * This methods adds a (key, value) to the list. If a key already exists the value associated with it is updated
     * If they key is not found then it would be added to the end of the list
     */
    public void add(S key, T value) {
        Node<S, T> previous = null;
        Node<S, T> current = this.head;

        while (current != null && !current.getNext().equals(key)) {
            previous = current;
            current = current.getNext();
        }
        if (current == null) {
            Node<S, T> newNode = new Node<>(key, value);
            if (previous == null) {
                this.head = newNode;
            } else {
                previous.setNext(newNode);
            }
        } else {
            Node<S, T> newNode = new Node<>(key, value);
            newNode.setNext(current.getNext());
            if (previous == null) {
                this.head = newNode;
            } else {
                previous.setNext(newNode);
            }

        }
    } // end add method

    public void remove(S key) throws DictionaryException{
        Node<S, T> current = head;
        Node<S, T> previous = null;

        while(current != null && !current.getNext().equals(key)){
            previous = current;
            current = current.getNext();
        }

        if(current == null){
            throw new DictionaryException("Key not found");
        } else if (previous == null){
            this.head = current.getNext();
        } else { 
            previous.setNext(current.getNext());
        }


    }

    public T getValue(S key) throws DictionaryException{
        Node<S, T> current = head;

        while(current != null && !current.getKey().equals(key)){
            current = current.getNext();
        }

        if(current == null){
            throw new DictionaryException("Key not found.");
        } else {
            return current.getValue();
        }

    }

    /**
     * Clears the dictionary
     */
    public void clearDictionary(){
        this.head = null;
    }

} // end class
