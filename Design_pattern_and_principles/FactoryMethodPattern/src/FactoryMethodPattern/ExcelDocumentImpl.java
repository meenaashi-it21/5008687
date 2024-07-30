package FactoryMethodPattern;

public class ExcelDocumentImpl implements ExcelDocument {
	 public void open() {
	        System.out.println("Opening Excel document...");
	    }

	    @Override
	    public void save() {
	        System.out.println("Saving Excel document...");
	    }
}
