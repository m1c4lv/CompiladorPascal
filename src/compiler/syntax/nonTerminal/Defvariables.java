package compiler.syntax.nonTerminal;

import java.util.ArrayList;

import es.uned.lsi.compiler.semantic.type.TypeIF;

public class Defvariables extends NonTerminal {
	private ArrayList<String> variables;
	private ArrayList<String> tiposvariables;
	private TypeIF tipo;

	public Defvariables() {
		super();
	}

	public ArrayList<String> getVariables() {
		return variables;
	}

	public void setVariables(ArrayList<String> variables) {
		this.variables = variables;
	}
	
	public int getSize() {
		return variables.size();
	}
	public void addVariable(String variable) {
		if(variables==null) {
			variables = new ArrayList<String>();
		}
		variables.add(variable);
	}
	public String getName(int num) {
		return variables.get(num);
	}
	public TypeIF getTipo() {
		return tipo;
	}

	public void setTipo(TypeIF tipo) {
		this.tipo = tipo;
	}
	public String nameTipo() {
		return tipo.getName();
	}
	public ArrayList<String> getTiposVariables() {
		return tiposvariables;
	}

	public void setTiposVariables(ArrayList<String> tiposvariables) {
		this.tiposvariables = tiposvariables;
	}
	public void addTipoVariable(String variable) {
		if(tiposvariables==null) {
			tiposvariables = new ArrayList<String>();
		}
		tiposvariables.add(variable);
	}
	public String getTipovariable(int num) {
		return tiposvariables.get(num);
	}

}
