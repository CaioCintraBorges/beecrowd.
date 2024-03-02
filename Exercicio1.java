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
 * @brief Class Exercicio1
 */
public class Exercicio1 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int N, horas, minutos, segundos;
/*
        
        */
        N = input.nextInt();

        horas = N / 3600;
        minutos = (N % 3600) / 60;
        segundos = (N % 3600) % 60;
        System.out.println(horas + ":" + minutos + ":" + segundos);
    }
}
