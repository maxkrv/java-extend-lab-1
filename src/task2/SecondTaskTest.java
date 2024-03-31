package task2;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

public class SecondTaskTest {
    private final BigInteger base = new BigInteger("74190572998409351345");
    private final int exponent = 5;
    private final BigInteger expected = new BigInteger("2247727331524050440724070499240149112606339009832357393483370707859269596158230896324327550319840625");

    @Test
    public void testGenerateRandomBigInteger() {
        BigInteger result = Main.generateRandomBigInteger(20);
        assertEquals(20, result.toString().length());

        BigInteger result2 = Main.generateRandomBigInteger(20);
        assertEquals(20, result2.toString().length());
        assertNotEquals(result, result2);
    }

    @Test
    public void testCalculatePower() {
        BigInteger result = Main.calculatePower(base, exponent);
        assertEquals(expected, result);
    }

    @Test
    public void testCalculatePowerUsingMultiplication() {
        BigInteger result = Main.calculatePowerUsingMultiplication(base, exponent);
        assertEquals(expected, result);
    }

    @Test
    public void testCalculatePowerForRandomBigInteger() {
        BigInteger randomBigInteger = Main.generateRandomBigInteger(20);
        BigInteger result1 = Main.calculatePower(randomBigInteger, exponent);
        BigInteger result2 = randomBigInteger.pow(exponent);
        assertEquals(result1, result2);
    }
}
