package data.java.xml;

import javax.xml.parsers.*;
import org.xml.sax.*;
import org.xml.sax.helpers.*;

public class My_SaxParser extends DefaultHandler {

	public static void main(String [] args) throws Exception {
		System.out.println("In My_SaxParser...");
		My_SaxParser sp = new My_SaxParser();
		sp.parse(args[0]);
		//sp.read(args[0]);

	}//end main

	public void parse (String str) throws Exception {
	XMLReader parser = XMLReaderFactory.createXMLReader();
	parser.parse(str);

	}//end parse

	public void read (String str) throws Exception {
	XMLReader reader = XMLReaderFactory.createXMLReader("org.apache.xerces.parsers.SAXParser");
	reader.setContentHandler(this);
	reader.parse(str);

	}//end read

} //end class
