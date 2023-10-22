import org.example.CurricularUnit;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CurricularUnitTest {

    @ParameterizedTest
    @CsvSource({"7.5, 9.8, 9.7"})
    void testInsertMarkCU(double mark1, double mark2, double mark3) {
        CurricularUnit cu = new CurricularUnit("Matemática", 3);
        cu.insertMark(1, mark1);
        cu.insertMark(2, mark2);
        cu.insertMark(3, mark3);

        assertEquals(mark1, cu.searchStudent(1));
        assertEquals(mark2, cu.searchStudent(2));
        assertEquals(mark3, cu.searchStudent(3));
    }



    @ParameterizedTest
    @CsvSource({"10.0, 7,7, 8.9"})
    void testAverageCU(double mark1, double mark2, double mark3) {
        double expectedAverage = (mark1 + mark2 + mark3) / 3.0;
        CurricularUnit cu = new CurricularUnit("Matematica", 3);
        cu.insertMark(1, mark1);
        cu.insertMark(2, mark2);
        cu.insertMark(3, mark3);

        assertEquals(expectedAverage, cu.averageCU());
    }

    @ParameterizedTest
    @CsvSource({"7.0, 6.0, 14.8"})
    void testIsAproved(double mark1, double mark2, double mark3) {
        CurricularUnit cu = new CurricularUnit("Matematica", 3);
        cu.insertMark(1, mark1);
        cu.insertMark(2, mark2);
        cu.insertMark(3, mark3);

        assertTrue(CurricularUnit.isAproved(1));
        assertTrue(CurricularUnit.isAproved(2));
        assertTrue(CurricularUnit.isAproved(3));

    }
}
