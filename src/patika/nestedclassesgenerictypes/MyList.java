package patika.nestedclassesgenerictypes;

import java.util.Arrays;

public class MyList<T> {
    private T[] array;
    private Integer size = 0;
    private Integer capacity;

    public MyList() {
        this.capacity = 10;
        this.array = (T[]) new Object[this.capacity];
    }

    public MyList(final Integer capacity) {
        this.capacity = capacity;
        this.array = (T[]) new Object[this.capacity];
    }

    public Integer getSize() {
        return this.size;
    }

    public Integer getCapacity() {
        return this.capacity;
    }

    public void add(final T data) {
        if (this.size < this.capacity) {
            this.array[this.size] = data;
            this.size++;
        } else {
            this.capacity *= 2;
            this.array = Arrays.copyOf(this.array, this.capacity);
            this.array[this.size] = data;
            this.size++;
        }
    }

    public T get(final Integer index) {
        if (index <= this.size) {
            return this.array[index];
        } else {
            return null;
        }
    }

    public T remove(final Integer index) {
        if (index <= this.size) {
            T value = this.array[index];

            for (int i = index; i < (this.size - 1); i++) {
                this.array[i] = this.array[i + 1];
            }

            this.array[(this.size - 1)] = null;
            this.size--;
            return value;
        } else {
            return null;
        }
    }

    public T set(final Integer index, final T data) {
        if (index <= this.size) {
            this.array[index] = data;
            return this.array[index];
        } else {
            return null;
        }
    }

    public String toString() {
        String stringValue = "[";

        if (this.size != 0) {
            for (int i = 0; i < this.size; i++) {
                stringValue += this.array[i].toString();
                if (i != (this.size - 1)) {
                    stringValue += ",";
                }
            }
        }

        stringValue += "]";

        return stringValue;
    }

    public Integer indexOf(final T data) {
        for (int i = 0; i < size; i++) {
            if (this.array[i] == data) {
                return i;
            }
        }

        return -1;
    }

    public Integer lastIndexOf(final T data) {
        Integer lastIndex = -1;

        for (int i = 0; i < this.size; i++) {
            if (this.array[i] == data) {
                if (i > lastIndex) {
                    lastIndex = i;
                }
            }
        }

        return lastIndex;
    }

    public Boolean isEmpty() {
        return this.size == 0;
    }

    public T[] toArray() {
        return Arrays.copyOf(this.array, this.size);
    }

    public void clear() {
        this.array = (T[]) new Object[this.capacity];
        this.size = 0;
    }

    public MyList<T> subList(int start, int finish) {
        MyList<T> sub = new MyList<>(finish + 1);

        for (int i = start; i <= finish; i++) {
            sub.add(this.array[i]);
        }

        return sub;
    }

    public Boolean contains(T data) {

        for (int i = 0; i < this.size; i++) {
            if (this.array[i] == data) {
                return true;
            }
        }

        return false;
    }
}