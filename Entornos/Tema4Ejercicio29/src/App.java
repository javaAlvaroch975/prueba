import java.time.LocalTime;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado= new Scanner(System.in);


        System.out.println("Dime una hora en formato hh:mm:ss");
        String hora=teclado.nextLine();
        try{
        LocalTime lt1 = LocalTime.parse(hora);

        int minutos=lt1.getMinute();

        LocalTime lt2=lt1.minusMinutes(320);

        LocalTime ahora= LocalTime.now();


        System.out.println("La hora introducida tiene "+minutos+" minutos");
        System.out.println("Hace 320 minutos eran las "+lt2);
        if (ahora.isAfter(lt1)){
        System.out.println("La hora actual "+ahora+" es mayor que la hora introducida "+lt1);
        }else{
        System.out.println("La hora introducida "+lt1+" es mayor que la hora actual "+ahora);
        }
    }catch (DateTimeParseException e){
        System.out.println("Formato de fecha incorrecto");
    }
    }
}
