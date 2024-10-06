package org.example;

/**
 * Реализация контейнера, основанного на массиве.
 *
 * @param <T> Тип элементов, хранящихся в контейнере.
 */
public class ContainerArray<T> {
    private Object[] data;
    private int size;

    /**
     * Конструктор по умолчанию.
     * Инициализирует контейнер с начальной емкостью 10 элементов.
     */
    public ContainerArray() {
        data = new Object[10];
        size = 0;
    }

    /**
     * Добавляет элемент в конец контейнера.
     * Если емкость контейнера недостаточна, то она увеличивается вдвое.
     *
     * @param element Элемент, который нужно добавить.
     */
    public void add(T element) {
        if (size == data.length) {
            Object[] newData = new Object[data.length * 2];
            System.arraycopy(data, 0, newData, 0, data.length);
            data = newData;
        }
        data[size++] = element;
    }

    /**
     * Возвращает элемент по заданному индексу.
     *
     * @param index Индекс элемента.
     * @return Элемент по указанному индексу.
     * @throws IndexOutOfBoundsException Если индекс выходит за границы контейнера.
     */
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }
        return (T) data[index];
    }

    /**
     * Удаляет элемент по заданному индексу и возвращает его.
     *
     * @param index Индекс элемента, который нужно удалить.
     * @return Удаленный элемент.
     * @throws IndexOutOfBoundsException Если индекс git config --listвыходит за границы контейнера.
     */
    public T remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }
        T removedElement = (T) data[index];

        // Сдвигаем элементы массива
        System.arraycopy(data, index + 1, data, index, size - index - 1);

        // Обновление размера массива после удаления
        size--;
        // Очищение последней ячейки после сдвига
        data[size] = null;

        return removedElement;
    }

    /**
     * Возвращает количество элементов в контейнере.
     *
     * @return Количество элементов.
     */
    public int size() {
        return size;
    }

    /**
     * Проверяет, пуст ли контейнер.
     *
     * @return true, если контейнер пуст, иначе false.
     */
    public boolean isEmpty() {
        return size == 0;
    }
}

