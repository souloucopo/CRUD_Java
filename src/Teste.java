import java.util.ArrayList;
import java.util.List;

import Entidade.Pessoa;
import Repositorio.RepositorioPessoa;

public class Teste {
	static RepositorioPessoa rp = new RepositorioPessoa();
	public static void main(String[] args) {
		
		BancoPopular();
		listaPessoas();
		rp.deletaPessoa((long) 3);
		listaPessoas();
		alteraDados();
		listaPessoas();

	}
	
	public static void alteraDados() {
		Pessoa pessoa  = new Pessoa();
		pessoa.setNome("Marcos Antonio");
		pessoa.setIdade(26);
		pessoa.setId(4);
		pessoa.setSexo("Masculino");
		rp.alteraPessoa(pessoa);
	}
	
	public static void BancoPopular() {
		
		
		Pessoa pessoa1  = new Pessoa();
		pessoa1.setNome("Rodrigo Eduardo");
		pessoa1.setIdade(19);
		pessoa1.setId(1);
		pessoa1.setSexo("Masculino");
		rp.salvaPessoa(pessoa1);
		
		Pessoa pessoa2  = new Pessoa();
		pessoa2.setNome("Lucas Marques");
		pessoa2.setIdade(25);
		pessoa2.setId(2);
		pessoa2.setSexo("Masculino");
		rp.salvaPessoa(pessoa2);
		
		Pessoa pessoa3  = new Pessoa();
		pessoa3.setNome("Flavin do Pneu");
		pessoa3.setIdade(30);
		pessoa3.setId(3);
		pessoa3.setSexo("Masculino");
		rp.salvaPessoa(pessoa3);
		
		Pessoa pessoa  = new Pessoa();
		pessoa.setNome("Shaolin Matador de Porco");
		pessoa.setIdade(26);
		pessoa.setId(4);
		pessoa.setSexo("Masculino");
		
		rp.salvaPessoa(pessoa);
	}

	public static void listaPessoas() {
		List<Pessoa> lista = new ArrayList<Pessoa>();
		
		
		lista = rp.listaPessoa();
		
		//Vai pegar criar um atributo do tipo pessoa para acessar a classe pessoa e percorrer a lista
		for(Pessoa pessoa : lista) {
			System.out.println("ID: "+pessoa.getId());
			System.out.println("NOME: "+pessoa.getNome());
			System.out.println("IDADE: "+pessoa.getIdade());
			System.out.println("SEXO: "+pessoa.getSexo());
			System.out.println("-------------------------------------");
		}
	}
	
}
