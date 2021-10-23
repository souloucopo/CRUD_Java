package Repositorio;

import java.util.List;

import Entidade.Pessoa;

public interface InRepositorioPessoa {
	
	public boolean salvaPessoa(Pessoa pessoa);
	public boolean deletaPessoa(Long id);
	public List<Entidade.Pessoa> listaPessoa();
	public boolean alteraPessoa(Pessoa pessoa);
	
	

}
