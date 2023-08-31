package responsibility;

public class BicicletaFactory {
    public static void main(String[] args) {
        BicicletaAssembler assembler = new BicicletaAssembler();
        BicicletaCombiner combiner = new BicicletaCombiner();

        String chasis = assembler.armarChasis();
        String ruedas = assembler.armarRuedas();

        combiner.unirComponentes(chasis, ruedas);
    }
}
