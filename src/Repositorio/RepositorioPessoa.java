package Repositorio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import Entidade.Pessoa;

public class RepositorioPessoa implements InRepositorioPessoa{

	List<Pessoa> listaPessoas = new ArrayList<Pessoa>();
	
	@Override
	public boolean salvaPessoa(Pessoa pessoa) {
		//SE for tentar adiciona  por exemplo um veiculo a lista
		//Iria disparar o erro e ia retornar false e não seria salvar a operação
		//Se não der nenhum erro, irá retornar verdadeiro
		try {
			listaPessoas.add(pessoa);
		} catch (Exception e) {
			return false;
		}
		
		return true;
		
	}

	@Override
	public boolean deletaPessoa(Long id) {
		
		for(Pessoa pessoa : listaPessoas) {
			if(pessoa.getId()==id) {
				listaPessoa().remove(pessoa);
			}
		}
		
		return false;
	}

	@Override
	public List<Pessoa> listaPessoa() {
		
		return listaPessoas;
	}

	
	public boolean alteraPessoa(Pessoa pessoa) {
		
		for(Pessoa pessoa1 : listaPessoas) {
			if(pessoa1.getId()==pessoa.getId()) {
				
				listaPessoas.remove(pessoa1);
				listaPessoas.add(pessoa);
			}
		}
		return false;
	}
	

}
