public class FizzBuzz {
    public String fizzBuzz(int num){
        if (num % 5 == 0 && num % 3 == 0) {
            return "FIzzBuzz!";
        }
        else if (num % 3 == 0) {
            return "Fizz!";
        }
        else if (num % 5 == 0) {
            return "Buzz!";
        } else {
            return String.valueOf(num);
        } 
        
    }
}