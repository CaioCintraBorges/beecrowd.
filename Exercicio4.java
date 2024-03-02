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
 * @brief Class Exercicio4
 */
public class Exercicio4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double valor;

        valor = input.nextDouble();

        if ((valor >= 0) & (valor <= 25)) {
            System.out.println("Intervalo [0,25]");
        } else if ((valor > 25) & (valor <= 50)) {
            System.out.println("Intervalo (25,50]");
        } else if ((valor > 50) & (valor <= 75)) {
            System.out.println("Intervalo (50,75]");
        } else if ((valor > 75) & (valor <= 100)) {
            System.out.println("Intervalo (75,100]");
        } else {
            System.out.println("Fora de intervalo");
        }
    }
}
