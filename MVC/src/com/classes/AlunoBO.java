package com.classes;

import java.util.List;


public class AlunoBO implements Persistencia{

	 public boolean inserir(Aluno aluno){
	        if (existe(aluno) != true) {
	            AlunoDAO alunosDAO = new AlunoDAO();
	            return alunosDAO.inserir(aluno);
	        }
	        return false;
	    }
	    public static boolean alterar(Aluno aluno){
	        AlunoDAO alunosDAO = new AlunoDAO();
	        return alunosDAO.alterar(aluno);
	    }
	    public static boolean excluir(Aluno aluno){
	    	AlunoDAO alunosDAO = new AlunoDAO();
	        return alunosDAO.excluir(aluno);
	    }
	    public static Aluno procurarPorCpf(Aluno aluno){
	        AlunoDAO alunosDAO = new AlunoDAO();
	        return alunosDAO.procurarPorCpf(aluno);
	    }
	    public static Aluno procurarPorMatricula(Aluno aluno){
	    	 AlunoDAO alunosDAO = new AlunoDAO();
	        return alunosDAO.procurarPorMatricula(aluno);
	    }
	    public static boolean existe(Aluno aluno){
	    	AlunoDAO alunosDAO = new AlunoDAO();
	        return alunosDAO.existe(aluno);
	    }
	    public static List<Aluno> pesquisarTodos(Aluno aluno){
	        AlunoDAO alunosDAO = new AlunoDAO();
	        return alunosDAO.pesquisarTodos(aluno);
	    }
		@Override
		public void gravar(Aluno aluno) throws Exception {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void ler(Aluno aluno) {
			// TODO Auto-generated method stub
			
		}
	    
}
