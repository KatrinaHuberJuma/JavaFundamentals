public class StringManipulatorTest {
    public static void main(String[] args) {
        // Pythagorean myHyp = new Pythagorean();
        // double hypotenuse = myHyp.calculateHypotenuse(4, 5);
        // System.out.println(hypotenuse);
        StringManipulator mani = new StringManipulator();
        String concatted = mani.trimAndConcat("  here comes the na     ", "  me again  ");
        System.out.println(concatted);
        System.out.println(mani.getIndexOrNull(concatted, "n"));
        char c = 'a';
        System.out.println(mani.getIndexOrNull(concatted, c));
        System.out.println(mani.concatSubstring("Hello", 1, 2, "world"));
    }
}