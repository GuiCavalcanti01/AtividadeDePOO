package GuilhermeDeOliveiraCavalcanti;

public class Onibus extends Veiculo{
	private int capacidadePassageiros;
	
	@Override
	public double calculaSeguro() {
		double seguro = (valorAvaliacao * 0.2) / 365;
		return seguro;
	}	
	
	@Override
	public double calculaAluguel(int quantidadeDias) {
		double aluguel = (valorDiaria + calculaSeguro()) * quantidadeDias;
		return aluguel;
	}
}
