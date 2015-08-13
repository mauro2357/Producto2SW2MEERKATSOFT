package com.techandsolve.tuflujo.domain;

public class Presupuesto {

	private Cliente cliente;
	private Integer valor;

	public Integer getValor() {
		return valor;
	}

	public void setValor(Integer valor) {
		this.valor = valor;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void presupuestar() {
		valor=1160000;
	}

}
