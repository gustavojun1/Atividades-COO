
public class DataTeste {
	
	public static void main(String[] args) {
		Data d1 = new Data("7", "4", "2017");
		Data d2 = new Data("15", "5", "2017");
		
		System.out.println(d1);
		System.out.println(d2);
		
		d1.trocarCom(d2);
		
		System.out.println("Após a troca:");
		
		System.out.println(d1);
		System.out.println(d2);
	}

}
