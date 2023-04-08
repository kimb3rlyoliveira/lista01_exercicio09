import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double fahrenheit;
        double celsius;

        Scanner teclado = new Scanner(System.in);
        System.out.print("Insira a temperatura em Fahrenheit: ");
        fahrenheit = teclado.nextDouble();
        teclado.close();
        
        celsius = 5*((fahrenheit-32)/9);
        System.out.println(" ");
        System.out.println("A temperatura convertida para Graus Celsius é: " + celsius + "°C");

    }
}