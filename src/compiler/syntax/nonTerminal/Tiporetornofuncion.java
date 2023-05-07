package compiler.syntax.nonTerminal;

public class Tiporetornofuncion extends NonTerminal {

	private String name;
	
	public Tiporetornofuncion(String name) {
		this.name=name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
