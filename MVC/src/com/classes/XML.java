package com.classes;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;
import org.jdom.output.XMLOutputter;

public class XML implements Persistencia{

public void gravar(String caminho, Aluno aluno) throws IOException {
		
		Element config = new Element("Alunos");
		
		Document documento = new Document(config);
		
		
			Element alunos = new Element("aluno");
			
			alunos.setAttribute("matricula", String.valueOf(aluno.getMatricula()));
			
			Element cpf = new Element("cpf");
			cpf.setText(aluno.getCpf());
			
			Element dataNascimento = new Element("DataNascimento");
			dataNascimento.setText(aluno.getDataNascimento());
			
			Element email = new Element("email");
			email.setText(aluno.getEmail());
			
			Element nome = new Element("nome");
			nome.setText(aluno.getNome());
			
			
			alunos.addContent(cpf);
			alunos.addContent(dataNascimento);
			alunos.addContent(email);
			alunos.addContent(nome);
			config.addContent(alunos);			
		
		
		XMLOutputter xout = new XMLOutputter();
		try {
			System.out.println(caminho);
			BufferedWriter arquivo = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(caminho),"UTF-8"));
			xout.output(documento, arquivo);
			
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	
	public void ler(String caminho, Aluno aluno) {
		
		
		
	
			
		}
	}

