package FactoryMethodPattern;

public class WordDocumentFactory extends DocumentFactory {
	  public Document createDocument() {
	        return new WordDocumentImpl();
	    }
}
