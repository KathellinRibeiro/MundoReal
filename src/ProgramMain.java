import java.util.Scanner;

public class ProgramMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//People();
		System.out.println(People());
	}
	
	public static  Pessoa People() {
		Pessoa pessoa;
		pessoa = new Pessoa();
		System.out.println("Oiii!! Tudo bem??");
				Scanner s = new Scanner(System.in);
				
		System.out.println("Qual seu nome?");		
		String nome = s.next();
		
		try {
		System.out.println("Quantos anos voc� tem?");
		int idade=s.nextInt();
		pessoa.setIdade(idade);
		}catch (Exception e) {
			System.out.println("Idade s� pode ser n�mero");
		}
		
		System.out.println("Onde voc� mora?");		
		String onde_mora = s.next();
		
		System.out.println("Qual seu hobby?");		
		String hobby = s.next();
		
		try {
		System.out.println("Que ano voc� nasceu?");
		int ano_nascimento=s.nextInt();
		pessoa.setAno_nascimento(ano_nascimento);
		}catch (Exception e) {
			System.out.println("Ano de nascimento s� pode ser n�mero");
		}
		
		
		pessoa.setNome(nome);
		pessoa.setOnde_Mora(onde_mora);
		pessoa.setHobby(hobby);
		
		return pessoa;
		
		
	}

}
