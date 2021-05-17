package com.classes;


public interface Persistencia {

	public void gravar(Aluno aluno) throws Exception;
	
	public void ler(Aluno aluno);
}
