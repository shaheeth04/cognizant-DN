package week1.FactoryMethodPatternExample;

public class ExcelFactory  extends DocumentFactory {
    @Override
    public Document documentCreation() {
        return new ExcelDocument();
        }
    
}
