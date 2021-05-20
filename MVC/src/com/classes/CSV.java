package com.classes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CSV implements Persistencia {
	private final int POS_MATRICULA = 0;
	private final int POS_NOME = 1;
	private final int POS_EMAIL = 2;
	private final int POS_CPF = 3;
	private final int POS_DATA_NASCIMENTO = 4;

	public void gravar(Aluno aluno)  throws IOException {
		FileWriter writer = null;

		try {
			writer = new FileWriter("arquivos/aluno.csv");

			
				String[] info = new String[5];

				info[POS_MATRICULA] = Integer.toString(aluno.getMatricula());
				info[POS_NOME] = aluno.getNome();
				info[POS_EMAIL] = aluno.getEmail();
				info[POS_CPF] = aluno.getCpf();
				info[POS_DATA_NASCIMENTO] = aluno.getDataNascimento();

				writer.write(String.join(";", info) + "\n");
			
		} finally {
			if (writer != null) {
				writer.close();
				writer = null;
			}
		}
	}


	@Override
	public void ler(Aluno aluno) {
		BufferedReader reader = null;

		try {
			

			File arquivo = new File("arquivos/agenda.csv");

			if (arquivo.exists()) {
				try {
					reader = new BufferedReader(new FileReader(arquivo));
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				String linha;

				try {
					while ((linha = reader.readLine()) != null) {
						if (linha.isEmpty())
							continue;

						String[] info = linha.split(";");
						String nome = null, cpf = null, dataNascimento = null, email = null;
						int matricula = 0;
						Aluno a = new Aluno(nome, matricula, cpf, dataNascimento , email);

						a.setMatricula(Integer.parseInt(info[POS_MATRICULA]));
						a.setNome(info[POS_NOME]);
						a.setEmail(info[POS_EMAIL]);
						a.setCpf(info[POS_CPF]);
						a.setDataNascimento(info[POS_DATA_NASCIMENTO]);

						
					}
				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
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