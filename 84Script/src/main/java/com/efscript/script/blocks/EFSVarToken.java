package com.efscript.script.blocks;

import com.efscript.script.CompilerAccessor;
import com.efscript.script.IBlock;
import com.efscript.ti.TiCompiler;
import com.efscript.ti.TiToken;

public class EFSVarToken extends CompilerAccessor implements IBlock {

	private String identifier;
	private int refIndex;

	public EFSVarToken(String identifier) {
		this.identifier = identifier;
		this.refIndex = this.currentCompiler().getVarIndex(identifier);
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
