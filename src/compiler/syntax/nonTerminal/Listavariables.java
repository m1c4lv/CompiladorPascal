package compiler.syntax.nonTerminal;

import java.util.ArrayList;

public class Listavariables extends NonTerminal {
	
	private ArrayList<String> variables;
	
	public Listavariables() {
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
}
