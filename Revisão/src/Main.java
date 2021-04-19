import java.math.BigInteger;
import java.security.MessageDigest;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class Main {

	public static void main(String[] args) throws ParseException {
		

		float horasTrab[] = {1,200,30,400,50,60,700,80,900,10,11,12,13,14,15,16,17,18,18};
		float valor[] = {100.33f,20000,300,40000,500,100.33f,20000,300,40000,500,100.33f,20000,300,40000,500,500,500,500,500};
	
		
		
		Funcionario func = new Funcionario("Adriano", "adrianorslsc@hotmail.com", horasTrab , valor, "24/04/1978");
		// ano que iniciou a trabalhar
		func.setAnoIncio("2018");
		System.out.println(func);
		// Sexo m = masculino e f para feminino
		func.setSexo("m");
		// calculo dos salários
		func.salarioMes();
		// n salários
		func.setN(2);
		func.maiorSalario();
		func.menorSalario();
		func.aposentadoria();
		
		func.setUsuario("rodrigo");
		func.setSenha("123456");
		func.pass();

		
		

	}

}
