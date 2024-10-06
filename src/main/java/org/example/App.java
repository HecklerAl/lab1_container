package org.example;

import org.example.ContainerArray; // Импортируем класс ContainerArray

public class App {
    public static void main(String[] args) {
        // Создаем экземпляр контейнера для хранения строк
        ContainerArray<String> container = new ContainerArray<>();

        // Добавляем элементы в контейнер
        container.add("Hello");
        container.add("World");
        container.add("!");

        // Выводим размер контейнера
        System.out.println("Размер контейнера: " + container.size());

        // Извлекаем и выводим элементы по индексу
        System.out.println("Элемент по индексу 0: " + container.get(0));
        System.out.println("Элемент по индексу 1: " + container.get(1));
        System.out.println("Элемент по индексу 2: " + container.get(2));

        // Удаляем элемент по индексу 1
        container.remove(1);

        // Выводим размер контейнера после удаления
        System.out.println("Размер контейнера после удаления: " + container.size());

        // Выводим элементы после удаления
        System.out.println("Элемент по индексу 0: " + container.get(0));
        System.out.println("Элемент по индексу 1: " + container.get(1));
    }
}