package locadora;

public class loja {

	public static void main(String[] args) {
		
		Veiculo monzaAzul = new Veiculo("ABC-0000", "Carro");
		Veiculo cgzinha = new Veiculo("QWE-0011", "Moto");
		Veiculo hakusho = new Veiculo("HKS-2020", "Moto");
		
		System.out.println(monzaAzul.getTipo());
		System.out.println(cgzinha.getPlaca());
	}

}
