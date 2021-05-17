package Enum;
import com.classes.Persistencia;
import com.classes.Json;
import com.classes.XML;
import com.classes.AlunoBO;

public enum Tipos  {

	JSON ("arquivos/Alunos.json", new Json()), 
	XML ("arquivos/Alunos.xml", new XML()),
	BD ("Aluno", new AlunoBO());
	
	private  String caminho;
	private Persistencia persistencia;
	
	private Tipos(String caminho, Persistencia persistencia) {
		this.caminho = caminho;
		this.persistencia = persistencia;
	}

	

	public String getCaminho() {
		return caminho;
	}

	public Persistencia getPersistencia() {
		return persistencia;
	}
}
