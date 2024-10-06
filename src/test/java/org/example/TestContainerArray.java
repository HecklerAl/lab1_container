package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class TestContainerArray {

    @Test
    void testAddAndGet() {
        ContainerArray<String> container = new ContainerArray<>();
        container.add("Hello");
        container.add("World");
        assertEquals("Hello", container.get(0));
        assertEquals("World", container.get(1));
    }

    @Test
    void testRemove() {
        ContainerArray<Integer> container = new ContainerArray<>();
        container.add(1);
        container.add(2);
        container.add(3);
        assertEquals(2, container.remove(1));
        assertEquals(2, container.size());
        assertEquals(1, container.get(0));
        assertEquals(3, container.get(1));
    }


    @Test
    void testSizeAndIsEmpty() {
        ContainerArray<Object> container = new ContainerArray<>();
        assertTrue(container.isEmpty());
        assertEquals(0, container.size());
        container.add("test");
        assertFalse(container.isEmpty());
        assertEquals(1, container.size());
    }

    @Test
    void testIndexOutOfBoundsException() {
        ContainerArray<Integer> container = new ContainerArray<>();
        container.add(1);
        assertThrows(IndexOutOfBoundsException.class, () -> container.get(1));
        assertThrows(IndexOutOfBoundsException.class, () -> container.remove(1));
    }

    @Test
    void testResize() {
        ContainerArray<String> container = new ContainerArray<>();
        for (int i = 0; i < 15; i++) {
            container.add("Element " + i);
        }
        assertEquals(15, container.size());
        assertEquals("Element 14", container.get(14));
    }
}