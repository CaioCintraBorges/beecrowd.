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
 * @brief Class Exercicio7
 */
public class Exercicio7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, y;

        do {
            x = input.nextInt();
            y = input.nextInt();
            if ((x > 0) & (y > 0)) {
                System.out.println("primeiro");
            } else if ((x < 0) & (y > 0)) {
                System.out.println("segundo");
            } else if ((x < 0) & (y < 0)) {
                System.out.println("terceiro");
            } else if ((x > 0) & (y < 0)) {
                System.out.println("quarto");
            }
        } while ((x != 0) && (y != 0));
    }
}
