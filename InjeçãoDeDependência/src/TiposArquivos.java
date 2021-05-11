
public enum TiposArquivos {
	JSON("arquivos/Alunos.json", new Json());
	
	private String caminho;
	private Persistencia persistencia;
	
	private TiposArquivos(String caminho, Persistencia persistencia) {
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
