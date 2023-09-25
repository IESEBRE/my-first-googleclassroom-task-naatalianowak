package org.example;
import java.util.Scanner;

public class EntradaDades {

        public static void main(String[] args) {
            Scanner ent = new Scanner(System.in);
            int edad = ent.nextInt();
            edad = edad + 1;
            System.out.println("L'any vinent tindràs " + edad + " anys");
        }
    }

