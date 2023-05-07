package compiler.syntax.nonTerminal;

import es.uned.lsi.compiler.semantic.type.TypeIF;

public class TipoVariable extends NonTerminal {

	private String valor;
	private TypeIF tipo;
	private boolean logica;
	
	public TipoVariable(String valor,TypeIF tipo,boolean logica) {
		this.valor = valor;
		this.tipo = tipo;
		this.logica=logica;
	}
	
	
	public boolean isLogica() {
		return logica;
	}


	public void setLogica(boolean logica) {
		this.logica = logica;
	}


	public String getValor() {
		return valor;
	}
	
	public TypeIF getTipo() {
		return tipo;
	}
	public String nameTipo() {
		return tipo.getName();
	}
	
	public int getValorInt() {
		int aux=Integer.parseInt(valor);
		return aux;
	}
}
