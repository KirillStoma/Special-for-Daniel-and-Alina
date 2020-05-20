package compiler.types;

public enum VariableType {
    INTEGER("int"),
    FLOAT ("float"),
    VOID("void");

    public static VariableType getTypeByString(String type){
        switch (type){
            case "int":
                return INTEGER;
            case "flt":
                return FLOAT;
            default:
                return VOID;
        }
    }

    VariableType(String type){
        this.type = type;
    }

    private String type;

    @Override
    public String toString() {
        return type;
    }

}