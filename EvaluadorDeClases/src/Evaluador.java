import java.util.Scanner;

public class Evaluador {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa la nota de matemáticas");
        int mate = sc.nextInt();
        if ( mate < 0 || mate > 10) {
            System.out.println("NOTA INVALIDA, INGRESA UNA NOTA VALIDA");
        }
        System.out.println("Ingresa la nota de ciencias");
        int ci = sc.nextInt();
        if ( ci < 0 || ci > 10) {
            System.out.println("NOTA INVALIDA, INGRESA UNA NOTA VALIDA");
        }
        System.out.println("Ingresa la nota de lenguaje");
        int leng = sc.nextInt();
        if ( leng < 0 || leng > 10) {
            System.out.println("NOTA INVALIDA, INGRESA UNA NOTA VALIDA");
        }
        int promedio = (( mate + ci + leng ) / 3 );




        if ( promedio > 5 && promedio <= 8) {
            System.out.println("Tu promedio final es " + promedio + " calificado como ACEPTABLE");
        }
        else if ( promedio > 8 && promedio <= 10) {
            System.out.println("Tu promedio final es " + promedio + " calificado como EXCELENTE");
        }
        else if ( promedio > 3 && promedio <= 5) {
            System.out.println("Tu promedio final es " + promedio + " calificado como INSUFICIENTE");
        }
        else if ( promedio <= 3 && promedio > 0) {
            System.out.println("Tu promedio final es " + promedio + " calificado como NO APROBADO");
        }




    }
}
