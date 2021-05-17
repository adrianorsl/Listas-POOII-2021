
public enum TiposDeArquivos {
		
	JSON("arquivos/Alunos.json", new Json()), XML("arquivos/Alunos.xml", new XML()), BancoDados("NOME_DO_BANCO", new AlunoBO());
	
	private String caminho;
	private Persistencia persistencia;
	
	private TiposDeArquivos(String caminho, Persistencia persistencia) {
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
