
public class HorasTrabalhadas {

	private float horasTrabalhadas;
	private float valorHora;
	
	
	public HorasTrabalhadas(float horasTrabalhadas, float valorHora) {
		this.horasTrabalhadas = horasTrabalhadas;
		this.valorHora = valorHora;
	}
	
	
	public float getHorasTrabalhadas() {
		return horasTrabalhadas;
	}
	public void setHorasTrabalhadas(float horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}
	public float getValorHora() {
		return valorHora;
	}
	public void setValorHora(float valorHora) {
		this.valorHora = valorHora;
	}
	
	public float salarioMes() {
		return horasTrabalhadas * valorHora;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(" HorasTrabalhadas [horasTrabalhadas=");
		builder.append(horasTrabalhadas);
		builder.append(", valorHora=");
		builder.append(valorHora);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
}
