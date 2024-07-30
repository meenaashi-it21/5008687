package FactoryMethodPattern;

public class WordDocumentImpl implements WordDocument {
	 public void open() {
	        System.out.println("Opening Word document...");
	    }

	    @Override
	    public void save() {
	        System.out.println("Saving Word document...");
	    }
}
