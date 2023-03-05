import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double valorSalario, impostoFaixa1, impostoFaixa2, impostoFaixa3,
		impostoFaixa4, resultF2, resultF3, resultF4;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o valor do salário: ");
		valorSalario = sc.nextDouble();
		
		resultF2 = valorSalario - 2000.00;
		resultF3 = valorSalario - 3000.00;
		resultF4 = valorSalario - 4500.00;
		impostoFaixa1 = 0.0;
		impostoFaixa2 = resultF2 * 0.08;
		impostoFaixa3 = (resultF3 * 0.18) + ((valorSalario - resultF3 - 2000.00) * 0.08);
		impostoFaixa4 = (resultF4 * 0.28) + ((valorSalario - resultF4 - 3000.00) * 0.18)
		+ (1000.00 * 0.08);
		
			
		if (valorSalario <= 2000.00 ){
			System.out.println("Faixa 1 - ISENTO - Imposto R$ " + impostoFaixa1);
		
		} else if (valorSalario > 2000.00 && valorSalario <= 3000.00){
			System.out.println("Faixa 2 - Imposto R$ " + impostoFaixa2);

		} else if (valorSalario > 3000.00 && valorSalario <= 4500.00){
			System.out.println("Faixa 3 - Imposto R$ " + impostoFaixa3);
			
		} else {
			System.out.println("Faixa 4 - Imposto R$ " + impostoFaixa4);
		}
			
		sc.close();
	
		
	}

}
