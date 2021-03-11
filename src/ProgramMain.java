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
		System.out.println("Quantos anos você tem?");
		int idade=s.nextInt();
		pessoa.setIdade(idade);
		}catch (Exception e) {
			System.out.println("Idade só pode ser número");
		}
		
		System.out.println("Onde você mora?");		
		String onde_mora = s.next();
		
		System.out.println("Qual seu hobby?");		
		String hobby = s.next();
		
		try {
		System.out.println("Que ano você nasceu?");
		int ano_nascimento=s.nextInt();
		pessoa.setAno_nascimento(ano_nascimento);
		}catch (Exception e) {
			System.out.println("Ano de nascimento só pode ser número");
		}
		
		
		pessoa.setNome(nome);
		pessoa.setOnde_Mora(onde_mora);
		pessoa.setHobby(hobby);
		
		return pessoa;
		
		
	}

}
