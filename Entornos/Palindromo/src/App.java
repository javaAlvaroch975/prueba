public class App {
    public static void main(String[] args) throws Exception {
        String palabra1="arroz";
		String palabra2="zorra";
		int i=1;
		boolean son_palindromos=true;
		
		while ((son_palindromos)&&(i<=palabra1.length())) {
			
		if (palabra1.charAt(i-1)!=palabra2.charAt(palabra2.length()-i)) {
		son_palindromos=false;
		}
		
		i++;
		}
		if (son_palindromos)
		System.out.println(palabra1+" y "+palabra2+" son palíndromos");
		else
		System.out.println(palabra1+" y "+palabra2+" no son palíndromos");
    }
}
