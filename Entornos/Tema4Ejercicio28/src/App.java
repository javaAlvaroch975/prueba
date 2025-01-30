import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class App {
    public static void main(String[] args) throws Exception {
        LocalDate hoy = LocalDate.now();
        LocalDate inicioClase= LocalDate.of(2024, 9, 10);
        LocalDate finClase= LocalDate.of(2025, 6, 30);
        LocalDate cumpleanyos = LocalDate.of(2025, 2, 15);

        Period inicio = Period.between(inicioClase, hoy);
        Period finalClase = Period.between(hoy, finClase);
        Period cumple = Period.between(hoy, cumpleanyos);

        long dias = ChronoUnit.DAYS.between(hoy, cumpleanyos);

        System.out.println("Desde el inicio de clase han transcurrido "+inicio.getMonths()+" meses y "+inicio.getDays()+" días");
        System.out.println("Para acabar el curso falta "+finalClase.getMonths()+" meses y "+finalClase.getDays()+" días");
        System.out.println("Hasta mi cumpleaños falta "+cumple.getMonths()+" meses y "+cumple.getDays()+ " días o "+dias+" días");

    }
}
