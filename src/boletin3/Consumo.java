package boletin3;

public class Consumo {
//los atributos son siempre privados

    private float km, litros, vMed, pGas;

//constructores
    public Consumo() {
    }

    public Consumo(float km, float litros, float vMed, float pGas) {
        this.km = km;
        this.litros = litros;
        this.vMed = vMed;
        this.pGas = pGas;
    }

//metodos de acceso (getters and setters)
    public float getTempo() {
        float tempo;
        tempo = km / vMed;
        return tempo;
    }

    public void setKms(float km) {
        this.km = km;
    }

    public void setLitros(float litros) {
        this.litros = litros;
    }

    public void setvMed(float vMed) {
        this.vMed = vMed;
    }

    public void setPGas(float pGas) {
        this.pGas = pGas;
    }
//metodos de calculo

    public float ConsumoMedio() {
        float consumoMedio;
        consumoMedio = litros / 100;
        return consumoMedio;
    }

    public float ConsumoEuros() {
        float consumoEuros;
        consumoEuros = (pGas * km) / 100;
        return consumoEuros;
    }
}
