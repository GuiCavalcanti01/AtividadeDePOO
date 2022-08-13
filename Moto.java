package GuilhermeDeOliveiraCavalcanti;

public class Moto extends Veiculo{
	private int cilindrada;
	
	@Override
	public double calculaSeguro() {
		double seguro = (valorAvaliacao * 0.11) / 365;
		return seguro;
	}
	
	@Override
	public double calculaAluguel(int quantidadeDias) {
		double aluguel = (valorDiaria + calculaSeguro()) * quantidadeDias;
		return aluguel;
	}
	
	public int getCilindrada() { return cilindrada; }
}
