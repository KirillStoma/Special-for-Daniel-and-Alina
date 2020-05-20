package compiler.visitor;

import compiler.language.ChislaLanguageParser;
import compiler.types.VariableType;
import compiler.exceptions.NotDefinedVariable;
import compiler.exceptions.NotValidCast;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.HashMap;
import java.util.Map;

public class Memory {
    public Map<String, VariableType> globalVariable = new HashMap<>();
    public Map<String, VariableType> localVariable = new HashMap<>();
    public Map<String, VariableType> functionNames = new HashMap<>();

    public void addVariableToList(ParserRuleContext ctx, String name, VariableType type) {
        if (isGlobal(ctx)) {
            globalVariable.put(name, type);
        } else {
            localVariable.put(name, type);
        }
    }

    public boolean isGlobal(ParserRuleContext ctx) {
        return ctx.getParent().getParent() instanceof ChislaLanguageParser.MathContext;
    }

    public void logError(String message) {
        System.out.println("Compilation Error: " + message);
    }

    public void addToLocalVariableList(String name, VariableType type) {
        localVariable.put(name, type);
    }

    public void clearLocalVariableList() {
        localVariable.clear();
    }

    public void addToFunctionList(String name, VariableType type) {
        functionNames.put(name, type);
    }

    public void checkVariable(String name) {
        if (!(globalVariable.containsKey(name) || localVariable.containsKey(name))) {
            try {
                throw new NotDefinedVariable("Variable " + name + " is not defined");
            } catch (NotDefinedVariable notDefinedVariable) {
                logError(notDefinedVariable.getMessage());
                System.exit(-1);
            }
        }
    }
    public boolean notExistLocaleVariable(String name) {
        return !localVariable.containsKey(name);
    }

    public void checkFunction(String name) {
        if (!(functionNames.containsKey(name))) {
            try {
                throw new NotDefinedVariable("Function " + name + " is not defined");
            } catch (NotDefinedVariable notDefinedVariable) {
                logError(notDefinedVariable.getMessage());
                System.exit(-2);
            }
        }
    }

    public void checkCast(String name, VariableType needType) {
        try {
            if (localVariable.containsKey(name)) {
                if (!(localVariable.get(name).equals(needType))) {
                    throw new NotValidCast("Variable " + name + " need have type " + needType);
                }
            } else {
                if (!(globalVariable.get(name).equals(needType))) {
                    throw new NotValidCast("Variable " + name + " need have type " + needType);
                }
            }
        } catch (NotValidCast notValidCast) {
            logError(notValidCast.getMessage());
            System.exit(-3);
        }
    }

}
