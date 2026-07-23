package week1.algorithmdatastructures.FactoryMethodPatternExample;

public class ExcelFactory  extends DocumentFactory {
    @Override
    public Document documentCreation() {
        return new ExcelDocument();
        }
    
}
