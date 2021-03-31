package com.efscript.script;

import java.util.ArrayDeque;
import java.util.ArrayList;

//Class for current compiler context, also known as a "scope"
public class Context {
    private static ArrayDeque<Context> contexts = new ArrayDeque<>();
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
    public Context(String name) {
        this.ctxName = name;
    }

    public void addIdentifier(String identifier) {
        identifiers.add(identifier);
    }
    public String[] getIdentifiers() {
        String[] arr = new String[identifiers.size()];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = identifiers.get(i);
        }
        return arr;
    }
}
