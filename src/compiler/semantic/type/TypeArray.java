package compiler.semantic.type;


import es.uned.lsi.compiler.semantic.ScopeIF;
import es.uned.lsi.compiler.semantic.type.TypeBase;

/**
 * Class for TypeArray.
 */

// TODO: Student work
//       Include properties to characterize array type

public class TypeArray extends TypeBase{   
   private int dimension;
   private int rangoinicio;
   private int rangofinal;
   private String tipoArray;
	/**
     * Constructor for TypeArray.
     * @param scope The declaration scope.
     */
    public TypeArray (ScopeIF scope)
    {
        super (scope);
    }

    /**
     * Constructor for TypeArray.
     * @param scope The declaration scope.
     * @param name The name of the type.
     */
    public TypeArray (ScopeIF scope, String name)
    {
        super (scope, name);
    }
     

	public void setDimension(int di) {
		dimension=di;
	}
	public int getRangoinicio() {
		return rangoinicio;
	}

	public void setRangoinicio(int rangoinicio) {
		this.rangoinicio = rangoinicio;
	}

	public int getRangofinal() {
		return rangofinal;
	}

	public void setRangofinal(int rangofinal) {
		this.rangofinal = rangofinal;
	}

	public int getDimension() {
		return dimension;
	}

	public String getTipoArray() {
		return tipoArray;
	}

	public void setTipoArray(String tipoArray) {
		this.tipoArray = tipoArray;
	}
	public int getSize() {
		return dimension;
	}
    
}
