package ADT;

public interface SListInterface<T extends Comparable<? super T>> {
    public boolean add(T newEntry);
    public T getEntry(int givenPosition);
    public int getLength();
    public boolean isEmpty();
}
