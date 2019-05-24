/*
    Autor: Rafał Tęcza
    Index: s19468
*/
package pjwstk.lab5.zadanie6;

public class ChemicalElement {

    private String name;
    private String symbolicName;
    private int atomicNumber;
    private Type type;

    public ChemicalElement(String name, String symbolicName, int atomicNumber, Type type) {
        this.name = name;
        this.symbolicName = symbolicName;
        this.atomicNumber = atomicNumber;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getSymbolicName() {
        return symbolicName;
    }

    public int getAtomicNumber() {
        return atomicNumber;
    }

    public Type getType() {
        return this.type;
    }

    public boolean isAlkaliMetal() {
        return this.type.equals(Type.ALKALI) ? true : false;
    }

    public boolean isTransitionMetal() {
        return this.type.equals(Type.TRANSITION) ? true : false;
    }

    public boolean isMetal() {
        return this.type.equals(Type.METAL) ? true : false;
    }

    public enum Type {
        ALKALI, TRANSITION, METAL;
    }
}
