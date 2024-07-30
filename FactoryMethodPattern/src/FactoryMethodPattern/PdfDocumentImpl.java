package FactoryMethodPattern;

public class PdfDocumentImpl implements PdfDocument{
	public void open() {
        System.out.println("Opening PDF document...");
    }

    @Override
    public void save() {
        System.out.println("Saving PDF document...");
    }
}
