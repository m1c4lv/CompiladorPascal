package compiler.semantic.symbol;

import es.uned.lsi.compiler.semantic.ScopeIF;
import es.uned.lsi.compiler.semantic.symbol.SymbolBase;
import es.uned.lsi.compiler.semantic.type.TypeIF;

/**
 * Class for SymbolVariable.
 */

// TODO: Student work
//       Include properties to characterize variables

public class SymbolVariable extends SymbolBase{  
	
	private int valor; 
	private boolean logico;
	private int direccion;

	

	/**
     * Constructor for SymbolVariable.
     * @param scope The declaration scope.
     * @param name The symbol name.
     * @param type The symbol type.
     */
    public SymbolVariable (ScopeIF scope, String name,TypeIF type){
        super (scope, name, type);
    } 
    
    public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	public boolean isLogico() {
		return logico;
	}

	public void setLogico(String opcion) {
		if (opcion=="CIERTO") {
			logico=true;
		}
		if (opcion=="FALSO") {
			logico=false;
		}
	}
	public void setDireccion(int aux) {
		this.direccion=aux;
	}
	public int getDireccion() {
		return this.direccion;
	}
}
