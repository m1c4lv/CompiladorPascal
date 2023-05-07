package compiler.syntax.nonTerminal;

public class RellenoifFuncion extends NonTerminal {

	private boolean contieneReturn;
	
	public RellenoifFuncion(boolean contieneReturn){
		this.contieneReturn=contieneReturn;
	}

	public boolean isReturn() {
		return contieneReturn;
	}

	public void setisReturn(boolean contieneReturn) {
		this.contieneReturn = contieneReturn;
	}
}
