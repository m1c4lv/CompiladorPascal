package compiler.syntax.nonTerminal;

import es.uned.lsi.compiler.semantic.type.TypeIF;

public class Parametroasignacion extends NonTerminal {
	private String nombre;
	private TypeIF tipo;
	private int valor;
	private boolean logica;
	private boolean entero;
		
	public Parametroasignacion(String nombre,TypeIF tipo, int valor,boolean logica,boolean entero) {
		this.nombre=nombre;
		this.tipo = tipo;
		this.valor = valor;
		this.logica=logica;
		this.entero=entero;
	}
		
		
	public boolean isLogica() {
		return logica;
	}


	public void setLogica(boolean logica) {
		this.logica = logica;
	}


	public boolean isEntero() {
		return entero;
	}


	public void setEntero(boolean entero) {
		this.entero = entero;
	}


	public int getValor() {
		return valor;
	}
		
	public TypeIF getTipo() {
		return tipo;
	}
	public String nameTipo() {
		return tipo.toString();
	}
		
	public void setValor(int valor) {
		this.valor=valor;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
