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
	
	final static String NOMEDOARQUIVO = "alunos";
	final static String LOCALHOST = "arquivos/";

public void gravar(Aluno aluno) throws IOException {
		
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
			System.out.println(NOMEDOARQUIVO );
			BufferedWriter arquivo = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(LOCALHOST +  NOMEDOARQUIVO + ".xml"),"UTF-8"));
			xout.output(documento, arquivo);
			
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	

	@Override
	public void ler(Aluno aluno) {
		// TODO Auto-generated method stub
		
	}
	}

