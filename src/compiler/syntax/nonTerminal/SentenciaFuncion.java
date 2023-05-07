package compiler.syntax.nonTerminal;

import es.uned.lsi.compiler.semantic.type.TypeIF;

public class SentenciaFuncion extends NonTerminal {
	private  TypeIF tipo;
	private String name;
	private boolean contieneReturn;
	
	public SentenciaFuncion(String name,TypeIF tipo, boolean contieneReturn){
		this.name = name;
		this.tipo = tipo;
		this.contieneReturn=contieneReturn;
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
	
	public boolean isReturn() {
		return contieneReturn;
	}

	public void setisReturn(boolean contieneReturn) {
		this.contieneReturn = contieneReturn;
	}
	
}
