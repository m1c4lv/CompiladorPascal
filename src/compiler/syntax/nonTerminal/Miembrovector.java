package compiler.syntax.nonTerminal;

import es.uned.lsi.compiler.semantic.type.TypeIF;

public class Miembrovector extends NonTerminal {

	private String valor;
	private TypeIF tipo;
	
	public Miembrovector(String valor,TypeIF tipo) {
		this.valor = valor;
		this.tipo = tipo;
	}
	
	
	public String getValor() {
		return valor;
	}
	
	public TypeIF getTipo() {
		return tipo;
	}
	public String nameTipo() {
		if(valor == "NUM") {
			return "ENTERO";
		} else {return "BOOLEAN";}
	}
	
	public int getValorInt() {
		int aux=Integer.parseInt(valor);
		return aux;
	}

}

