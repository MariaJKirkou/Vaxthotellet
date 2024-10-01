// Detta är min superklass där jag sparar namnen å längden för subklassen (d som dom har gemensamt).
abstract class Vaxt implements Vattenvatska {
    private String namn;
    private double langd;


    public Vaxt(String namn, double langd) {
        this.namn = namn;
        this.langd = langd;
    }

    public String getNamn() {
        return namn;
    }

    public double getLangd() {
        return langd;
    }
}

