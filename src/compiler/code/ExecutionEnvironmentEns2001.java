package compiler.code;

import java.util.Arrays;
import java.util.List;

import compiler.intermediate.Label;
import compiler.intermediate.Temporal;
import compiler.intermediate.Value;
import compiler.intermediate.Variable;
import compiler.semantic.symbol.SymbolVariable;
import compiler.semantic.type.TypeSimple;

import es.uned.lsi.compiler.code.ExecutionEnvironmentIF;
import es.uned.lsi.compiler.code.MemoryDescriptorIF;
import es.uned.lsi.compiler.code.RegisterDescriptorIF;
import es.uned.lsi.compiler.intermediate.OperandIF;
import es.uned.lsi.compiler.intermediate.QuadrupleIF;

/**
 * Class for the ENS2001 Execution environment.
 */

public class ExecutionEnvironmentEns2001 
    implements ExecutionEnvironmentIF
{    
    private final static int      MAX_ADDRESS = 65535; 
    private final static String[] REGISTERS   = {
       ".PC", ".SP", ".SR", ".IX", ".IY", ".A", 
       ".R0", ".R1", ".R2", ".R3", ".R4", 
       ".R5", ".R6", ".R7", ".R8", ".R9"
    };
    
    private RegisterDescriptorIF registerDescriptor;
    private MemoryDescriptorIF   memoryDescriptor;
    
    /**
     * Constructor for ENS2001Environment.
     */
    public ExecutionEnvironmentEns2001 ()
    {       
        super ();
    }
    
    /**
     * Returns the size of the type within the architecture.
     * @return the size of the type within the architecture.
     */
    @Override
    public final int getTypeSize (TypeSimple type)
    {      
        return 1;  
    }
    
    /**
     * Returns the registers.
     * @return the registers.
     */
    @Override
    public final List<String> getRegisters ()
    {
        return Arrays.asList (REGISTERS);
    }
    
    /**
     * Returns the memory size.
     * @return the memory size.
     */
    @Override
    public final int getMemorySize ()
    {
        return MAX_ADDRESS;
    }
           
    /**
     * Returns the registerDescriptor.
     * @return Returns the registerDescriptor.
     */
    @Override
    public final RegisterDescriptorIF getRegisterDescriptor ()
    {
        return registerDescriptor;
    }

    /**
     * Returns the memoryDescriptor.
     * @return Returns the memoryDescriptor.
     */
    @Override
    public final MemoryDescriptorIF getMemoryDescriptor ()
    {
        return memoryDescriptor;
    }

    /**
     * Translate a quadruple into a set of final code instructions. 
     * @param cuadruple The quadruple to be translated.
     * @return a quadruple into a set of final code instructions. 
     */
    @Override
    public final String translate (QuadrupleIF quadruple){      
        //TODO: Student work
    	
    	if(quadruple.getOperation().equalsIgnoreCase("VARGLOBAL")) {
    		StringBuffer b = new StringBuffer();
    		String op1 = operacion(quadruple.getFirstOperand());
    		String op2 = operacion(quadruple.getSecondOperand());
    		String r = operacion(quadruple.getResult());
    		b.append(";"+quadruple.toString()+"\n");
    		b.append("MOVE #0,"+r);
    		return b.toString();
    	}
    	if(quadruple.getOperation().equalsIgnoreCase("CMP")) {
    		StringBuffer b = new StringBuffer();
    		String op1 = operacion(quadruple.getFirstOperand());
    		String r = operacion(quadruple.getResult());
    		b.append(";"+quadruple.toString()+"\n");
    		b.append("CMP"+r+","+op1);//compara el operando 1 y el operando 2
    		return b.toString();
    	}
    	if(quadruple.getOperation().equalsIgnoreCase("AND")) {
    		StringBuffer b = new StringBuffer();
    		String op1 = operacion(quadruple.getFirstOperand());
    		String op2 = operacion(quadruple.getSecondOperand());
    		String r = operacion(quadruple.getResult());
    		b.append(";"+quadruple.toString()+"\n");
    		b.append("AND"+op1+","+op2+"\n");
    		b.append("MOVE"+".A"+","+r);
    		return b.toString();
    	}
    	if(quadruple.getOperation().equalsIgnoreCase("ADD")) {
    		StringBuffer b = new StringBuffer();
    		String op1 = operacion(quadruple.getFirstOperand());
    		String op2 = operacion(quadruple.getSecondOperand());
    		String r = operacion(quadruple.getResult());
    		b.append(";"+quadruple.toString()+"\n");
    		b.append("ADD"+op1+","+op2+"\n");
    		b.append("MOVE"+".A"+","+r);
    		return b.toString();
    	}
    	if(quadruple.getOperation().equalsIgnoreCase("SUBVECTOR")) {
    		StringBuffer b = new StringBuffer();
    		String op1 = operacion(quadruple.getFirstOperand());
    		String op2 = operacion(quadruple.getSecondOperand());
    		String r = operacion(quadruple.getResult());
    		b.append(";"+quadruple.toString()+"\n");
    		b.append("SUB"+op1+","+op2+"\n");
    		b.append("MOVE .A,"+r);
    		return b.toString();
    	}
    	if(quadruple.getOperation().equalsIgnoreCase("CARGARVALOR")) {
    		StringBuffer b = new StringBuffer();
    		String op1 = operacion(quadruple.getFirstOperand());
    		String op2 = operacion(quadruple.getSecondOperand());
    		String r = operacion(quadruple.getResult());
    		b.append(";"+quadruple.toString()+"\n");
    		b.append("SUB"+op1+","+op2+"\n");
    		b.append("MOVE .A,.R1"+"\n");
    		b.append("MOVE[.R1],"+r);
    		return b.toString();
    	}
    	if(quadruple.getOperation().equalsIgnoreCase("SUB")) {
    		StringBuffer b = new StringBuffer();
    		String op1 = operacion(quadruple.getFirstOperand());
    		String op2 = operacion(quadruple.getSecondOperand());
    		String r = operacion(quadruple.getResult());
    		b.append(";"+quadruple.toString()+"\n");
    		b.append("SUB"+op1+","+op2+"\n");
    		b.append("MOVE"+".A"+","+r);
    		return b.toString();
    	}
    	if(quadruple.getOperation().equalsIgnoreCase("MUL")) {
    		StringBuffer b = new StringBuffer();
    		String op1 = operacion(quadruple.getFirstOperand());
    		String op2 = operacion(quadruple.getSecondOperand());
    		String r = operacion(quadruple.getResult());
    		b.append(";"+quadruple.toString()+"\n");
    		b.append("MUL"+op1+","+op2+"\n");
    		b.append("MOVE"+".A"+","+r);
    		return b.toString();
    	}
    	
    	if(quadruple.getOperation().equalsIgnoreCase("MV")) {
    		StringBuffer b = new StringBuffer();
    		String op1 = operacion(quadruple.getFirstOperand());
    		String r = operacion(quadruple.getResult());
    		b.append(";"+quadruple.toString()+"\n");
    		b.append("MOVE"+op1+","+r);
    		return b.toString();
    	}
    	if(quadruple.getOperation().equalsIgnoreCase("MVA")) {
    		StringBuffer b = new StringBuffer();
    		String op1 = operacionMVA(quadruple.getFirstOperand());
    		String r = operacion(quadruple.getResult());
    		b.append(";"+quadruple.toString()+"\n");
    		b.append("MOVE"+op1+","+r);
    		
    		return b.toString();
    	}
    	if(quadruple.getOperation().equalsIgnoreCase("STP")) {
    		StringBuffer b = new StringBuffer();
    		String op1 = operacion(quadruple.getFirstOperand());
    		String r = operacion(quadruple.getResult());
    		b.append(";"+quadruple.toString()+"\n");
    		b.append("MOVE"+r+","+".R1"+"\n");
    		if(op1 == null) {
    			b.append("MOVE"+r+",[.R1]");
    		}else {
    			b.append("MOVE"+op1+",[.R1]");
    		}
    		
    		return b.toString();
    	}
    	if(quadruple.getOperation().equalsIgnoreCase("MVP")) {
    		StringBuffer b = new StringBuffer();
    		String op1 = operacion(quadruple.getFirstOperand());
    		String op2 = operacion(quadruple.getSecondOperand());
    		String r = operacion(quadruple.getResult());
    		b.append(";"+quadruple.toString()+"\n");
    		b.append("MOVE"+op1+","+r);
    		if(op2 != null) {
    			b.append("MOVE"+op2+","+r);
    		}
    		return b.toString();
    	}
    	if(quadruple.getOperation().equalsIgnoreCase("INL")) {
    		StringBuffer b = new StringBuffer();
    		String r = operacion(quadruple.getResult());
    		b.append(";"+quadruple.toString()+"\n");
    		b.append(r+ ": ");
    		return b.toString();
    	}
    	if(quadruple.getOperation().equalsIgnoreCase("BR")) {
    		StringBuffer b = new StringBuffer();
    		String r = operacion(quadruple.getResult());
    		b.append(";"+quadruple.toString()+"\n");
    		b.append("BR /" + r);
    		return b.toString();
    	}
    	if(quadruple.getOperation().equalsIgnoreCase("BZ")) {
    		StringBuffer b = new StringBuffer();
    		String r = operacion(quadruple.getResult());
    		b.append(";"+quadruple.toString()+"\n");
    		b.append("BZ /" + r);
    		return b.toString();
    	}
    	if(quadruple.getOperation().equalsIgnoreCase("BN")) {
    		StringBuffer b = new StringBuffer();
    		String r = operacion(quadruple.getResult());
    		b.append(";"+quadruple.toString()+"\n");
    		b.append("BN /" + r);
    		return b.toString();
    	}
    	if(quadruple.getOperation().equalsIgnoreCase("BRF")) {
    		StringBuffer b = new StringBuffer();
    		String op1 = operacion(quadruple.getFirstOperand());
    		String r = operacion(quadruple.getResult());
    		b.append(";"+quadruple.toString()+"\n");
    		b.append("CMP #1," +r+"\n");
    		b.append("BNZ /"+op1);
    		return b.toString();
    	}
    	if(quadruple.getOperation().equalsIgnoreCase("BRFOR")) {
    		StringBuffer b = new StringBuffer();
    		String op1 = operacion(quadruple.getFirstOperand());
    		String op2 = operacion(quadruple.getSecondOperand());
    		String r = operacion(quadruple.getResult());
    		b.append(";"+quadruple.toString()+"\n");
    		b.append("CMP "+op1+"," +r+"\n");
    		b.append("BZ /"+op2);
    		return b.toString();
    	}
    	if(quadruple.getOperation().equalsIgnoreCase("WRITESTRING")) {
    		StringBuffer b = new StringBuffer();
    		String op = operacion(quadruple.getFirstOperand());
    		b.append(";"+quadruple.toString()+"\n");
    		if(op==null) {
    			b.append("WRCHAR #10"+"\n"); //salto de linea
    			b.append("WRCHAR #13");// retorno de carro
    		}else {
    			b.append("WRSTR /"+op);
    		}
    		
    		return b.toString();
    	}
    	if(quadruple.getOperation().equalsIgnoreCase("WRITEEXP")) {
    		StringBuffer b = new StringBuffer();
    		String op = operacion(quadruple.getResult());
    		b.append(";"+quadruple.toString()+"\n");
    		b.append("WRINT "+op+"\n");
    		b.append("WRCHAR #10"+"\n"); //salto de linea
			b.append("WRCHAR #13");// retorno de carro
    		return b.toString();
    	}
    	if(quadruple.getOperation().equalsIgnoreCase("CADENA")) {
    		StringBuffer b = new StringBuffer();
    		String op1 = operacion(quadruple.getFirstOperand());
    		String r = operacion(quadruple.getResult());
    		b.append(";"+quadruple.toString()+"\n");
    		b.append(op1+":DATA "+r);
    		return b.toString();
    	}
    	if(quadruple.getOperation().equalsIgnoreCase("NOP")) {
    		StringBuffer b = new StringBuffer();
    		b.append(";"+quadruple.toString()+"\n");
    		b.append("NOP");
    		return b.toString();
    	}
    	if(quadruple.getOperation().equalsIgnoreCase("NOT")) {
    		StringBuffer b = new StringBuffer();
    		String r = operacion(quadruple.getResult());
    		b.append(";"+quadruple.toString()+"\n");
    		b.append("NOT"+r);
    		return b.toString();
    	}
    	if(quadruple.getOperation().equalsIgnoreCase("HALT")) {
    		StringBuffer b = new StringBuffer();
    		b.append(";"+quadruple.toString()+"\n");
    		b.append("HALT");
    		return b.toString();
    	}
        return quadruple.toString(); 
    }
    private String operacion(OperandIF op) {
    	if(op instanceof Variable) {
    		return "/"+((Variable)op).getAddress(); 
    	}
    	if(op instanceof Value) {
    		return "#"+((Value)op).getValue();
    	}
    	if(op instanceof Temporal) {
    		return "/"+((Temporal)op).getAddress();
    	}
    	if(op instanceof Label) {
    		return ((Label)op).getName();
    	}
    	return null;
    }
    private String operacionMVA(OperandIF op) {
    	if(op instanceof Variable) {
    		return "#"+((Variable)op).getAddress(); 
    	}
    	if(op instanceof Value) {
    		return "#"+((Value)op).getValue();
    	}
    	if(op instanceof Temporal) {
    		return "#"+((Temporal)op).getAddress();
    	}
    	if(op instanceof Label) {
    		return ((Label)op).getName();
    	}
    	return null;
    }
}
