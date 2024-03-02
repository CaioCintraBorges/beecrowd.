/*
 * Copyright (C) 2024 Caio Cintra B. Paula <caioexecutivo11@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.mycompany.projetobeecrowd;

import java.util.Scanner;

/**
 *
 * @author Caio Cintra B. Paula <caioexecutivo11@gmail.com>
 * @date 02/03/2024
 * @brief Class Exercicio6
 */
public class Exercicio6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c;

        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        if ((a < b) & (b < c)) {
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        } else if ((a < c) & (c < b)) {
            System.out.println(a);
            System.out.println(c);
            System.out.println(b);
        } else if ((b < a) & (a < c)) {
            System.out.println(b);
            System.out.println(a);
            System.out.println(c);
        } else if ((b < c) & (c < a)) {
            System.out.println(b);
            System.out.println(c);
            System.out.println(a);
        } else if ((c < a) & (a < b)) {
            System.out.println(c);
            System.out.println(a);
            System.out.println(b);
        } else {
            System.out.println(c);
            System.out.println(b);
            System.out.println(a);
        }

        System.out.println("\n" + a);
        System.out.println(b);
        System.out.println(c);
    }
}
