/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bsearch;

import java.util.Random;
import java.util.Scanner;

public class BSearch {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        Random r = new Random();
        int n = 0, a = 0, b = 0;
        System.out.println("Введите размеры границ рандомно генерируемого массива:");
        a = cin.nextInt();
        b = cin.nextInt();
        n = (int) (Math.random() * (b - a)) + a;
        Integer[] arr = new Integer[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (b - a)) + a;
        }
        if(arr.length==0){  System.out.println("Массив не создан!");System.exit(0);}
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        System.out.println("Отсортированный массив:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int x = (int) (Math.random() * (b - a)) + a;
        System.out.println("Сгенерированное число X:" + x);
        System.out.println("Индекс первого элемента массива, строго меньшего X:" + bsearch(arr, x));
        cin.close();
    }

    public static int bsearch(Integer[] arr, int x) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
         if (arr[i] < x) {
                index = i;
                break;
            }
        }
        return index;
    }
}
