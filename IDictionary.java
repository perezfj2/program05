// Student Name
// Date
// CSCI 3302 Section 001
//
// Files:
//
// Description:

public interface IDictionary<S, T> {
  // Determines whether the dictionary is empty.
  public boolean isEmpty();

  // Adds the provided (key, item) pair to the dictionary.
  // If the key is already associated with a value, the
  // old key, value pair are replaced.
  public void add(S key, T value);

  // Removes the (key, value) pair specified by the given
  // key from the dictionary.  Throws an exception if the
  // (key, value) pair is not contained in the dictionary.
  public void remove(S key) throws DictionaryException;

  // Returns the value associated with the given key
  // from the dictionary. Does not modify the dictionary.
  // Throws an exception if the (key, value) pair is not
  // contained in the dictionary.
  public T getValue(S key) throws DictionaryException;

  // Removes all (key, value) pairs in the dictionary.
  public void clearDictionary();
}
