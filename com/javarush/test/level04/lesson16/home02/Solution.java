package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        int max = max(a,b,c);

        int min = min(a,b,c);

        if ((a>min)&&(a<max)) System.out.println(a);
        if ((b>min)&&(b<max)) System.out.println(b);
        if ((c>min)&&(c<max)) System.out.println(c);
    }

    private static int min(int a, int b, int c)
    {
        if (a < b && a < c) return a;
        else if(b < a && b < c) return b;
        else return c;
    }

    private static int max(int a, int b, int c)
    {
        if (a > b && a > c) return a;
        else if(b > a && b > c) return b;
        else return c;
    }
}
