package compiler.syntax.nonTerminal;

import compiler.CompilerContext;
import es.uned.lsi.compiler.semantic.ScopeIF;
import es.uned.lsi.compiler.semantic.ScopeManagerIF;
import es.uned.lsi.compiler.semantic.symbol.SymbolIF;
import es.uned.lsi.compiler.semantic.symbol.SymbolTableIF;
import es.uned.lsi.compiler.semantic.type.TypeIF;
import es.uned.lsi.compiler.semantic.type.TypeTableIF;


public class Valorconstante extends NonTerminal {
	private String valor;
	private TypeIF tipo;
	private boolean logica;
	
	public Valorconstante(String valor,TypeIF tipo,boolean logica) {
		this.valor = valor;
		this.tipo = tipo;
		this.logica= logica;
	}
	
	
	public boolean isLogica() {
		return logica;
	}


	public void setLogica(boolean logica) {
		this.logica = logica;
	}


	public String getValor() {
		return valor;
	}
	
	public TypeIF getTipo() {
		return tipo;
	}
	
	public String nameTipo() {
		if (logica) {
			return "booleano";
		}else {return "entero";}
	}
	
	
	public void pruebas() {
		/*ScopeManagerIF scopeManager = CompilerContext.getScopeManager();
		ScopeIF scope =  (ScopeIF) scopeManager.searchScope(valor).getSymbolTable();
		TypeTableIF tablaTipos = scope.getTypeTable();
		SymbolTableIF tablaSim = scopeManager.searchScope(valor).getSymbolTable();*/
		
		
	//scopeManager.searchScope(valor).getScopeManager().containsSymbol(valor)
		
	
	}

}
