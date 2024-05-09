public class Monedas {
    private String monedaInicial;
    private String monedaFinal;
    private double resultado;
    private double factorDeConversion;
    private double cantidad;

    public double getCantidad() {
        return cantidad;
    }

    public Monedas(MonedasApi miMoneda, double cantidad) {
        this.monedaInicial = miMoneda.base_code();
        this.monedaFinal = miMoneda.target_code();
        this.resultado = miMoneda.conversion_result();
        this.factorDeConversion = miMoneda.conversion_rate();
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Se realizó correctamente la conversión.\n" +
                cantidad + " [" + monedaInicial + "] es igual a " + resultado + " [" + monedaFinal + "]\n" +
                "El factor de conversión actual es: " + factorDeConversion;
    }
}
