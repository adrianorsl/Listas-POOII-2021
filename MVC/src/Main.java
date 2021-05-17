import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		final TiposDeArquivos tipo = TiposDeArquivos.BancoDados;
		String caminho = tipo.getCaminho();
		Persistencia p = tipo.getPersistencia();
		
		
		
	    p.gravar(caminho, lista);
	    
	    p.ler(caminho, lista);
	    
		
		
	}
	

}
