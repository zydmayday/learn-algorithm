package data_structure;

import java.util.ArrayList;
import java.util.HashMap;

public class CircularBuffer<E> {

    private static final int DEFAULT_CAPACITY = 16;
    private final int capacity;
    private final E[] data;
    private int readSeq;
    private int writeSeq;

    public CircularBuffer(int capacity) {
        this.capacity = capacity < 1 ? DEFAULT_CAPACITY : capacity;
        this.data = (E[]) new Object[this.capacity];
        this.readSeq = 0;
        this.writeSeq = -1;
    }

    public CircularBuffer() {
        this(DEFAULT_CAPACITY);
    }

    /**
     * 像缓冲添加元素，如果所有位置都写入但是没有被读到，则禁止继续写入
     *
     * @param element
     * @return 如果添加成功返回true，否则返回false
     */
    public boolean offer(E element) {
        if (!isFull()) {
            int nextWriteSeq = writeSeq + 1;
            data[nextWriteSeq % capacity] = element;
            writeSeq++;
            return true;
        }
        return false;
    }

    /**
     * 读取下一个缓存并返回
     *
     * @return 如果成功读取则返回，如果缓存为空则返回null
     */
    public E poll() {
        if (!isEmpty()) {
            E nextValue = data[readSeq % capacity];
            readSeq++;
            return nextValue;
        }
        return null;
    }

    public boolean isEmpty() {
        return writeSeq < readSeq;
    }

    public boolean isFull() {
        return size() == capacity;
    }

    public int size() {
        return writeSeq - readSeq + 1;
    }

}
