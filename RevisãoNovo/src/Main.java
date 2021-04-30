
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Funcionario func = new Funcionario("Rodrigo", "rodrigo.curvello@ifc.edu.br", "24/04/1978");
		func.setSexo(Sexo.M);
		
		
		HorasTrabalhadas h1 = new HorasTrabalhadas(1,100.33f);
		HorasTrabalhadas h2 = new HorasTrabalhadas(200,20000);
		HorasTrabalhadas h3 = new HorasTrabalhadas(30,300);
		HorasTrabalhadas h4 = new HorasTrabalhadas(400,40000);
		HorasTrabalhadas h5 = new HorasTrabalhadas(50,500);
		HorasTrabalhadas h6 = new HorasTrabalhadas(60,100.33f);
		HorasTrabalhadas h7 = new HorasTrabalhadas(700,20000);
		HorasTrabalhadas h8 = new HorasTrabalhadas(80,300);
		HorasTrabalhadas h9 = new HorasTrabalhadas(900,40000);
		HorasTrabalhadas h10 = new HorasTrabalhadas(10,500);
		HorasTrabalhadas h11 = new HorasTrabalhadas(11,100.33f);
		HorasTrabalhadas h12 = new HorasTrabalhadas(12,20000);
		HorasTrabalhadas h13 = new HorasTrabalhadas(13,300);
		HorasTrabalhadas h14 = new HorasTrabalhadas(14,40000);
		HorasTrabalhadas h15 = new HorasTrabalhadas(15,500);
		HorasTrabalhadas h16 = new HorasTrabalhadas(16,500);
		HorasTrabalhadas h17 = new HorasTrabalhadas(17,500);
		HorasTrabalhadas h18 = new HorasTrabalhadas(18,500);
		HorasTrabalhadas h19 = new HorasTrabalhadas(18,500);
		
		
		func.addHorasTrabalhadas(h1);
		func.addHorasTrabalhadas(h2);
		func.addHorasTrabalhadas(h3);
		func.addHorasTrabalhadas(h4);
		func.addHorasTrabalhadas(h5);
		func.addHorasTrabalhadas(h6);
		func.addHorasTrabalhadas(h7);
		func.addHorasTrabalhadas(h8);
		func.addHorasTrabalhadas(h9);
		func.addHorasTrabalhadas(h10);
		func.addHorasTrabalhadas(h11);
		func.addHorasTrabalhadas(h12);
		func.addHorasTrabalhadas(h13);
		func.addHorasTrabalhadas(h14);
		func.addHorasTrabalhadas(h15);
		func.addHorasTrabalhadas(h16);
		func.addHorasTrabalhadas(h17);
		func.addHorasTrabalhadas(h18);
		func.addHorasTrabalhadas(h19);
		func.setAnoIncio("2018");
		func.setAnoAtual(2019);
		func.ValorSalario();
		func.media();
		func.maiorSalario();
		func.menorSalario();
	
		func.setUsuario("rodrigo");
		func.setSenha("123456");
		func.pass();
		
		System.out.println(func);
	}

}
