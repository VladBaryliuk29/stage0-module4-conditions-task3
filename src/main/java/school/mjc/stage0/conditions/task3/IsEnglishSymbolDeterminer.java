package school.mjc.stage0.conditions.task3;

public class IsEnglishSymbolDeterminer {
    String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public void isEnglishSymbol(char symbol) {
        if (alphabet.contains(String.valueOf(symbol))) {
            System.out.println("English");
        } else {
            System.out.println("Non English");
        }
    }
}
