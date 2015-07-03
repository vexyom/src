package com.javarush.test.level03.lesson08.task02;

/* Зарплата через 5 лет
Ввести с клавиатуры Имя и два числа, вывести надпись:
name1 получает «число1» через «число2» лет.
Пример: Коля получает 3000 через 5 лет.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String name = in.readLine();
        int count = Integer.parseInt(in.readLine());
        int year = Integer.parseInt(in.readLine());

        System.out.println(name + " получает " + count + " через " + year + " лет.");

    }
}