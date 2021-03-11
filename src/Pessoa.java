
public class Pessoa {
public String nome;
public int idade;
public String onde_mora;
public String hobby;
public int ano_nascimento;

public Pessoa (String nome, int idade,String onde_mora,String hobby, int ano_nascimento ) {
	super();
	this.nome=nome;
	this.idade=idade;
	this.onde_mora=onde_mora;
	this.hobby=hobby;
	this.ano_nascimento= ano_nascimento;
}

public Pessoa() {
	super();
}

public void setNome(String nome) {
	this.nome=nome;
}

public String getNome() {
	return nome;
}

public void setIdade(int idade) {
	this.idade=idade;
}

public int getIdade() {
	return idade;
}


public String getOnde_Mora() {
	return onde_mora;
}

public void setOnde_Mora(String onde_mora) {
	this.onde_mora=onde_mora;
}

public void setHobby(String hobby) {
	this.hobby=hobby;
}

public String getHobby() {
	return hobby;
}

public void setAno_nascimento(int ano_nascimento) {
	this.ano_nascimento=ano_nascimento;
}

public int getAno_nascimento() {
	return ano_nascimento;
}



@Override
public String toString() {
	return "Pessoa [Nome=" + nome +", idade=" + idade +" Onde Mora "+ onde_mora +" Hobby="+hobby+" Ano Nascimento =" + ano_nascimento +   "]";
}

}
