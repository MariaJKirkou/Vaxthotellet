
class KottatandeVaxt extends Vaxt {
    public KottatandeVaxt(String namn, double langd) {
        super(namn, langd);
    }
    // Här sker polymorfism pga att jag hämtar metoden ifrån min interface och sedan anpassar den till aktuell subklass.
    @Override
    public String getVatskebehov() {
        return String.format("%.2f", 0.1 + (0.2 * getLangd()));
    }

    @Override
    public String getVatsketyp() {
        return "proteindryck";
    }
}
