//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int randomNum = new Random().nextInt(10);
        int maxNumOfAttempts = 5;
        boolean winCondition = false;
        int winAttemp = 0;

        System.out.println("""
        Vamos a dar inicio al juego de adivinanza
        Tienes 5 intentos para divinar el numero entre 0 y 100
        """);

        for(int i = 1; i <= maxNumOfAttempts; i++){
            System.out.println("Porfavor ingresa un numero: ");
            int attempNumber = scanner.nextInt();

            if(attempNumber == randomNum){
                winCondition = true;
                winAttemp = i;
                break;
            } else{
                if(attempNumber > randomNum){
                    System.out.println("El numero es mas pequeño, intentalo de nuevo");
                }else{
                    System.out.println("El numero es mas grande, intentalo denuevo");
                }
            }
        }

        if(winCondition){
            System.out.println(String.format("Felicitaciones adinivaste el numero en el %d° intento", winAttemp));
        } else{
            System.out.println("Has perdido");
        }

        System.out.println("Fin del juego");
    }
}