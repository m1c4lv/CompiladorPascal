package compiler.semantic.symbol;

import java.util.ArrayList;

import es.uned.lsi.compiler.semantic.ScopeIF;
import es.uned.lsi.compiler.semantic.symbol.SymbolBase;
import es.uned.lsi.compiler.semantic.type.TypeIF;

/**
 * Class for SymbolProcedure.
 */

// TODO: Student work
//       Include properties to characterize procedure calls

public class SymbolProcedure extends SymbolBase{
	private String retorno;
	private ArrayList<String> variables;
	private ArrayList<String> tipoVariables;
    /**
     * Constructor for SymbolProcedure.
     * @param scope The declaration scope.
     * @param name The symbol name.
     * @param type The symbol type.
     */
    public SymbolProcedure (ScopeIF scope,  String name, TypeIF type){//Tipo es el tipo de retorno
        super (scope, name, type);
    }
    public String getRetorno() {
		return retorno;
	}
	public void setRetorno(String retorno) {
		this.retorno = retorno;
	}

	public ArrayList<String> getVariables() {
		return variables;
	}

	public void setVariables(ArrayList<String> variables) {
		this.variables = variables;
	}
	public ArrayList<String> getTipovariables() {
		return tipoVariables;
	}

	public void setTipovariables(ArrayList<String> tipoVariables) {
		this.tipoVariables = tipoVariables;
	}
	public String getNameVariable(int num) {
		return variables.get(num);
	}
	public String getNameTipoVariable(int num) {
		return tipoVariables.get(num);
	}
	public int getSizeVariable() {
		return variables.size();
	}
    
}
