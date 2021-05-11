import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.List;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.output.XMLOutputter;

public class XML implements Persistencia {

	public void gravar(String caminho,List<Aluno> lista) throws IOException {
		
		Element config = new Element("Alunos");
		
		Document documento = new Document(config);
		
		for (int x = 0; x < lista.size(); x++){
			Element aluno = new Element("aluno");
			
			aluno.setAttribute("matricula", String.valueOf(lista.get(x).getMatricula()));
			
			Element cpf = new Element("cpf");
			cpf.setText(lista.get(x).getCpf());
			
			Element dataNascimento = new Element("DataNascimento");
			dataNascimento.setText(lista.get(x).getDataNascimento());
			
			Element email = new Element("email");
			email.setText(lista.get(x).getEmail());
			
			Element nome = new Element("nome");
			nome.setText(lista.get(x).getNome());
			
			
			aluno.addContent(cpf);
			aluno.addContent(dataNascimento);
			aluno.addContent(email);
			aluno.addContent(nome);
			config.addContent(aluno);			
		}
		
		XMLOutputter xout = new XMLOutputter();
		try {
			System.out.println(caminho);
			BufferedWriter arquivo = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(caminho),"UTF-8"));
			xout.output(documento, arquivo);
			
		}catch (IOException e) {
			e.printStackTrace();
		}
				
	}
}
