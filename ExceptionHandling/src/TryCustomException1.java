class InvalidAgeException extends Exception {
    public InvalidAgeException(String str) {
        super(str);
    }
}

public class TryCustomException1 {
    static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age is not valid");
        } else {
            System.out.println("Age is Valid");
        }

    }

    public static void main(String[] args) {
        try{
            validateAge(13);
        }
        catch(InvalidAgeException e){
            System.out.println(e);
        }
    }
}
