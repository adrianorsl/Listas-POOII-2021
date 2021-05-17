package com.classes;

import java.util.List;


public class AlunoBO implements Persistencia{

	 public boolean inserir(String Tabela, Aluno aluno){
	        if (existe(Tabela, aluno) != true) {
	            AlunoDAO alunosDAO = new AlunoDAO();
	            return alunosDAO.inserir(Tabela, aluno);
	        }
	        return false;
	    }
	    public boolean alterar(String Tabela, Aluno aluno){
	        AlunoDAO alunosDAO = new AlunoDAO();
	        return alunosDAO.alterar(Tabela, aluno);
	    }
	    public boolean excluir(String Tabela, Aluno aluno){
	    	AlunoDAO alunosDAO = new AlunoDAO();
	        return alunosDAO.excluir(Tabela, aluno);
	    }
	    public Aluno procurarPorCpf(String Tabela, Aluno aluno){
	        AlunoDAO alunosDAO = new AlunoDAO();
	        return alunosDAO.procurarPorCpf(Tabela, aluno);
	    }
	    public Aluno procurarPorMatricula(String Tabela, Aluno aluno){
	    	 AlunoDAO alunosDAO = new AlunoDAO();
	        return alunosDAO.procurarPorMatricula(Tabela, aluno);
	    }
	    public boolean existe(String Tabela, Aluno aluno){
	    	AlunoDAO alunosDAO = new AlunoDAO();
	        return alunosDAO.existe(Tabela, aluno);
	    }
	    public List<Aluno> pesquisarTodos(String Tabela, Aluno aluno){
	        AlunoDAO alunosDAO = new AlunoDAO();
	        return alunosDAO.pesquisarTodos(Tabela, aluno);
	    }
		@Override
		public void gravar(String caminho, Aluno aluno) throws Exception {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void ler(String caminho, Aluno aluno) {
			// TODO Auto-generated method stub
			
		}
	    
}
