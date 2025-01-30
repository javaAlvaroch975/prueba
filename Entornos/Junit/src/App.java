import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {

    boolean comprobarExpReg(String cadena, String er){
        Pattern p=Pattern.compile(er);
        Matcher m=p.matcher(cadena);
        return m.matches();
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
