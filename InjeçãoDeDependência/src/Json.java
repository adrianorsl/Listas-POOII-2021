import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Json implements Persistencia {

	public void gravar(List<Aluno> lista) throws Exception {

		GsonBuilder builder = new GsonBuilder();
	    Gson gson = builder.create();
	    FileWriter writer = new FileWriter("arquivos/Alunos.json");
	    writer.write(gson.toJson(lista));
	    writer.close();
	    System.out.println(gson.toJson(lista));
	}

	public void ler(List<Aluno> lista) {
		
	}
	
	
}
