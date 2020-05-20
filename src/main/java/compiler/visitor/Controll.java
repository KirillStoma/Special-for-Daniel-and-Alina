package compiler.visitor;

public class Controll {

    public String getStringWithFirstCapital(String string) {
        return string.substring(0, 1).toUpperCase() + string.substring(1).toLowerCase();
    }
}
