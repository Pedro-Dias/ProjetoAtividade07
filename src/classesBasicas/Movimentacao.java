package classesBasicas;

import java.util.Date;

public class Movimentacao {
	
	private String codigoMovimentacao;
	private Date dataAtual;
	private int numeroBoletos;
	private double totalValorPago;
	public String getCodigoMovimentacao() {
		return codigoMovimentacao;
	}
	public void setCodigoMovimentacao(String codigoMovimentacao) {
		this.codigoMovimentacao = codigoMovimentacao;
	}
	public Date getDataAtual() {
		return dataAtual;
	}
	public void setDataAtual(Date dataAtual) {
		this.dataAtual = dataAtual;
	}
	public int getNumeroBoletos() {
		return numeroBoletos;
	}
	public void setNumeroBoletos(int numeroBoletos) {
		this.numeroBoletos = numeroBoletos;
	}
	public double getTotalValorPago() {
		return totalValorPago;
	}
	public void setTotalValorPago(double totalValorPago) {
		this.totalValorPago = totalValorPago;
	}
	
	

}
