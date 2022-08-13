package GuilhermeDeOliveiraCavalcanti;

import java.util.ArrayList;
import java.util.Date;

public class MinhaLocadora extends Locadora{

	@Override
	public boolean inserir(Veiculo v) {
		veiculos.add(v);
		return false;
	}

	@Override
	public ArrayList<Veiculo> pesquisarMoto(int cilindrada) {
		ArrayList<Veiculo> motos = new ArrayList<Veiculo>();
		for(Veiculo v : veiculos) {
			if(v instanceof Moto) {
				if(((Moto) v).getCilindrada() == cilindrada) {
					motos.add(v);
				}
			}
		}
		return motos;
	}

	@Override
	public ArrayList<Veiculo> pesquisarCarro(int tipoCarro) {
		ArrayList<Veiculo> carros = new ArrayList<Veiculo>();
		for(Veiculo v : veiculos) {
			if(v instanceof Carro) {
				if(((Carro) v).getCategoria() == tipoCarro) {
					carros.add(v);
				}
			}
		}
		return carros;
	}

	@Override
	public ArrayList<Veiculo> pesquisarCaminhao(int carga) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Veiculo> pesquisarOnibus(int passageiros) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double calcularAluguel(String placa, int dias) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean registrarAluguel(String placa, Date data, int dias, int cpf) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean registrarDevolucao(String placa) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void depreciarVeiculos(int tipo, double taxaDepreciacao) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void aumentarDiaria(int tipo, double taxaAumento) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double faturamentoTotal(int tipo, Date inicio, Date fim) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int quantidadeTotalDeDiarias(int tipo, Date inicio, Date fim) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
