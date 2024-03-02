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
 * @brief Class Exercicio8
 */
public class Exercicio8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, n, s, i;
        x = input.nextInt();

        while (x >= 0) {
            n = input.nextInt();
            s = 0;
            for (i = 1; i <= n / 2; i++) {
                if (n % i == 0) {
                    s += i;
                }
            }
            if (s == n) {
                System.out.println(n + " eh perfeito");
            } else {
                System.out.println(n + " nao eh perfeito");
            }
            x--;
        }
    }
}
