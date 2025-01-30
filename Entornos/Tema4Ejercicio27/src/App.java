import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
    final int FRUTA=0;
    final int YOGUR=1;
    final int CONGELADO=2;

        Scanner teclado=new Scanner(System.in);
           
        LocalDate ld1=LocalDate.now();

        System.out.println("Introduce el tipo de alimento (Fruta=0, Yogur=1 o Congelado=2)");
            int opcion=teclado.nextInt();

        switch (opcion) {
            case FRUTA: 
                LocalDate ld2=ld1.plusDays(5);
                System.out.println("La fecha de caducidad es "+ld2);
                break;

            case YOGUR: 
                LocalDate ld3=ld1.plusDays(15);
                System.out.println("La fecha de caducidad es "+ld3);
                break;

            case CONGELADO:
                LocalDate ld4=ld1.plusMonths(3);
                System.out.println("La fecha de caducidad es "+ld4);
                break;
        
            default: 
                System.out.println("El valor introducido es incorrecto");
                break;
            
         }
    }
}
