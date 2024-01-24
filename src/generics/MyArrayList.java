package generics;

public class MyArrayList<T> {

    private T[] array;
    int size;

    private int initialCapacity;

    @SuppressWarnings("unchecked")
    public MyArrayList(int initialCapacity) {
        this.array = (T[]) new Object[initialCapacity];
        this.size = 0;
        this.initialCapacity = initialCapacity;
    }

    /*
     * size
     * Returns the number of elements that the array contains
     * 
     * @return array's size
     */
    public int size() {
        return this.size;
    }

    /*
     * isEmpty
     * Returns true if the array is empty, else returns false
     * 
     * @return true empty / false in other case
     */
    public boolean isEmpty() {
        return (size == 0) ? true : false;
    }

    /*
     * add
     * Adds an element to the array at the end
     * 
     * @param t Element to add
     */
    @SuppressWarnings("unchecked")
    public void add(T t) {
        if (this.size == this.array.length) {
            if (array != null) {
                T[] aux = this.array.clone();
                array = (T[]) (new Object[this.size + initialCapacity]);
                for (int i = 0; i < aux.length; i++)
                    array[i] = aux[i];
            } else
                array = (T[]) (new Object[this.size + initialCapacity]);
        }
        array[size++] = t;
    }

    /*
     * add
     * Adds an element to the array on the position specified,
     * moving the rest of elements to the right
     * 
     * @param index Position to insert
     * 
     * @param t Element to add
     */
    @SuppressWarnings("unchecked")
    public void add(int index, T t) {
        if (index >= 0 & index < this.size) {
            if (array != null) {
                T[] aux = this.array.clone();
                if (this.size == this.array.length) {
                    array = (T[]) (new Object[this.size + initialCapacity]);
                }
                /* We travel the array until the position before index position */
                for (int i = 0; i < index; i++)
                    array[i] = aux[i];
                /* We put t on index position */
                array[index] = t;
                /*
                 * We travel the array from the position after index position to move every
                 * element to the next position (to the right)
                 */
                for (int i = index; i < this.size - 1; i++)
                    array[i + 1] = aux[i];
            } else
                array = (T[]) (new Object[this.size + initialCapacity]);
        } else {
            throw new IndexOutOfBoundsException();
        }
        array[index] = t;
    }

    /*
     * get
     * Gets the element from the position
     * 
     * @param index Position to get
     * 
     * @return the element from the position
     */
    public T get(int index) {
        if (index >= 0 & index < this.size) {
            return this.array[index];
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    /*
     * set
     * Updates an element on a specified position
     * 
     * @param index Position to set
     * 
     * @param t Element to save
     * 
     * @return The previous element on that position
     */
    public T set(int index, T t) {
        if (index >= 0 & index < this.size) {
            T previous = this.array[index];
            array[index] = t;
            return previous;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    /*
     * remove
     * Removes the element from the specified position
     * 
     * @param index Position to remove
     * 
     * @return The previous element on that position
     */
    public T remove(int index) {
        if (index >= 0 & index < this.size) {
            T previous = array[index];
            for (int i = index; i < this.size - 1; i++) {
                array[i] = array[i + 1];
            }
            array[--size] = null;
            return previous;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    /*
     * clear
     * Clears the array on it's full
     */
    @SuppressWarnings("unchecked")
    public void clear() {
        this.array = null;
        this.size = 0;
        array = (T[]) (new Object[this.initialCapacity]);
    }

    @Override
    public String toString() {
        if (this.size != 0 & array != null) {
            String ret = "[";
            for (int i = 0; i < size - 1; i++) {
                ret += array[i] + ",";
            }
            ret += array[size - 1] + "]";
            return ret;
        } else {
            return "[0 elements]";
        }
    }

}
