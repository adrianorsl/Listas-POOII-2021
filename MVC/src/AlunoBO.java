import java.util.List;


public class AlunoBO {

	 public boolean inserir(Aluno aluno){
	        if (existe(aluno) != true) {
	            AlunoDAO alunosDAO = new AlunoDAO();
	            return alunosDAO.inserir(aluno);
	        }
	        return false;
	    }
	    public boolean alterar(Aluno aluno){
	        AlunoDAO alunosDAO = new AlunoDAO();
	        return alunosDAO.alterar(aluno);
	    }
	    public boolean excluir(Aluno aluno){
	    	AlunoDAO alunosDAO = new AlunoDAO();
	        return alunosDAO.excluir(aluno);
	    }
	    public Aluno procurarPorCpf(Aluno aluno){
	        AlunoDAO alunosDAO = new AlunoDAO();
	        return alunosDAO.procurarPorCpf(aluno);
	    }
	    public Aluno procurarPorMatricula(Aluno aluno){
	    	 AlunoDAO alunosDAO = new AlunoDAO();
	        return alunosDAO.procurarPorMatricula(aluno);
	    }
	    public boolean existe(Aluno aluno){
	    	AlunoDAO alunosDAO = new AlunoDAO();
	        return alunosDAO.existe(aluno);
	    }
	    public List<Aluno> pesquisarTodos(){
	        AlunoDAO alunosDAO = new AlunoDAO();
	        return alunosDAO.pesquisarTodos();
	    }
	    
}
