package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        if (character >= 'A' && character <= 'Z') {
            character = (char) ((int) character - (int) 'A' + (int) 'a');
        }

        if (character < 'a' || character > 'z') {
            System.out.println("wrong alphabet!");
        } else if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
            System.out.println("Vowel");
        } else {
            System.out.println("Consonant");
        }
    }
}
