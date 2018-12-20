/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADT;

/**
 *
 * @author user
 */
public interface SListInterface <T extends Comparable<? super T>> {
    public boolean add(T newEntry);

  public T getEntry(int givenPosition);

  public boolean contains(T anEntry);

  public T remove(int givenPosition);

  public void clear();

  public int getLength();

  public boolean isEmpty();

  public boolean isFull();
}
