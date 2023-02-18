package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public void vowelDeterminer(char character) {
        if (alphabet.contains(String.valueOf(character))) {
            String characterStringVersion = String.valueOf(character);
            switch (characterStringVersion) {
                case ("a"), ("e"), ("i"), ("o"), ("u"), ("y"), ("A"), ("E"), ("I"), ("O"), ("U"), ("Y"):
                    System.out.println("Vowel");
                    break;
                default:
                    System.out.println("Consonant");
            }
        } else {
            System.out.println("wrong alphabet!");
        }
    }
}
