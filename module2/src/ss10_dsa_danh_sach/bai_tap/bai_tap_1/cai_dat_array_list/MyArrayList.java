package ss10_dsa_danh_sach.bai_tap.bai_tap_1.cai_dat_array_list;

import java.util.Arrays;

public class MyArrayList<E> {
    private int size = 0;
    private static final int DEFAUT_CAPACITY = 10;

    Object elements[];

    // Sức chứa mặc định khi khởi tạo bằng constructor không có tham số
    public MyArrayList() {
        elements = new Object[DEFAUT_CAPACITY];
    }

    // Phương thức constructor với sức chứa được truyền vào
    public MyArrayList(int capacity) {
        if (capacity >= 0) {
            elements = new Object[capacity];
        } else {
            throw new IllegalArgumentException("capacity: " + capacity);
        }
    }

    // Phương thức kiểm tra số phần tử
    public int size() {
        return this.size;
    }

    // Phương thức xóa hết các phần tử
    public void clear() {
        size = 0;
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
    }

    // Phương thức add 1 phần tử
    public boolean add(E element) {
        if (elements.length == size) {
            this.ensureCapacity(5);
        }
        elements[size] = element;
        size++;
        return true;
    }

    // Phương thức add 1 phần tử tại vị trí chọn
    public void add(E element, int index) {
        if (index > elements.length) {
            throw new IllegalArgumentException("index =" + index);
        } else if (elements.length == size) {
            this.ensureCapacity(5);
        }
        if (elements[index] == null) {
            elements[index] = element;
            size++;
        } else {
            for (int i = size + 1; i >= index; i--) {
                elements[i] = elements[i - 1];
            }
            elements[index] = element;
            size++;
        }
    }

    //Phương thức tăng kích thước
    public void ensureCapacity(int minCapacity) {
        if (minCapacity >= 0) {
            int newSize = this.elements.length + minCapacity;
            elements = Arrays.copyOf(elements, newSize);
        } else {
            throw new IllegalArgumentException("minCapacity: " + minCapacity);
        }
    }

    // Phương thức lấy phần tử
    public E get(int index) {
        return (E) elements[index];
    }

    // Phương thức tìm vị trí của phần tử
    public int indexOF(E element) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (this.elements[i].equals(element)) {
                return i;
            }

        }
        return index;
    }

    // Phương thức tìm kiếm phần tử có hay không
    public boolean contains(E element) {
        return this.indexOF(element) >= 0;
    }

    // Phương thức tạo ra 1 bản sao
    public MyArrayList<E> clone() {
        MyArrayList<E> newMyArrayList = new MyArrayList<>();
        newMyArrayList.elements = Arrays.copyOf(elements, size);
        newMyArrayList.size = this.size;
        return newMyArrayList;
    }

    // Phuương thứ xóa 1 phần tử biết vị trí
    public E remove(int index) {
        if (index < 0 || index > elements.length) {
            throw new IllegalArgumentException("Error Index: " + index);
        }
        E element = (E) elements[index];
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];

        }
        elements[size - 1] = null;
        size--;
        return element;
    }
}
