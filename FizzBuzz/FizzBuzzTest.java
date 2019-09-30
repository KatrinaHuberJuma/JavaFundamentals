public class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzz fizzyBuzz = new FizzBuzz();
        
        String myString = fizzyBuzz.fizzBuzz(3);
        System.out.println(myString);

        String myString2 = fizzyBuzz.fizzBuzz(5);
        System.out.println(myString2);

        String myString3 = fizzyBuzz.fizzBuzz(15);
        System.out.println(myString3);

        String myString4 = fizzyBuzz.fizzBuzz(4);
        System.out.println(myString4);
    }
}