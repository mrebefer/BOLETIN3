package boletin3;

public class Boletin3 {

    public static void main(String[] args) {
        //apartado a
        Consumo consume1 = new Consumo();
        //apartado b
        consume1.setLitros(50);
        consume1.setPGas(1,57);
        //apartado c
        Consumo consume2 = new Consumo(820, 51, 100, (float) 1.33);
        String consumoMedio = null;
        //apartado d
        System.out.println("O consumo medio é" +consumoMedio);
        //apartado e
        //apartado f
    }

}
