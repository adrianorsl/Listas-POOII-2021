package com.classes;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

public class Json implements Persistencia{

	public void gravar(Aluno aluno) throws Exception {

		GsonBuilder builder = new GsonBuilder();
	    Gson gson = builder.create();
	    FileWriter writer = new FileWriter("arquivos/Alunos.json");
	    writer.write(gson.toJson(aluno));
	    writer.close();
	    System.out.println(gson.toJson(aluno));
	}


	@Override
	public void ler(Aluno aluno) {
		FileReader reader = null;

		try {
			
			

			File arquivo = new File("arquivos/Alunos.json");

			if (arquivo.exists()) {
				try {
					reader = new FileReader(arquivo);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				Gson gson = new Gson();
				String nome = null, cpf = null, dataNascimento = null, email = null;
				int matricula = 0;
				Aluno a = new Aluno(nome, matricula, cpf, dataNascimento , email);
				a = gson.fromJson(reader, new TypeToken<Aluno>() {
				}.getType());
			}

			
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				reader = null;
			}
		}
		
	}
}
