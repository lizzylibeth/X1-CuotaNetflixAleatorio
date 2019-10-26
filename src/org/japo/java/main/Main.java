/* 
 * Copyright 2019 Elísabet Palomino .
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Elísabet Palomino
 */
public class Main {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static final Random RND = new Random();

    public static void main(String[] args) {

        //Constantes       
            final double CUOTA_NETFLIX = 30.0;

        //variable
            double cuotaA, cuotaB;

        //generar dato
            cuotaA = RND.nextDouble() * (CUOTA_NETFLIX - 0) + 0;
            cuotaB = CUOTA_NETFLIX - cuotaA;

        //mensaje
            System.out.printf("La cuota Netflix es de: %.2f%n", CUOTA_NETFLIX);
            System.out.printf("El amigo 1 paga: %.2f%n", cuotaA);
            System.out.printf("El amigo 2 paga: %.2f%n ", cuotaB);

            
            
    }//main

}//class


