public class Carro extends Veiculo {

    public Carro(float potencia){
        super(potencia);
    }

    public float gerarPotencia() {
        return this.potencia * this.motor.aumentoPotencia();
    }
}
