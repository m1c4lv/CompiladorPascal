package compiler.syntax.nonTerminal;

public class Selectorvalororeferencia extends NonTerminal {

	private String name;
	
	public Selectorvalororeferencia(String name) {
		this.name=name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
