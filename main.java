
/*
Online Java - IDE, Code Editor, Compiler

Online Java is a quick and easy tool that helps you to build, compile, test your programs online.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Selecione seu compo");
        System.out.println("1. Combo Master");
        System.out.println("2. Super Combo");
        System.out.print("Sua escolha: ");
            
        Scanner input = new Scanner(System.in);
            
        int tipo = input.nextInt();
        Combo combo = new Combo();
        combo.CriarCombo(tipo);
        System.out.println(combo);
    }
}
