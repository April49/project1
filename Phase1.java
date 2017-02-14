package edu.uiowa.cs;

import com.sun.javafx.UnmodifiableArrayList;
import com.sun.org.apache.bcel.internal.generic.Instruction;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Phase1{

        /* Translates the MAL instruction to 1-3 TAL instructions
     * and returns the TAL instructions in a list
     *
     * mals: input program as a list of Instruction objects
     *
     * returns a list of TAL instructions (should be same size or longer than input list)
     */
    private static List<Instruction> mals;


    public static List<Instruction> mal_to_tal(List<Instruction> mals) {
        if (mals.get(0)==1&&mals.get(4)<=16){
        	return mals;//addiu-tal instruction

        }
        if(mals.get(0)==1&&mals.get(4)>=16){//addiu-mal instruction
        /*set lui $at,upper
        ori $at,$at, Lower 16 bit immediate
        addu rt,rs,$at
        */
      	mals.set(index, element)
        return mals;

        }
        if(mals.get(0)==2){//addu instruction
        return mals;
        }
        if(mals.get(0)==3){//or instruction
        return mals;
        }
        if(mals.get(0)=5){//beq instruction
        	
        }
        if(mals.get(0)=6){//bne instruction
        mals.set(index, element)
        return mals;
        }
        if(mals.get(0)==8){//slt instruction
        mals.set(index, element)
        return mals;
        }
        if(mals.get(0)==9){//lui instruction
        mals.set(index, element)
        }
        if(mals.get(0)==10){//ori instruction
        mals.set(index, element)
        }
        if(mals.get(0)==100){//blt
       	/* slt $at,rs,rt
       	 * bne $at,zero,labelx
       	 */
        	
        }
        mals.set(index, element)	
        }
        if(mals.get(0)=101){//bge instuction
        /*
         * slt $at,rs,rt
         * beq $at,$zero, labelx
         */
        mals.set(index, element)	
        }
        



}
