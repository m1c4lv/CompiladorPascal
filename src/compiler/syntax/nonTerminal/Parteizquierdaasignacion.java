package compiler.syntax.nonTerminal;

import es.uned.lsi.compiler.semantic.type.TypeIF;

public class Parteizquierdaasignacion extends NonTerminal {

	private String name;
	private TypeIF tipo;
		
	


	public Parteizquierdaasignacion(String name,TypeIF tipo) {
		this.name = name;
		this.tipo = tipo;
	}
		
		
	public String getName() {
		return name;
	}
		
	public TypeIF getTipo() {
		return tipo;
	}
	public String getNameTipo() {
		return tipo.toString();
	}




}
