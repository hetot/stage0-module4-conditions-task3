package school.mjc.stage0.conditions.task3;

public class IsEnglishSymbolDeterminer {
    public void isEnglishSymbol(char symbol) {
        System.out.println((symbol >= 'A' && symbol <= 'Z') || (symbol >= 'a' && symbol <= 'z') ?
                "English" : "Non English");
    }
}
