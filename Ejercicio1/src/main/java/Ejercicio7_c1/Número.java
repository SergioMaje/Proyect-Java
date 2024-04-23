/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio7_c1;

import java.util.Arrays;

/**
 *
 * @author majes
 */
public class Número {
    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean esPerfecto(int num) {
        int sum = 1;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                sum += i;
                if (i * i != num) {
                    sum += num / i;
                }
            }
        }
        return sum == num && num != 1;
    }

    public static boolean esCapicua(int num) {
        int original = num;
        int reverse = 0;
        while (num != 0) {
            int digito = num % 10;
            reverse = reverse * 10 + digito;
            num /= 10;
        }
        return original == reverse;
    }

    public static boolean sonAmigos(int num1, int num2) {
        int sumDiv1 = Arrays.stream(extraeDivisores(num1)).sum();
        int sumDiv2 = Arrays.stream(extraeDivisores(num2)).sum();
        return sumDiv1 == num2 && sumDiv2 == num1;
    }

    public static int[] extraeDivisores(int num) {
        int count = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        int[] divisores = new int[count];
        int index = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                divisores[index++] = i;
            }
        }
        return divisores;
    }

    public static void duplica(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] *= 2;
        }
    }

    public static void ordena(int[] nums, int tipoOrden) {
        if (tipoOrden == ASCENDENTE) {
            Arrays.sort(nums);
        } else if (tipoOrden == DESCENDENTE) {
            Arrays.sort(nums);
            for (int i = 0; i < nums.length / 2; i++) {
                int temp = nums[i];
                nums[i] = nums[nums.length - 1 - i];
                nums[nums.length - 1 - i] = temp;
            }
        }
    }

    public static int[] eliminaPrimos(int[] nums) {
        return Arrays.stream(nums).filter(num -> !esPrimo(num)).toArray();
    }

    public static final int ASCENDENTE = 1;
    public static final int DESCENDENTE = 2;

}
