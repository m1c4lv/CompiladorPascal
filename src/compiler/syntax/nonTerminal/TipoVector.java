package compiler.syntax.nonTerminal;

import es.uned.lsi.compiler.semantic.type.TypeIF;

public class TipoVector extends NonTerminal {
	private String nombre;
	private TypeIF tipo;
	private String nombreTipo;
	
	public TipoVector(String nombre,TypeIF tipo, String nombreTipo) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.nombreTipo = nombreTipo;
	}

	public String getNombreTipo() {
		return nombreTipo;
	}

	public void setNombreTipo(String nombreTipo) {
		this.nombreTipo = nombreTipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public TypeIF getTipo() {
		return tipo;
	}

	public void setTipo(TypeIF tipo) {
		this.tipo = tipo;
	}
}
