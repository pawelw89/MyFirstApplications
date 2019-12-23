package Lesson16;

public class StringConverter {
    public String reverseString(String inputString){
        if ((inputString == null) || inputString.isEmpty()){
            throw new EmptyStringException();
        }
        StringBuilder stringBuilder = new StringBuilder(inputString);
        return stringBuilder.reverse().toString();
    }
}
