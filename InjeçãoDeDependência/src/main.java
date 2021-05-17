import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		final TiposArquivos tipo = TiposArquivos.JSON;
		Persistencia p = tipo.getPersistencia();
		
		List<Aluno> lista = new ArrayList<Aluno>();
		Aluno al = new Aluno("Adriano", 35201, "01010101011", "15/10/1988", "adrianorslsc@hotmail.com");
		Aluno al2 = new Aluno("Jamile", 35214, "02020202021", "28/02/1998", "Jamile@homail.com");
		lista.add(al);
		lista.add(al2);
		Aluno al3 = new Aluno("cristiano", 35234, "23423020212", "28/02/1998", "cristiano@homail.com");
		lista.add(al3);

		
		
	    p.gravar(lista);
	    
	    p.ler(lista);
	    
		
		
	}

}
