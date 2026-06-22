package week1.FactoryMethodPatternExample;

public class Main {
    public static void main(String[] args) {
        DocumentFactory excelFactory = new ExcelFactory();
        Document excelDocument = excelFactory.documentCreation();
        excelDocument.open();
        DocumentFactory pdfFactory = new PdfFactory();
        Document pdfDocument = pdfFactory.documentCreation();
        pdfDocument.open();
        DocumentFactory wordFactory = new WordFactory();
        Document wordDocument = wordFactory.documentCreation();
        wordDocument.open();
    }
}
