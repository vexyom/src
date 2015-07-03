package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int n1 = Integer.parseInt(in.readLine()), n2 = Integer.parseInt(in.readLine()), n3 = Integer.parseInt(in.readLine());
        printNumbers(n1,n2,n3);
    }

    public static void printNumbers( int a, int b, int c )
    {
        int tmp;

        if ( a < b )
        {
            tmp = a;
            a = b;
            b = tmp;
        }

        if ( b < c )
        {
            tmp = b;
            b = c;
            c = tmp;
        }

        if ( a < b )
        {
            tmp = a;
            a = b;
            b = tmp;
        }

        System.out.println( "" + a + " " + b + " " + c );
    }
}
