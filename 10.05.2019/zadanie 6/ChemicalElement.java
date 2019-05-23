public class ChemicalElement {

private String name;
private String symbol;
private int atomicNumber;
private ChemicalType type;

    public ChemicalElement(String name, String symbol, int atomicNumber) {
        this.name = name;
        this.symbol = symbol;
        this.atomicNumber = atomicNumber;
        setType(atomicNumber);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public int getAtomicNumber() {
        return atomicNumber;
    }

    public void setAtomicNumber(int atomicNumber) {
        this.atomicNumber = atomicNumber;
    }

    public ChemicalType getType() {
        return type;
    }

    private void setType(int num) {

        if(num == 3 || num == 11 || num == 19 || num == 37 || num == 55 || num == 87)
            type = ChemicalType.ALKALI;

        else if( (num >=21 && num <=31)
                || (num >=39 && num <=48)
                || (num >=72 && num <=80)
                || (num >=104 && num <=112)
        )
            type = ChemicalType.TRANSITION;

        else if(num == 13 || num == 49 || num ==50
                || (num>=81 && num<=83)
                || (num>=113 && num<=116)
        )
            type = ChemicalType.METAL;

        else
            type = ChemicalType.NOT_METAL;
    }

    @Override
    public String toString() {
        return "ChemicalElement{" +
                "name='" + name + '\'' +
                ", symbol='" + symbol + '\'' +
                ", atomicNumber=" + atomicNumber +
                ", type=" + type +
                '}';
    }
}
