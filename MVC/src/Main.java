

import java.util.ArrayList;
import java.util.List;

import com.classes.Aluno;
import com.classes.AlunoBO;
import com.classes.AlunoDAO;
import com.classes.Persistencia;


import Enum.Tipos;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		final Tipos tipo = Tipos.XML;
		Persistencia p = tipo.getPersistencia();
		AlunoBO alunoBO = new AlunoBO();
		
		Aluno aluno = new Aluno("Adriano", 35201, "01010101011", "15/10/1988", "adrianorslsc@hotmail.com");
		p.gravar(aluno);
		if (tipo == Tipos.BD) {
			if(alunoBO.inserir(aluno)) {
				System.out.println("Inserido com sucesso");
			}else {
				System.out.println("Erro ao Inserir");
			}
		}
		
		aluno = new Aluno("Jamile", 35214, "02020202021", "28/02/1998", "Jamile@homail.com");
		p.gravar(aluno);
		if (tipo == Tipos.BD) {
			if(alunoBO.inserir(aluno)) {
				System.out.println("Inserido com sucesso");
			}else {
				System.out.println("Erro ao Inserir");
			}
		}
		aluno = new Aluno("Cristiano", 35255, "02030303030", "09/07/1985", "cristiano@homail.com");
		p.gravar(aluno);
		if (tipo == Tipos.BD) {
			if(alunoBO.inserir(aluno)) {
				System.out.println("Inserido com sucesso");
			}else {
				System.out.println("Erro ao Inserir");
			}
		}
		
		
		aluno = new Aluno("Cristiano", 35255, "02030303030", "09/07/1986", "cristiano@homail.com");
		
		AlunoBO.alterar(aluno);
		aluno = alunoBO.procurarPorCpf(aluno);
		System.out.println(aluno);
		

		aluno = new Aluno("Adriano", 35201, "01010101011", "15/10/1988", "adrianorslsc@hotmail.com");
		if (AlunoBO.existe(aluno))
			System.out.println("Aluno Encontrado");
		else
			System.out.println("Nao Encontrado");
		
		

	    //p.ler(caminho, aluno);
	    

		
		
		
		
		
		
	
	}
}
