package org.example;

public class ContainerArray<T> {
    private Object[] data;
    private int size;

    public ContainerArray() {
        data = new Object[10];
        size = 0;
    }

    public void add(T element) {
        if (size == data.length) {
            Object[] newData = new Object[data.length * 2];
            System.arraycopy(data, 0, newData, 0, data.length);
            data = newData;
        }
        data[size++] = element;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }
        return (T) data[index];
    }

    public T remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }
        T removedElement = (T) data[index];

        // Сдвигаем элементы массива
        System.arraycopy(data, index + 1, data, index, size - index - 1);

        // Важно: Обновляем размер массива после удаления
        size--;
        // Очищаем последнюю ячейку после сдвига
        data[size] = null; // Добавляем эту строку

        return removedElement;
    }



    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}