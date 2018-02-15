import java.util.Scanner;
import java.text.DecimalFormat;
public class IMC {
	public static void main(String[]args){
/**Luana Queiros **/
	
	int anonascimento, anoatual, idade,nomesexo, sexo;
	double altura, peso, imc;
	String nome = null;
		Scanner sc = new Scanner(System.in);
		DecimalFormat dc = new
		DecimalFormat("0.00");
		System.out.print("Qual é o seu Nome?\n");
		nome = sc.nextLine();
		
		System.out.print("Qual é o seu sexo: masculino ou feminino? \n Para masculino digite 1. \n Para feminino digite 2. \n");		
		sexo = sc.nextInt(); 
		nomesexo = sexo;
			if (nomesexo == 1)
			{
				System.out.print("- O seu sexo é: masculino!\n \n");
			}
			if (nomesexo == 2)
			{
				System.out.print("- O seu sexo é: feminino!\n\n");
			} 
System.out.println ("Olá " +nome);

		System.out.println(" Digite o Ano de Nascimento:");
		anonascimento=sc.nextInt();
		System.out.println("Digite o ano Atual:");
		anoatual=sc.nextInt();
			idade = (anoatual - anonascimento);
		System.out.println ("A sua idade é:"+idade);
		System.out.println("Digite o seu Peso");
		peso=sc.nextDouble();
		System.out.println("Digite a sua altura");
		altura=sc.nextDouble();
			imc = peso/((altura)*(altura));
		if (imc <16 ){
			System.out.println ("IMC = Magreza grave "+imc);
		}
		else if (imc >16 || imc <=17) {
			System.out.println ("IMC= Magreza Moderada "+dc.format(imc));
		}
		else if (imc >17 || imc<=18) {
			System.out.println ("IMC = Magreza Leve  "+imc);
		}
		else if (imc >=25 || imc<= 30) {
			System.out.println ("IMC = Sobrepeso  "+imc);
		}
		else if (imc > 30 || imc<= 35) {
			System.out.println ("IMC = Obesidade Grau 1"+imc);
		}
		else if (imc >35 || imc<= 40) {
			System.out.println ("IMC = Obesidade Grau 2(Severa)"+imc);
		}
		else if (imc >40 ){
			System.out.println ("IMC = Obesidade Grau 3 (Mórbida)"+imc);
		}

	}
} 





