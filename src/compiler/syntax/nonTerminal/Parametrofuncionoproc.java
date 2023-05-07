package compiler.syntax.nonTerminal;

import java.util.ArrayList;

public class Parametrofuncionoproc extends NonTerminal {

	private ArrayList<String> variables = new ArrayList<String>();
	
	public Parametrofuncionoproc(ArrayList<String> variables) {
		this.variables = variables;
	}

	public ArrayList<String> getVariables() {
		return variables;
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
