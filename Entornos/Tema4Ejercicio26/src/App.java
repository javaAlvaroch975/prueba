import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        try{
        System.out.println("Introduzca una fecha en el formato aaaa-mm-dd");
        String fecha=teclado.nextLine();

        LocalDate ld1=LocalDate.parse(fecha);

        int mes=ld1.getMonthValue();

        LocalDate ld2=ld1.plusYears(1);

        DayOfWeek ld3=ld2.getDayOfWeek();

        int dias=ld1.lengthOfMonth();

        System.out.println("Es el mes "+mes);
        System.out.println("Dentro de un año será "+ld3);
        System.out.println("El mes tiene "+dias+" días");
        }catch (DateTimeParseException e){
            System.out.println("Fecha incorrecta");
        }
    }
}
