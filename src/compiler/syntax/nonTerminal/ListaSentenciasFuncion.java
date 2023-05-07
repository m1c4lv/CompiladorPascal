package compiler.syntax.nonTerminal;

import java.util.ArrayList;

import es.uned.lsi.compiler.semantic.type.TypeIF;

public class ListaSentenciasFuncion extends NonTerminal {
	private ArrayList<Boolean> contieneReturn;
	private ArrayList<String> contieneNombre;
	private ArrayList<TypeIF> contieneTipo;
	private boolean contieneLista;
	
	public ListaSentenciasFuncion( boolean contieneLista){
		this.contieneLista=contieneLista;
	}

	public ArrayList<String> isNombre() {
		return contieneNombre;
	}

	public void setisNombre(String nombre) {
		if(contieneNombre==null) {
			contieneNombre = new ArrayList<String>();
		}
		contieneNombre.add(nombre);
	}
	
	public ArrayList<TypeIF> isTipo() {
		return contieneTipo;
	}

	public void setisTipo(TypeIF tipo) {
		if(contieneTipo==null) {
			contieneTipo = new ArrayList<TypeIF>();
		}
		contieneTipo.add(tipo);
	}
	
	public boolean isReturn() {
		for(int i=0;i<contieneReturn.size();i++) {
			if(contieneReturn.get(i)) {
				return true;
			}	
		}
		return false;
	}

	public void setisReturn(boolean contiene) {
		if(contieneReturn==null) {
			contieneReturn = new ArrayList<Boolean>();
		}
		contieneReturn.add(contiene);
	}
	public boolean coincideTipo(String tipo) {
		if(contieneTipo!= null || !contieneTipo.isEmpty()) {
			System.out.println(contieneTipo);
			for(int i=0;i<contieneTipo.size();i++) {
				if(contieneTipo.get(i)!=null && contieneTipo.get(i).getName().equalsIgnoreCase(tipo)) {
					return true;
				}	
			}
			return false;
		}else {return false;}
	}
	
}
