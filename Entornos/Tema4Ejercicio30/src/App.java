import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado=new Scanner(System.in);

        LocalTime ahora = LocalTime.now();

        System.out.println("Introduzca la hora de inicio de alquiler en formato hh:mm:ss");
        String fechaDevolucion=teclado.nextLine();

        LocalTime devolucion= LocalTime.parse(fechaDevolucion);

        Duration d = Duration.between(devolucion, ahora);

        System.out.println("Han pasado "+d.toHours()+" horas y "+d.toMinutes()+" minutos");

        long minutos=d.toMinutes();

        if (minutos<30) {
            System.out.println("Gracias por devolver");
        } else if (minutos<=60) {

            System.out.println("Tiene que pagar 0,52€ por la demora");

        }else{
            long horas=d.toHours();

            double multa =horas*2.08;

            System.out.println("Tiene que pagar "+multa+"€ por la demora");
        }
    }
}
