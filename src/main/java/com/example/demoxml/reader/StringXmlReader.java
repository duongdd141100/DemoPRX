package com.example.demoxml.reader;

import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StringXmlReader extends XmlReader {
    public StringXmlReader(File file, String tagName) {
        super(file, tagName);
    }

    public List<String> getStrings() throws ParserConfigurationException, IOException, SAXException {
        List<String> strings = new ArrayList<>();
        NodeList nodeList = this.readToNodeList();
        for (int i = 0; i < nodeList.getLength(); i ++) {
            Element element = (Element) nodeList.item(i);
            strings.add(element.getTextContent());
        }
        return strings;
    }
}
