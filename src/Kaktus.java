class Kaktus extends Vaxt {
    public Kaktus(String namn, double langd) {
        super(namn, langd);
    }
    // Här sker polymorfism pga att jag hämtar metoden ifrån min interface och sedan anpassar den till aktuell subklass.
    @Override
    public String getVatskebehov() {
        return "0.02";
    }

    @Override
    public String getVatsketyp() {
        return "mineralvatten";
    }
}

