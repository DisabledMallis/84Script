package com.efscript.script.blocks;

import java.util.ArrayList;

import com.efscript.Logger;
import com.efscript.script.IBlock;
import com.efscript.ti.TiCompiler;
import com.efscript.ti.TiToken;

public class EFSVarToken implements IBlock {

	// Vars & Func blocks and other shit
	public static ArrayList<String> varIdentifiers = new ArrayList<>();

	/*
	 * Funcs for managing vars and creating references to them
	 */
	public static void addVar(String var) {
		for (String ident : varIdentifiers) {
			if (var.equals(ident)) {
				Logger.Log("Identifier " + var + " is already defined!");
			}
		}
		varIdentifiers.add(var);
	}

	public static int getVarIndex(String var) {
		int current = 0;
		for (String ident : varIdentifiers) {
			if (ident.equals(var)) {
				return current;
			}
			current++;
		}
		Logger.Log("Could not find var \"" + var + "\"");
		return -1;
	}

	private int refIndex;

	public EFSVarToken(String identifier) {
		this.refIndex = getVarIndex(identifier);
	}

	@Override
	public TiToken[] compile() {
		TiCompiler comp = new TiCompiler();
		comp.appendInstruction(TiToken.LIST);
		comp.appendInstruction(TiToken.LIST_SUBSCRIPT_1);
		comp.appendInstruction(TiToken.OPEN_BRACKET);
		comp.appendInstruction(TiToken.getNumber(refIndex));
		comp.appendInstruction(TiToken.CLOSE_BRACKET);
		return comp.getTokens();
	}

}
