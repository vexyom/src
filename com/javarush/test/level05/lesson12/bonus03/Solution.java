package com.javarush.test.level05.lesson12.bonus03;

import java.io.*;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int maximum = 0;

        //напишите тут ваш код
        int n = Integer.parseInt(in.readLine());

        for (int i = 0; i < n; i++)
        {
            int temp = Integer.parseInt(in.readLine());

            if(i == 0) maximum = temp;
            else
            if(temp > maximum) maximum = temp;
        }

        System.out.println(maximum);
    }
}
