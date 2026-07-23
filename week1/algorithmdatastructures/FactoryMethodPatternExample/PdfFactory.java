package week1.algorithmdatastructures.FactoryMethodPatternExample;

public class PdfFactory  extends DocumentFactory {
    @Override
    public Document documentCreation() {
        return new PdfDocument();
        }
    
}
