package EFScript.Script;

import jdk.nashorn.internal.ir.Block;
import jdk.nashorn.internal.ir.FunctionNode;
import jdk.nashorn.internal.ir.Statement;
import jdk.nashorn.internal.parser.Parser;
import jdk.nashorn.internal.runtime.Context;
import jdk.nashorn.internal.runtime.ErrorManager;
import jdk.nashorn.internal.runtime.Source;
import jdk.nashorn.internal.runtime.options.Options;

public class ParseJS
{
	public ParseJS(String code)
	{
		Options options = new Options("nashorn");
		options.set("anon.functions", false);
		options.set("parse.only", true);
		options.set("scripting", true);

		ErrorManager errors = new ErrorManager();
		Context context = new Context(options, errors, Thread.currentThread().getContextClassLoader());
		Source source   = new Source("test", code);
		Parser parser = new Parser(context.getEnv(), source, errors);
		FunctionNode functionNode = parser.parse();
		Block block = functionNode.getBody();
		List<Statement> statements = block.getStatements();

		for(Statement statement : statements)
		{
			
		}
	}
}