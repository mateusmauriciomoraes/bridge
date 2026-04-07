import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MotoTest {

    @Test
    void deveRetornarPotenciaMotoComMotorEletrico() {
        Motor motor = new Eletrico();
        Moto moto = new Moto(1.0f);
        moto.setMotor(motor);
        assertEquals(2.0f, moto.gerarPotencia(), 0.01f);
    }

    @Test
    void deveRetornarPotenciaMotoComMotorCombustao() {
        Motor motor = new Combustao();
        Moto moto = new Moto(1.0f);
        moto.setMotor(motor);
        assertEquals(1.5f, moto.gerarPotencia(), 0.01f);
    }
}