package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public static void vowelDeterminer(char character) {
        boolean isUpperVowel = character == 'A' || character == 'E' || character == 'I' || character == 'O' ||
                character == 'U';
        boolean isLowerVowel = character == 'a' || character == 'e' || character == 'i' || character == 'o' ||
                character == 'u';
        boolean isVowel = isUpperVowel || isLowerVowel;
        if(!((character >= 65 && character <= 90) || (character >= 97 && character <= 122))) {
            System.out.println("wrong alphabet");
        } else if(isVowel){
            System.out.println("Vowel");
        } else {
            System.out.println("Consonant");
        }
    }

    public static void main(String[] args) {
        vowelDeterminer('A');
        vowelDeterminer('1');
        vowelDeterminer('a');
        vowelDeterminer('z');
        vowelDeterminer('Y');
    }
}
