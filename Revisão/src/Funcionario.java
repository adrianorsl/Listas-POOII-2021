
import java.util.Arrays;

public class Funcionario extends Usuario {

	private String nome;
	private String email;
	private float horasTrabalhadas[];
	private float valorHoras[];
	private String dataNascimento;
	private double valorTotal;
	private int n;
	private String sexo;
	private String anoIncio;
	double media;
	
	public Funcionario() {
		super();
	}
	
	public Funcionario(String nome, String email, float horasTrabalhadas[], float valorHoras[], String dataNascimento) {
		super();
		setNome(nome);
		setEmail(email);
		setHorasTrabalhadas(horasTrabalhadas);
		setValorHoras(valorHoras);
		setDataNascimento(dataNascimento);
	}
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome.length() > 0)
			this.nome = nome;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		if (email.length() > 0)
			this.email = email;
	}
	public float[] getHorasTrabalhadas() {
		return horasTrabalhadas;
	}
	public void setHorasTrabalhadas(float[] horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}
	public float[] getValorHoras() {
		return valorHoras;
	}
	public void setValorHoras(float[] valorHoras) {
		this.valorHoras = valorHoras;
	}
	
	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}


	public void setDataNascimento(String dataNascimento) {
			this.dataNascimento = dataNascimento;
	}

	public int getN() {
		return n;
	}

	public void setN(int i) {
		this.n = i;
	}
	
	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		if ((sexo == "m") || (sexo == "f"))	
			this.sexo = sexo;
	}
	
	public String getAnoIncio() {
		return anoIncio;
	}

	public void setAnoIncio(String anoIncio) {
		this.anoIncio = anoIncio;
	}

	public void salarioMes() {
		for (int i=0; i < horasTrabalhadas.length; i++ ) {
			valorTotal = horasTrabalhadas[i] * valorHoras[i];
			media += valorTotal;
			System.out.println("Salário: " + (i+1) + " R$ " + valorTotal);
		}
		System.out.println("Média Salários: " + (media / horasTrabalhadas.length));
		System.out.println("Meses Trabalhados: " + horasTrabalhadas.length);
		int anoTrabalhado = horasTrabalhadas.length % 2 ;
		System.out.println("Anos trabalhados: " + anoTrabalhado);
		int sobraMesesTrab = (horasTrabalhadas.length - (anoTrabalhado * 12));
		System.out.println("Fração (sobra) de Meses Trabalhados: " + sobraMesesTrab);
		System.out.println("Anos e Meses Trabalhados: " + anoTrabalhado + " ano e " + sobraMesesTrab + " meses");
	}
	
	public void maiorSalario() {
		int[] maior = new int[n];
		for (int i=0; i < horasTrabalhadas.length; i++ ) {
			valorTotal = horasTrabalhadas[i] * valorHoras[i];
			for (int z=0; z < n; z++ ) {
				if ((maior[z] < valorTotal)) {
					if ((z + 1) < n) {
						int y = z + 1;
						maior[y] = maior[z];
					}
					maior[z] = (int) valorTotal;
					z = n;
				}
			}
		}
		for (int x=0; x < n; x++ ) {
			System.out.println("Maiores Salários: " + maior[x]);
		}
	}
	
	public void menorSalario() {
		float[] menor = new float[n];
		for (int i=0; i < horasTrabalhadas.length; i++ ) {
			valorTotal = horasTrabalhadas[i] * valorHoras[i];
			for (int z=0; z < n; z++ ) {
				if ((menor[z] > valorTotal) || (menor[z] == 0)) {
					if ((z + 1) < n) {
						int y = z + 1;
						menor[y] = menor[z];
					}
					menor[z] = (float) valorTotal;
					z = n;
				}
			}
		}
		for (int x=0; x < n; x++ ) {
			System.out.println("Menores Salários: " + menor[x]);
		}
	}
	
	public void aposentadoria() {
		String recorteAno = getDataNascimento().substring(6, 10);
		int ano = Integer.parseInt(recorteAno);
		int anoAtual = 2019;
		int inicio = Integer.parseInt(getAnoIncio());
		System.out.println("Ano dos 35 anos de Contribuição: " + (inicio + 35));
		if (sexo == "m") {
			System.out.println("Ano Idade Mínima (65 anos): " + (ano + 65));
		}else if ((sexo == "f")) {
			System.out.println("Ano Idade Mínima (62 anos): " + (ano + 62));
		}
		System.out.println("Ano de Nascimento: " + ano);
		System.out.println("Ano de Aposentadoria: " + (inicio + 35));
		System.out.println("Idade de aposentadoria: " + ((inicio + 35) - ano));
		System.out.println("idade atual: " + (anoAtual - ano));
		if (sexo == "m") {
			System.out.println("Anos Faltantes: " + ((inicio + 35) - anoAtual));
		}else if ((sexo == "f")) {
			System.out.println("Anos Faltantes: " + ((inicio + 35) - anoAtual));
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("Funcionario [nome=");
		builder.append(nome);
		builder.append(", email=");
		builder.append(email);
		builder.append(", horasTrabalhadas=");
		builder.append(Arrays.toString(horasTrabalhadas));
		builder.append(", valorHoras=");
		builder.append(Arrays.toString(valorHoras));
		builder.append(", dataNascimento=");
		builder.append(dataNascimento);
		builder.append("]");
		return builder.toString();
	}
	

	

	
	
}
