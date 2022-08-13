package GuilhermeDeOliveiraCavalcanti;

public class Caminhao extends Veiculo{
	private double capacidadeCarga;
	
	@Override
	public double calculaSeguro() {
		double seguro = (valorAvaliacao * 0.08) / 365;
		return seguro;
	}
	
	@Override
	public double calculaAluguel(int quantidadeDias) {
		double aluguel = (valorDiaria + calculaSeguro()) * quantidadeDias;
		return aluguel;
	}
}
