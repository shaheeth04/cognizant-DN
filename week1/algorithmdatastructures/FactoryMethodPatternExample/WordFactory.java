package week1.algorithmdatastructures.FactoryMethodPatternExample;

public class WordFactory extends DocumentFactory {
    @Override
    public Document documentCreation() {
        return new WordDocument();
        }
    
}
