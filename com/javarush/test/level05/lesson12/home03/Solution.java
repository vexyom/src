package com.javarush.test.level05.lesson12.home03;

/* Создай классы Dog, Cat, Mouse
Создай классы Dog, Cat, Mouse. Добавь по три поля в каждый класс, на твой выбор. Создай объекты для героев мультика Том и Джерри. Так много, как только вспомнишь.
Пример:
Mouse jerryMouse = new Mouse(“Jerry”, 12 , 5), где 12 - высота в см, 5 - длина хвоста в см.
*/

public class Solution
{
    {
        Mouse jerryMouse = new Mouse( "Jerry", 12, 5 );

        //напишите тут ваш код
        Cat tomCat = new Cat( "Tom", 30, 5 );
        Cat toodles = new Cat( "Toodles", 23, 3 );
        Dog spike = new Dog( "Spike", 4, 15 );
    }

    //добавьте тут ваши классы
    public static class Mouse
    {
        String name;
        int height, tail;

        public Mouse( String name, int height, int tail )
        {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static class Dog
    {
        String name;
        int age, weight;

        public Dog( String name, int age, int weight )
        {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }
    }

    public static class Cat
    {
        String name;
        int height;
        int weight;

        public Cat( String name, int height, int weight )
        {
            this.name = name;
            this.height = height;
            this.weight = weight;
        }
    }
}