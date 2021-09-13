package com.company;

public class Main {

    public static void main(String[] args) {
        zippo("rattle", 13); // 1
    }
    public static void baffle(String blimp) {
        System.out.println(blimp); // 6
        zippo("ping", -5); // 7
    }
    public static void zippo(String quince, int flag) {
        if (flag < 0) { // 2
            System.out.println(quince + " zoop"); // 8
        } else { // 3
            System.out.println("ik"); // 4
            baffle(quince); // 5
            System.out.println("boo-wa-ha-ha"); // 9
        }
    }
}
// Spørgsmål 3: Hvad er værdien af blimp når baffle bliver invoked:
// "rattle"

// Spørgsmål 4: Hvad er outputtet af programmet?:
// ik
// rattle
// pingzoop
// boo-wa-ha-ha