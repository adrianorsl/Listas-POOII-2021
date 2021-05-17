import java.util.List;

public interface Persistencia {

	public void gravar(String caminho, List<AlunoDTO> lista) throws Exception;
	
	public void ler(String caminho, List<AlunoDTO> lista);
}
