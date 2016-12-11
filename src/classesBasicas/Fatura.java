package classesBasicas;

import java.util.Date;

public class Fatura {
	
	private String nomeCliente;
	private String codigoFatura;
	private double valorTotal;
	private Date dataVencimento;
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getCodigoFatura() {
		return codigoFatura;
	}
	public void setCodigoFatura(String codigoFatura) {
		this.codigoFatura = codigoFatura;
	}
	public double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	public Date getDataVencimento() {
		return dataVencimento;
	}
	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
	

}
