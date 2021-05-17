
public enum TiposArquivos {
	JSON(new Json()), XML(new XML());
	
	private Persistencia persistencia;
	
	private TiposArquivos(Persistencia persistencia) {
		this.persistencia = persistencia;
	}

	public Persistencia getPersistencia() {
		return persistencia;
	}
}
