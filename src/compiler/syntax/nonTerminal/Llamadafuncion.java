package compiler.syntax.nonTerminal;

import es.uned.lsi.compiler.semantic.type.TypeIF;

public class Llamadafuncion extends NonTerminal {
	private String nombre;
	private TypeIF tipo;
	private TypeIF tiporetorno;
	
	public Llamadafuncion(String nombre,TypeIF tipo) {
		this.nombre = nombre;
		this.tipo = tipo;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public TypeIF getTipo() {
		return tipo;
	}

	public TypeIF getTiporetorno() {
		return tiporetorno;
	}

	public void setTiporetorno(TypeIF tiporetorno) {
		this.tiporetorno = tiporetorno;
	}
	
}

