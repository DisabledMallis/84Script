package com.efscript.script;

import com.efscript.Logger;
import com.efscript.ti.TiCompiler;
import com.efscript.ti.TiToken;

import java.util.ArrayDeque;
import java.util.ArrayList;

//Class for current compiler context, also known as a "scope"
public class Context {
    private static final ArrayDeque<Context> contexts = new ArrayDeque<>();
    public static Context currentContext() {
        return contexts.getFirst();
    }
    public static Context popContext() {
        return contexts.removeFirst();
    }
    public static void pushContext(Context cont) {
        contexts.addFirst(cont);
    }

    String ctxName;
    ArrayList<String> identifiers = new ArrayList<>();
    ArrayList<String> parameters = new ArrayList<>();
    public Context(String name) {
        this.ctxName = name;
    }

    public void addParameter(String param) {
        parameters.add(param);
    }
    public void addIdentifier(String identifier) {
        identifiers.add(identifier);
    }
    public String[] getVars() {
        String[] arr = new String[identifiers.size()];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = identifiers.get(i);
        }
        return arr;
    }
    public String[] getParams() {
        String[] arr = new String[parameters.size()];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = parameters.get(i);
        }
        return arr;
    }
    public String[] getIdentifiers() {
        String[] params = getParams();
        String[] vars = getVars();
        String[] total = new String[params.length + vars.length];
        for(int i = 0; i < total.length; i++) {
            if(i >= params.length) {
                total[i] = vars[i - params.length];
            }
            else {
                total[i] = params[i];
            }
        }
        return total;
    }
    public TiToken[] genAccessor(String identifier) throws Exception {
        //List & index ID vars
        int list = -1;
        int refIndex = -1;

        //Loop through identifiers
        for(int i = 0; i < identifiers.size(); i++) {
            //If the identifier matches
            if(identifiers.get(i).equals(identifier)) {
                //Set the values to ref it
                list = 1;
                refIndex = i+1;
                //We done
                break;
            }
        }
        //Loop through paramters
        //We do this 2nd because these should take priority in a name conflict
        for(int i = 0; i < parameters.size(); i++) {
            //If it matches
            if(parameters.get(i).equals(identifier)) {
                //Set the values to ref
                list = 2;
                refIndex = i+1;
                //Stop
                break;
            }
        }
        //If no matches, something went wrong, so we throw an exception
        if(list == -1) {
            throw new Exception("No such identifier \""+identifier+"\"");
        }

        //Compile the reference
        TiCompiler comp = new TiCompiler();
        comp.appendInstruction(TiToken.LIST);
        comp.appendInstruction(TiToken.getListSubscript(list));
        comp.appendInstruction(TiToken.OPEN_BRACKET);
        comp.appendInstruction(TiToken.getNumber(refIndex));
        comp.appendInstruction(TiToken.CLOSE_BRACKET);
        return comp.getTokens();
    }
    /*public EFSVarToken[] getAsTokens() {
        EFSVarToken[] tokens = new EFSVarToken[identifiers.size()];
        for(int i = 0; i < tokens.length; i++) {
            String id = identifiers.get(i);
            tokens[i] = new EFSVarToken(id);
        }
        return tokens;
    }*/
}
