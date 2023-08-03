package com.example.demoxml.reader;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public abstract class XmlReader {

    private File file;

    private String tagName;

    public XmlReader(File file, String tagName) {
        this.file = file;
        this.tagName = tagName;
    }

    public NodeList readToNodeList() throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        Document document = documentBuilder.parse(file);
        return document.getElementsByTagName(tagName);
    }
}
