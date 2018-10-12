package VO;

import java.util.Date;

public class RelatorioVendasVO {
	
	private int congelados;
	public int getCongelados() {
		return congelados;
	}
	public void setCongelados(int congelados) {
		this.congelados = congelados;
	}
	public int getResfriados() {
		return resfriados;
	}
	public void setResfriados(int resfriados) {
		this.resfriados = resfriados;
	}
	public int getTemperados() {
		return temperados;
	}
	public void setTemperados(int temperados) {
		this.temperados = temperados;
	}
	public int getTotalFrangos() {
		return totalFrangos;
	}
	public void setTotalFrangos(int totalFrangos) {
		this.totalFrangos = totalFrangos;
	}
	private int resfriados;
	private int temperados;
	private int totalFrangos;
	private Date dataInicio;
	public Date getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}
	public Date getDataFinal() {
		return dataFinal;
	}
	public void setDataFinal(Date dataFinal) {
		this.dataFinal = dataFinal;
	}
	private Date dataFinal;
	

}
