package com.classes;

import java.io.FileWriter;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

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
		// TODO Auto-generated method stub
		
	}
}
