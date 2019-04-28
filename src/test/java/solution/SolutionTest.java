package solution;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void deveRetornar1PoisEleSoFoiUmaVezAoVale() {
        Solution solution = new Solution();
        int retorno = solution.countingValleys(8, "UDDDUDUU");
        Assert.assertEquals(1, retorno);
    }

    @Test
    public void deveRetornar3PoisEleSoFoiTresVezAoVale() {
        Solution solution = new Solution();
        int retorno = solution.countingValleys(8, "DUDUDU");
        Assert.assertEquals(3, retorno);
    }

    @Test
    public void deveRetornar0PoisEleNaoFoiAoVale() {
        Solution solution = new Solution();
        int retorno = solution.countingValleys(8, "UUDDUDUU");
        Assert.assertEquals(0, retorno);
    }
}
