package locadora;

public class Veiculo {
	private String placa;
	private String tipo;
	
	public String getTipo() {
		return this.tipo;
	}
	public String getPlaca() {
		return this.placa;
	}
	public Veiculo(String placa, String tipo) {
		this.placa = placa;
		this.tipo = tipo;
	}
}
