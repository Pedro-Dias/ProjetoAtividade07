package classesBasicas;

import java.util.Date;

public class Credito {
	
	private String codigoCredito;
	private String nomeCliente;
	private double valorCredito;
	private Date dataEmissao;
	public String getCodigoCredito() {
		return codigoCredito;
	}
	public void setCodigoCredito(String codigoCredito) {
		this.codigoCredito = codigoCredito;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public double getValorCredito() {
		return valorCredito;
	}
	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}
	public Date getDataEmissao() {
		return dataEmissao;
	}
	public void setDataEmissao(Date dataEmissao) {
		this.dataEmissao = dataEmissao;
	}
	

}
