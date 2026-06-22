package week1.FactoryMethodPatternExample;

public class WordFactory extends DocumentFactory {
    @Override
    public Document documentCreation() {
        return new WordDocument();
        }
    
}
