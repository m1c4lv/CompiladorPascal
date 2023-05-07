package compiler.syntax.nonTerminal;

import es.uned.lsi.compiler.semantic.type.TypeIF;

public class Expresionlvl2 extends NonTerminal {
	private  TypeIF tipo;
	private String name;
	private boolean logica;
	private boolean entero;
	private int valor;
	
	public Expresionlvl2(String name,TypeIF tipo, boolean logica,boolean entero) {
		this.name = name;
		this.tipo = tipo;
		this.logica=logica;
		this.entero=entero;
	}

	public boolean isEntero() {
		return entero;
	}

	public void setEntero(boolean entero) {
		this.entero = entero;
	}

	public TypeIF getTipo() {
		return tipo;
	}

	public void setTipo(TypeIF tipo) {
		this.tipo = tipo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isLogica() {
		return logica;
	}

	public void setLogica(boolean logica) {
		this.logica = logica;
	}

	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor=valor;
	}
}
