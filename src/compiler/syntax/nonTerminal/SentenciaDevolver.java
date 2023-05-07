package compiler.syntax.nonTerminal;

import compiler.syntax.nonTerminal.NonTerminal;
import es.uned.lsi.compiler.semantic.type.TypeIF;;

public class SentenciaDevolver extends NonTerminal {
	private  TypeIF tipo;
	private String name;
	
	public SentenciaDevolver(String name,TypeIF tipo) {
		this.name = name;
		this.tipo = tipo;
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
	
}
