package GuilhermeDeOliveiraCavalcanti;

public class Carro extends Veiculo{
	private int categoria;
	
	@Override
	public double calculaSeguro() {
		double seguro = (valorAvaliacao * 0.03) / 365;
		return seguro;
	}
	
	@Override
	public double calculaAluguel(int quantidadeDias) {
		double aluguel = (valorDiaria + calculaSeguro()) * quantidadeDias;
		return aluguel;
	}

	public int getCategoria() { return categoria; }
}
