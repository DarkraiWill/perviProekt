import java.util.Arrays;
import java.util.Collections;
import java.util.OptionalInt;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Задача 1
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите число: ");
//        if (scanner.nextInt() % 2 == 0)
//        {
//            System.out.println("Четное");
//        }
//        else System.out.println("Нечетное");
//        Задача 2
//        System.out.println("Введите число 1: ");
//        int odin, dva, tri;
//        odin = scanner.nextInt();
//        System.out.println("Введите число 2: ");
//        dva = scanner.nextInt();
//        System.out.println("Введите число 3: ");
//        tri = scanner.nextInt();
//        if(odin<dva & odin<tri)
//            System.out.println("Минимальное число: " + odin);
//        else if(dva<odin & dva<tri)
//            System.out.println("Минимальное число: " + dva);
//        else if (tri<odin & tri<dva)
//            System.out.println("Минимальное число: " + tri);
//        else System.out.println("Их тут несколько");
//        ЗАДАЧА 3
//        int x = 5;
//        for (int i =1 ; i<=10; i++)
//            {
//                System.out.println(x*i);
//            }
//        ЗАДАЧА 4
//        System.out.println("Введите число N:");
//        int num = scanner.nextInt();
//        int sum = 0;
//        for (int i =1; i<=num; i++) sum += i;
//        System.out.println(sum);
//        Задача 5
//        System.out.println("Введите число N:");
//        int num = scanner.nextInt();
//        int[] fib = new int[num];
//        fib[0] = 0;
//        fib[1] = 1;
//        for (int i = 2; i < num; ++i) fib[i] = fib[i - 1] + fib[i - 2];
//        for (int i = 0; i < num; ++i) System.out.println(fib[i]);
//        Задача 6
//        System.out.println("Введите число N:");
//        int n = scanner.nextInt();
//        for (int i = 2; i< n; i++)
//        {
//            if (n%i!=0) {
//                System.out.println("Простое");
//                break;
//            }
//            else {
//                System.out.println("Не простое");
//                break;
//            }
//        }
//        Задача 7
//        System.out.println("Введите число N:");
//        int n = scanner.nextInt();
//        System.out.println(n);
//        for (int i = 1; i < n; i++) System.out.println(n-i);
//        Задача 8
//        System.out.println("Введите число А:");
//        int a = scanner.nextInt();
//        System.out.println("Введите число B:");
//        int b = scanner.nextInt();
//        int sum = 0;
//        for (int i = a; i <= b; i++) {
//            if (i%2==0) {
//                sum+=i;
//            }
//        }
//        System.out.println(sum);
//        Задача 9
//        System.out.println("Введите строку:");
//        String a = scanner.nextLine();
//        String b = new StringBuilder(a).reverse().toString();
//        System.out.println(b);
//        Задача 10
//        System.out.println("Введите число:");
//        int a = scanner.nextInt();
//        int count = 0;
//        while (a>0){
//            a /= 10;
//            count +=1;
//        }
//        System.out.println(count);
//        Задача 11
//        System.out.println("Введите число:");
//        int a = scanner.nextInt();
//        int sum = 1;
//        for (int i = 1; i <= a; i++) {
//            sum *=i;
//        }
//        System.out.println(sum);
//        Задача 12
//        System.out.println("Введите число:");
//        int a = scanner.nextInt();
//        int count = 0;
//        while (a>0){
//            int b = a%10;
//            count +=b;
//            a /= 10;
//
//        }
//        System.out.println(count);
//        Задача 13
//        System.out.println("Введите строку:");
//        String a = scanner.nextLine().toLowerCase();
//        String b = new StringBuilder(a).reverse().toString();
//        if (b.equals(a))
//        System.out.println("Палиндром");
//        else System.out.println("Нет");
//        Задача 14
//        System.out.println("Введите размер массива:");
//        int a = scanner.nextInt();
//        int[] b =  new int[a];
//        System.out.println("Введите числа для массива: ");
//        for (int i = 0; i < a; i++) {
//
//            b[i] = scanner.nextInt();
//        }
//        OptionalInt max = Arrays.stream(b).max();
//        System.out.println(max.getAsInt());
//        Задача 15
//        System.out.println("Введите размер массива:");
//        int a = scanner.nextInt();
//        int[] b =  new int[a];
//        System.out.println("Введите числа для массива: ");
//        for (int i = 0; i < a; i++) {
//
//            b[i] = scanner.nextInt();
//        }
//        System.out.println(Arrays.stream(b).sum());
//        Задача 16
//        System.out.println("Введите размер массива:");
//        int a = scanner.nextInt();
//        int[] b =  new int[a];
//        System.out.println("Введите числа для массива: ");
//        for (int i = 0; i < a; i++) {
//
//            b[i] = scanner.nextInt();
//        }
//        int pol =0;
//        int otrit =0;
//        for (int i = 0; i < a; i++) {
//            if (b[i]>0) pol+=1;
//            else if (b[i]<0) otrit+=1;
//        }
//        System.out.println("Положительных: "+pol);
//        System.out.println("Отрицательных: "+otrit);
//        Задача 17
//        System.out.println("Введите 2 целых числа");
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        for (int i = a; i<= b; i++)
//        {
//            for (int j = 2; j < i; j++) {
//                if (i%j==0) {
//                    break;
//                }
//                else {System.out.println(i);
//                break;}
//            }
//
//        }

    }
    }
