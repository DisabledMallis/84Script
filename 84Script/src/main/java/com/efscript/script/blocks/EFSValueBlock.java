package com.efscript.script.blocks;

import com.efscript.antlr.EFScriptParser.IdentifierContext;
import com.efscript.antlr.EFScriptParser.NumberContext;
import com.efscript.antlr.EFScriptParser.ValueContext;
import com.efscript.script.ABlock;
import com.efscript.script.Context;
import com.efscript.ti.TiCompiler;
import com.efscript.ti.TiToken;

import org.antlr.v4.runtime.tree.TerminalNode;

public class EFSValueBlock extends ABlock<ValueContext> {
	public EFSValueBlock(ValueContext ctx) {
		super(ctx);
	}

	@Override
	public TiToken[] compile() throws Exception {
		TiCompiler compiler = new TiCompiler();

		ValueContext vctx = this.getCtx();
		// Values can be either an identifier
		// or a number. Identifiers must be values
		// and not function names.
		boolean isIdentifier = vctx.identifier() != null;
		boolean isNumber = vctx.number() != null;

		if (isIdentifier) {
			// Get the identifier context
			IdentifierContext ictx = vctx.identifier();
			// Get a var token for the identifier
			TiToken[] accessor = Context.currentContext().genAccessor(ictx.getText());
			// Generate & append the reference code
			compiler.appendInstruction(accessor);
		}
		if (isNumber) {
			NumberContext nctx = vctx.number();
			// Numbers can be 'pi' or 'e', and
			// the calculator already has these mathematical
			// constants, might as well use them
			boolean isPi = nctx.PI() != null;
			boolean isE = nctx.E() != null;
			if (isPi) {
				compiler.appendInstruction(TiToken.CONST_PI);
			} else if (isE) {
				compiler.appendInstruction(TiToken.CONST_E);
			} else {
				// This case it has to be a number
				TerminalNode numNode = nctx.NUMBER();
				// Get the number as text
				String nodeText = numNode.getText();

				// Loop through each char
				for (int i = 0; i < nodeText.length(); i++) {
					char c = nodeText.charAt(i);
					switch (c) {
					// If its a -, we have to convert that to a negate token
					case '-':
						compiler.appendInstruction(TiToken.NEGATE);
						break;
					// If its a . thats the period token
					case '.':
						compiler.appendInstruction(TiToken.PERIOD);
						break;
					// Otherwise just convert the number and append it
					default:
						int num = Integer.parseInt("" + c);
						TiToken next = TiToken.getNumber(num)[0];
						compiler.appendInstruction(next);
					}
				}
			}
		}

		return compiler.getTokens();
	}

}
