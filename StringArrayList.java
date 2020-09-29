import java.util.Arrays;

public class StringArrayList implements List<String> {
    private static final int DEFAULT_CAPACITY = 10;
    private int numItems;
    private String[] array;
    
    /**
     * Create an empty list.
     */
    public StringArrayList() {
        numItems = 0;//list starts off with nothing in it
        array = new String[DEFAULT_CAPACITY];
    }
    
    /**
     * Creates a list with a single item. (I've added
     * this constructor mainly for testing purposes
     * so that you can check your get before you've written
     * add.)
     */
    public StringArrayList(String initialItem) {
        numItems = 1;
        array = new String[DEFAULT_CAPACITY];
        array[0] = initialItem;
    }

    /** Returns the item at a given index.
     * @return the item, or throws an {@link IndexOutOfBoundsException}
     * if position is out of bounds.
     */
    public String get(int position) {
        //This method isn't implemented yet. You'll write it in this activity.
        throw new UnsupportedOperationException();
    }

        /** 
     * Replaces the item at a given index.
     * @return the element previously at that position, or throws an 
     * {@link IndexOutOfBoundsException} if position is out of bounds.
     */
    public String set(int position, String newItem) {
        //This method isn't implemented yet. You'll write it in this activity.
        throw new UnsupportedOperationException();
    }
    
    /** Adds newItem at the given index.
     * Adds newItem at index newPosition, and shifts each item at or beyond
     * that index to the next higher index.
     * Postcondition: The item at newPosition is newItem.
     * throws an {@link IndexOutOfBoundsException}
     * if position is out of bounds. For this method (and only
     *   this method), the length of the list is considered in bounds.
     */
    public void add(int index, String newItem) {
        //This method isn't implemented yet. You'll write it in this activity.
        throw new UnsupportedOperationException();
}

    /** Adds newItem to the end of the list. */
    public void add(String newItem) {
        //This method isn't implemented yet. You'll write it in this activity.
        throw new UnsupportedOperationException();
    }
    

    
    /** Removes the item at the given index.
     * Removes the item at the given index, shifts each item beyond that index
     * to the next lower index.
     * @return the removed item, or throws an {@link IndexOutOfBoundsException}
     * if position is out of bounds.
     */
    public String remove(int position) {
        //This method isn't implemented. It isn't required for this activity, although
        // you're welcome to fill it in as practice.
        throw new UnsupportedOperationException();
    }
    
    /** Removes all items from the list. */
    public void clear() {
        //This method isn't implemented. It isn't required for this activity, although
        // you're welcome to fill it in as practice.
        throw new UnsupportedOperationException();
    }
    
    
    /** Returns true if the list contains the target item. */
    public boolean contains(String targetItem) {
        //This method isn't implemented. It isn't required for this activity, although
        // you're welcome to fill it in as practice.
        throw new UnsupportedOperationException();
    }
    
    /** Returns the length of the list: the number of items stored in it. */
    public int size() {
        //This method isn't implemented yet. You'll write it in this activity.
        throw new UnsupportedOperationException();
    }
    
    /** Returns true if the list has no items stored in it. */
    public boolean isEmpty() {
        //This method isn't implemented. It isn't required for this activity, although
        // you're welcome to fill it in as practice.
        throw new UnsupportedOperationException();
    }
    
    /** Returns an array version of the list.  Note that, for technical reasons,
     * the type of the items contained in the list can't be communicated
     * properly to the caller, so an array of Objects gets returned.
     * @return an array of length length(), with the same items in it as are
     *         stored in the list, in the same order.
     */
    public Object[] toArray() {
        //I've provided an implementation of this method to make
        //it easier for me to write tests.
        //Question to think about: Why not just return array?
        return Arrays.copyOf(array, numItems);
    }
    
    
    
}