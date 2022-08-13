package GuilhermeDeOliveiraCavalcanti;

public abstract class Veiculo {
	protected String marca;
	protected String modelo;
	protected int ano;
	protected String placa;
	protected double valorDiaria;
	protected double valorAvaliacao;
	
	public abstract double calculaSeguro();
	public abstract double calculaAluguel(int quantidadeDias);
}
