package com.classes;

import java.util.List;

public interface Persistencia {

	public void gravar(List<Aluno> lista) throws Exception;
	
	public List<Aluno> ler(List<Aluno> lista) throws Exception;
}
