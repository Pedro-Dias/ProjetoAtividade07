package classesBasicas;

import java.util.Date;

public class Pagamento {
	
	private String codigoPagamento;
	private double valorPago;
	private Date dataPagamento;
	private String tipoPagamento;
	public String getCodigoPagamento() {
		return codigoPagamento;
	}
	public void setCodigoPagamento(String codigoPagamento) {
		this.codigoPagamento = codigoPagamento;
	}
	public double getValorPago() {
		return valorPago;
	}
	public void setValorPago(double valorPago) {
		this.valorPago = valorPago;
	}
	public Date getDataPagamento() {
		return dataPagamento;
	}
	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}
	public String getTipoPagamento() {
		return tipoPagamento;
	}
	public void setTipoPagamento(String tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
	}
	

}
