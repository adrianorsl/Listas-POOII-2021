package com.classes;

import java.io.FileWriter;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Json {

	public void gravar(String caminho, List<Aluno> lista) throws Exception {

		GsonBuilder builder = new GsonBuilder();
	    Gson gson = builder.create();
	    FileWriter writer = new FileWriter(caminho);
	    writer.write(gson.toJson(lista));
	    writer.close();
	    System.out.println(gson.toJson(lista));
	}

	public void ler(String caminho, List<Aluno> lista) {
		
	}
}
