package week1.FactoryMethodPatternExample;

public class PdfFactory  extends DocumentFactory {
    @Override
    public Document documentCreation() {
        return new PdfDocument();
        }
    
}
