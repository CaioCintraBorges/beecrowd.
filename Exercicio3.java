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
import java.text.DecimalFormat;
import static java.lang.Math.sqrt;

/**
 *
 * @author Caio Cintra B. Paula <caioexecutivo11@gmail.com>
 * @date 02/03/2024
 * @brief Class Exercicio3
 */
public class Exercicio3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00000");
        double A, B, C, R1, R2;

        A = input.nextDouble();
        B = input.nextDouble();
        C = input.nextDouble();

        if ((A == 0) | (B * B - 4 * A * C < 0)) {
            System.out.println("Impossivel calcular");
        } else {
            R1 = (-B + Math.sqrt(B * B - 4 * A * C)) / (2 * A);
            R2 = (-B - Math.sqrt(B * B - 4 * A * C)) / (2 * A);
            System.out.println("R1 = " + df.format(R1));
            System.out.println("R2 = " + df.format(R2));
        }
    }
}
