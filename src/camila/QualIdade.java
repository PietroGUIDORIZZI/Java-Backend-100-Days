package camila;

import java.util.Scanner;

public class QualIdade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("qual sua idade?");
        int idade = sc.nextInt();

        if (idade >29 && idade <100){
            System.out.println("Véia");
        } else if (idade >= 0 && idade<15) {
            System.out.println("brotinha");
        }else if (idade > 14 && idade < 30){
            System.out.println("Ninfeta");
        }else if(idade < 0){
            System.out.println("idade inválida. você nem nasceu!");
        }else{
            System.out.println("Vocẽ não vai morrer não???");
        }

    }
}