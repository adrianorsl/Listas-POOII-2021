package com.classes;


public interface Persistencia {

	public void gravar(String caminho, Aluno aluno) throws Exception;
	
	public void ler(String caminho, Aluno aluno);
}
