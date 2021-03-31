package com.efscript.script;

import java.util.ArrayDeque;

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

    public Context() {
        
    }
}
