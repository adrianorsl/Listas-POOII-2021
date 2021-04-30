import java.util.ArrayList;
import java.util.List;

public class Funcionario extends Usuario  {

	private String nome;
	private String email;
	private String dataNascimento;
	private int x = 1;
	private String anoIncio;
	private int anoAtual;
	private Sexo sexo;
	private List<Float> valorTotal = new ArrayList<Float>();
	private List<Float> maiores = new ArrayList<Float>(2);
	private List<Float> menores = new ArrayList<Float>(2);
	
	List<HorasTrabalhadas> lHorasTrabalhadas = new ArrayList<HorasTrabalhadas>();
	
	
	public boolean addHorasTrabalhadas(HorasTrabalhadas horasTrabalhadas) {
		return lHorasTrabalhadas.add(horasTrabalhadas);
	}
	
	public float media() {
		float media = 0;
		for(int x=0; x < valorTotal.size(); x++) {
			media = media + valorTotal.get(x);
		}
		media = media/2;
		return media;
	}
	
	public List<Float> ValorSalario() {
		float valor = 0;
		for(int i=0; i < lHorasTrabalhadas.size(); i++) {
			valor = lHorasTrabalhadas.get(i).salarioMes();	
			valorTotal.add(valor);
		}
		return valorTotal;
	}

	public List<Float> maiorSalario() {
		for(int i=0; i < valorTotal.size(); i++) {
			float f = valorTotal.get(i);
			if(maiores.isEmpty()) {
				maiores.add(f);
				maiores.add(1, 0f);
			}
			if(f > maiores.get(0)) {
				maiores.set(1, maiores.get(0));
				maiores.set(0, f);
			}else if ((f > maiores.get(1)) && (f != maiores.get(0))) {
				maiores.set(1,f);
			}
		}
		return maiores;
	}
	
	public List<Float> menorSalario() {
		for(int i=0; i < valorTotal.size(); i++) {
			float f = valorTotal.get(i);
			if(menores.isEmpty()) {
				menores.add(f);
				menores.add(1, maiores.get(1));
			}
			if(f < menores.get(0)) {
				menores.set(1, menores.get(0));
				menores.set(0, f);
			}else if ((f < menores.get(1)) && (f != menores.get(0))) {
				menores.set(1,f);
			}
		}
		return menores;
	}
	
	public int mesesTrabalhados() {
		int contador = 0;
		for(int i=0; i < lHorasTrabalhadas.size(); i++) {
			contador ++;
		}
		return contador;
	}
	public int anosTrabalhados() {
		int contador = 0;
		for(int i=0; i < lHorasTrabalhadas.size(); i++) {
			contador ++;
		}
		return contador % 2;
	}
	
	public int sobraTrabalhados() {
		int contador = 0;
		for(int i=0; i < lHorasTrabalhadas.size(); i++) {
			contador ++;
		}
		return (contador - 12);
	}
	
	public int AposentadoriaIdade() {
		String recorteAno = getDataNascimento().substring(6, 10);
		int ano = Integer.parseInt(recorteAno);
		if (sexo == Sexo.F) {
			ano = ano + 62;
		}else if (sexo == Sexo.M) {
			ano = ano + 65;
		}
		return ano;
	}
	
	public int AposentadoriaTempo() {
		int inicio = Integer.parseInt(getAnoIncio());
		return (inicio + 35);
	}
	
	public int idadeAposentadoria() {
		String recorteAno = getDataNascimento().substring(6, 10);
		int ano = Integer.parseInt(recorteAno);
		ano = AposentadoriaTempo() - ano;
		return ano;
	}
	
	public int idadeAtual() {
		String recorteAno = getDataNascimento().substring(6, 10);
		int ano = Integer.parseInt(recorteAno);
		return anoAtual - ano;
	}
	
	public int anosFaltantes() {
		return idadeAposentadoria() - idadeAtual();
	}
	
	public Funcionario(String nome, String email, String dataNascimento) {
		super();
		setNome(nome);
		setEmail(email);
		setDataNascimento(dataNascimento);
	}
	
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public String getAnoIncio() {
		return anoIncio;
	}

	public void setAnoIncio(String anoIncio) {
		this.anoIncio = anoIncio;
	}

	public List<Float> getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(List<Float> valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	public int getAnoAtual() {
		return anoAtual;
	}

	public void setAnoAtual(int anoAtual) {
		this.anoAtual = anoAtual;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("Funcionario [nome=");
		builder.append(nome);
		builder.append(", email=");
		builder.append(email);
		for (HorasTrabalhadas horasTrabalhadas : lHorasTrabalhadas) {
			builder.append(horasTrabalhadas.toString());
		}
		builder.append(" \n " );
		for (Float valor : valorTotal) {
			builder.append("Salário " + x + ": ");
			builder.append(valor.toString());
			builder.append(" \n " );
			x = x + 1;
		}
		builder.append("Média dos Salários= ");
		builder.append(media());
		builder.append(" \n " );
		for (Float f : maiores) {
			builder.append("Maiores Salários: ");
			builder.append(f.toString());
			builder.append(" \n " );
		}
		for (Float f : menores) {
			builder.append("Menores Salários: ");
			builder.append(f.toString());
			builder.append(" \n " );
		}
		builder.append("Meses Trabalhados= ");
		builder.append(mesesTrabalhados());
		builder.append(" \n " );
		builder.append("Anos Trabalhados= ");
		builder.append(anosTrabalhados());
		builder.append(" \n " );
		builder.append("Fração (sobra) de Meses Trabalhados= ");
		builder.append(sobraTrabalhados());
		builder.append(" \n " );
		builder.append("Anos e Meses Trabalhados= ");
		builder.append(anosTrabalhados() + " anos e " + sobraTrabalhados() + " meses" );
		builder.append(" \n " );
		builder.append("Aposentadoria por idade= ");
		builder.append(AposentadoriaIdade());
		builder.append(" \n " );
		builder.append("Ano de aposentadoria por Tempo de contribuição(35anos)= ");
		builder.append(AposentadoriaTempo());
		builder.append(" \n " );
		builder.append("Idade de aposentadoria por Tempo de contribuição(35anos)= ");
		builder.append(idadeAposentadoria());
		builder.append(" \n " );
		builder.append("Idade Atual= ");
		builder.append(idadeAtual());
		builder.append(" \n " );
		builder.append("Anos Faltantes para se aposentar= ");
		builder.append(anosFaltantes());
		builder.append(" \n " );
		 
		
		
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
