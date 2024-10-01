class Palm extends Vaxt {
    public Palm(String namn, double langd) {
        super(namn, langd);
    }
    // Här sker polymorfism pga att jag hämtar metoden ifrån min interface och sedan anpassar den till aktuell subklass.
    @Override
    public String getVatskebehov() {
        return String.format("%.2f", 0.5 * getLangd());
    }

    @Override
    public String getVatsketyp() {
        return "kranvatten";
    }
}

