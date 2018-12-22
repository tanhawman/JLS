package ADT;

public class SList<T extends Comparable<? super T>> implements SListInterface<T> {

    private T[] SList;
    private int length;
    // To create the SList, first give a default initial length, just like array
    private static final int Default_Initial_Length = 99;

    public SList() {
        this(Default_Initial_Length);
    }
        
    public SList(int initLength) {
        length = 0;
        SList = (T[]) new Comparable[initLength];
    }

    public boolean add(T newEntry) {
        int i = 0;
        
        // if the array is full, double the size of the array before adding more Entry.
        if(isArrayFull())
            doubleArray();
        
        // This is to compare the given condition to sorted the data.
        // Find the suitable position to store the data.
        // newEntry is the object data you throw in, then "newEntry.compareTo" is to call the override funtions in your newEntry obejct class.
        // e.g: you thrown in the Arrangement, then "newEntry.compareTo" = Arrangement.compareTo();
        while (i < length && newEntry.compareTo(SList[i]) > 0) {
            // To find the suitable position in the list
            i++;
        }
        // Throw in the new position + 1, because it is > found-position(i), and < next-position (not sure)
        makeRoom(i + 1);
        // make the found position duplication (done in makeRoom(i+1)), and add the newEntry to the duplicate data.
        SList[i] = newEntry;
        length++;
        return true;
    }

    public T getEntry(int givenPosition) {
        T result = null;

        // validate if the givenPosition is within the range of the SList
        if ((givenPosition >= 1) && (givenPosition <= length)) {
            result = SList[givenPosition - 1];
        }

        return result;
    }

    public int getLength() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    private boolean isArrayFull() {
        return length == SList.length;
    }

    private void doubleArray() {
        T[] oldList = SList;
        int oldSize = oldList.length;

        // create a new SList with double the size(length) of the current List.
        SList = (T[]) new Object[2 * oldSize];

        // Copy the data from old SList to the new SList.
        for (int index = 0; index < oldSize; index++) {
            SList[index] = oldList[index];
        }
    }

    private void makeRoom(int newPosition) {
        // newPosition is the found-position + 1
        // newIndex = newPosition - 1, == foundPosition, not sure why +1 then - 1 again;
        int newIndex = newPosition - 1;
        // to find the lastIndex, used in the for-loop;
        int lastIndex = length - 1;

        // The process of moving the right-hand side of list of data one index.
        // use the lastIndex to know when to stop moving.
        for (int index = lastIndex; index >= newIndex; index--) {
            // e.g SList[5 + 1] = 6,
            // gotta become SList[5],
            // so SList[5] will become duplicate and useless, and allow you to add your new data into this foundPostion.
            SList[index + 1] = SList[index];
        }
    }

//    // Not sure if this is used, probably no
//    private void removeGap(int givenPosition) {
//        int removedIndex = givenPosition - 1;
//        int lastIndex = length - 1;
//
//        for (int index = removedIndex; index < lastIndex; index++) {
//            SList[index] = SList[index + 1];
//        }
//    }

}
