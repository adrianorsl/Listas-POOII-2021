import java.util.List;

public interface Persistencia {

	public void gravar(List<Aluno> lista) throws Exception;
	
	public void ler(List<Aluno> lista);
	
}
