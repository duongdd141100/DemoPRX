package com.example.demoxml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.ResourceUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

@SpringBootApplication
public class DemoXmlApplication {
    @Autowired

    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        Document document = documentBuilder.parse(ResourceUtils.getFile("classpath:students.xml"));
        NodeList nList = document.getElementsByTagName("student");
        for (int i = 0; i < nList.getLength(); i++)
        {
            Node node = nList.item(i);
            System.out.println();    //Just a separator
            if (node.getNodeType() == Node.ELEMENT_NODE)
            {
                //Print each student's detail
                Element element = (Element) node;
                System.out.println("Student id : " + element.getAttribute("id"));
                System.out.println("Name : " + element.getElementsByTagName("Name").item(0).getTextContent());
                System.out.println("Roll No : " + element.getElementsByTagName("id").item(0).getTextContent());
                System.out.println("Location : " + element.getElementsByTagName("location").item(0).getTextContent());
            }
        }
    }

}
