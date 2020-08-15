package locadora;

public class Pessoa {
	private String nome;
	private String habilitacao;
	
	public void alugarVeiculo(Veiculo vel) {
		if((this.habilitacao == "B" ||this.habilitacao == "AB") 
				&& vel.getTipo()== "Carro") {
			System.out.println(this.nome+" alugou o veiculo tipo"+vel.getTipo()+vel.getPlaca());
		}else {
			if((this.habilitacao == "A" ||this.habilitacao == "AB") 
					&& vel.getTipo()== "Moto") {
				System.out.println(this.nome+" alugou o veiculo tipo"+vel.getTipo()+vel.getPlaca());
			
			
			
			}else{
				System.out.println("Este veiculo nao pode ser alugado");
		}
	}
}
	public String getNome() {
		return this.nome;
	}
	
	public String gethabilitacao() {
		return this.habilitacao;
	}
	
	Pessoa(String nome, String habilitacao){
		this.nome = nome;
		this.habilitacao = habilitacao;
		
	}
}
