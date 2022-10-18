package her;

public class Caminhao extends Veiculo {
	protected int eixos;
	
	public int getEixos() {
		return eixos;
	}


	public void setEixos(int eixos) {
		this.eixos = eixos;
	}
	public Caminhao(String placa,int ano,int eixos) {
		placa=super.getPlaca();
		ano=super.getAno();
		eixos=this.eixos;
	}
	@Override
	void exibirDados(String placa, int ano) {
		System.out.print("\nVeiculo=Caminhao Placa= ");
		System.out.print(getPlaca());
		System.out.print(" Ano= ");
		System.out.print(getAno());
		System.out.print(" Eixos= ");
		System.out.print(getEixos());	
	}
		
		
	
}
