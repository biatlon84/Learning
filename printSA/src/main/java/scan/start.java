/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scan;

import java.math.BigInteger;

/**
 *
 * @author Комп
 */
public class start {

    public static void main(String[] args) {
        double array[] = new double[]{-0.001, 4.23, 1.876, 0.34, -456.3, 0, -234.1};
        int min = 0, max = 0, z = 0;
        double bu = -111111111110f, bumin = 10000000000f;
        //double mm=0;
        for (int i = 0; array.length > i; i++) {
            if (array[i] > bu) {
                bu = array[i];
                max = i;
            }
            if (bumin > array[i]) {
                bumin = array[i];
                min = i;
            }
            z++;

        }
        array[min] = bu;
        array[max] = bumin;
        System.out.println("max " + bu);
        System.out.println("min " + bumin);
        System.out.println("z " + z);
        int i = 0;
        while (i < array.length) {
            if (i < array[i]) {
                System.out.println(array[i]);
            }
            i++;
        }
    }

}
