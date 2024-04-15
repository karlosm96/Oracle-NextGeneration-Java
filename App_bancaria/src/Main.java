import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean start = true;
        int choice;
        boolean choiceValidation = false;
        Scanner scanner = new Scanner(System.in);
        Client newClient = new Client(15000000.57, "Calos Muñoz", "Cuenta corriente");

        System.out.println(newClient.toString());

        while(start){
            System.out.println("""
            ** Esciba el numero de la opcion deseada **
            1 - Consultar saldo
            2 - Retirar
            3 - Depositar
            9 - Salir
            """);

            do {
                choice = scanner.nextInt();
                choiceValidation = validation(choice);
                if(!choiceValidation){
                    System.out.println("Error: Opcion invalida");
                }
            } while(!choiceValidation);

            Operations operations = new Operations(newClient);

            switch (choice){
                case 1:
                    System.out.println(String.format("Su saldo es de: %.2f", operations.getBalance()));
                    break;
                case 2:
                    System.out.println("Porfavor imgrese el monto a extraer:");
                    double withdrawalAmount = scanner.nextDouble();
                    operations.withdrawal(withdrawalAmount);
                    System.out.println(String.format("Su saldo actual es de: %.2f",operations.getBalance()));
                    break;
                case 3:
                    System.out.println("Porfavor imgrese el monto a depositar:");
                    double depositAmount = scanner.nextDouble();
                    operations.deposit(depositAmount);
                    System.out.println(String.format("Su saldo actual es de: %.2f",operations.getBalance()));
                case 9:
                    start = false;
                default:
                    System.out.println("Error: algo salio muy mal (default option)");
                    break;
            }
        }
    }

    public static boolean validation(int number){
        return !((number < 1) || ((number > 3) && (number < 9)) || (number > 9) || !isNumber(String.valueOf(number)));
    }

    public static boolean isNumber(String texto) {
        return texto.matches("-?\\d+(\\.\\d+)?"); // Utilizamos una expresión regular para verificar si la cadena contiene solo caracteres numéricos
    }
}