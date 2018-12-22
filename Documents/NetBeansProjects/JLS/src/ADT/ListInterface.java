package ADT;

public interface ListInterface<T>{
  public boolean add(T newEntry);
  public void clear();
  public T getEntry(int givenPosition);
  public int getNumberOfEntries();
  public boolean isEmpty();
}
