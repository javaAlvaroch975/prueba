public class App {
    public static void main(String[] args) throws Exception {
        imprimirInicio();
        imprimirFin(null);

        int n=9;
        int a = 25+n;
        int x=a;
        int v=400+a;

    }

    private static void imprimirFin(String mensaje) {
        System.out.println(mensaje);
        System.out.println("Esto es un println");
        System.out.println("Cebolla");
    }

    private static void imprimirInicio() {
        System.out.println("Hello, World!");
        System.out.println("¡Hola mundo!");
        System.out.println("Texto de ejemplo");
    }
}
