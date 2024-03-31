package task3;

import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ThirdTaskTest {
    List<BigDecimal> MOCK_LIST = List.of(
            new BigDecimal("64.02750856861792"),
            new BigDecimal("-263.79917748626826"),
            new BigDecimal("413.4177725562969"),
            new BigDecimal("-98.15569002545863"),
            new BigDecimal("260.71069101239686"),
            new BigDecimal("420.4075316406545"),
            new BigDecimal("-422.20448893074445"),
            new BigDecimal("-274.53789398562253"),
            new BigDecimal("81.94273181328015"),
            new BigDecimal("319.34133404029285")
    );
    BigDecimal expectedResult = new BigDecimal("75919029524768.7243833925118045665153409982033182537949988326416161235522308007295730992330424000");

    @Test
    public void testGenerateRandomBigDecimalList() {
        BigDecimalListHandler handler = new BigDecimalListHandler();
        List<BigDecimal> list = handler.generateRandomBigDecimalList(10);

        assertEquals(10, list.size());
        for (BigDecimal element : list) {
            assertInstanceOf(BigDecimal.class, element);
        }

        List<BigDecimal> list2 = handler.generateRandomBigDecimalList(10);
        assertEquals(10, list2.size());

        for (int i = 0; i < list.size(); i++) {
            assertNotEquals(list.get(i), list2.get(i));
        }
    }

    @Test
    public void testSortListByAbsoluteValueDescending() {
        BigDecimalListHandler handler = new BigDecimalListHandler();
        List<BigDecimal> list = handler.generateRandomBigDecimalList(10);
        handler.sortListByAbsoluteValueDescending(list);

        for (int i = 0; i < list.size() - 1; i++) {
            BigDecimal current = list.get(i);
            BigDecimal next = list.get(i + 1);
            boolean isSorted = current.abs().compareTo(next.abs()) >= 0;
            assertTrue(isSorted);
        }
    }

    @Test
    public void testMultiplyPositiveNumbersUsingLoops() {
        BigDecimalListHandler handler = new BigDecimalListHandler();
        BigDecimal result = handler.multiplyPositiveNumbersUsingLoops(MOCK_LIST);

        assertEquals(expectedResult, result);
    }

    @Test
    public void testMultiplyPositiveNumbersUsingCollection() {
        BigDecimalListHandler handler = new BigDecimalListHandler();
        BigDecimal result = handler.multiplyPositiveNumbersUsingCollection(MOCK_LIST);

        assertEquals(expectedResult, result);
    }

    @Test
    public void testMultiplyPositiveNumbersUsingStreamAPI() {
        BigDecimalListHandler handler = new BigDecimalListHandler();
        BigDecimal result = handler.multiplyPositiveNumbersUsingStreamAPI(MOCK_LIST);

        assertEquals(expectedResult, result);
    }
}
