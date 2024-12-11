public class Test {

    public static void main(String[] args) {
        Volante aquila = new Aquila();
        Volante passerotto = new Passerotto();
        Marino delfino = new Delfino();

        ((Aquila) aquila).verso();
        ((Aquila) aquila).mangia();
        ((Passerotto) passerotto).verso();
        ((Passerotto) passerotto).mangia();
        ((Delfino) delfino).verso();
        ((Delfino) delfino).verso();
        
        faiVolare(aquila);
        faiVolare(passerotto);
        faiNuotare(delfino);
    }

    private static void faiVolare(Volante volante) {
        volante.vola();
    }

    private static void faiNuotare(Marino marino) {
        marino.nuota();
    }
}
