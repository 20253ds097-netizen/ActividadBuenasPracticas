import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int numeroLimite = pedirEntero();
        int resultadoSuma = sumarHastaN(numeroLimite);
        System.out.println("La suma de todos los números desde 1 hasta " + numeroLimite + " es: " + resultadoSuma);
    }
    public static int pedirEntero() {
        Scanner lector = new Scanner(System.in);
        System.out.print("Por favor, ingresa un número entero positivo: ");
        while (!lector.hasNextInt()) {
            System.out.println("Eso no parece un número. Intenta de nuevo:");
            lector.next();
        }
        return lector.nextInt();
    }
    public static int sumarHastaN(int n) {
        int sumaAcumulada = 0;
        for (int i = 1; i <= n; i++) {
            sumaAcumulada += i;
        }
        return sumaAcumulada;
    }
}