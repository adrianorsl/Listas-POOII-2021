import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		final TiposArquivos tipo = TiposArquivos.JSON;
		String caminho = tipo.getCaminho();
		Persistencia p = tipo.getPersistencia();
		
		List<Aluno> lista = new ArrayList<Aluno>();
		Aluno al = new Aluno("Adriano", 35201, "01010101011", "15/10/1988", "adrianorslsc@hotmail.com");
		lista.add(al);

		
		
	    p.gravar(caminho, lista);
		
		
	}

}
