package com.example.demoxml.reader;

import com.example.demoxml.entity.Student;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StudentXmlReader extends XmlReader {
    public StudentXmlReader(File file, String tagName) {
        super(file, tagName);
    }

    public List<Student> findStudents() throws ParserConfigurationException, IOException, SAXException {
        NodeList nodeList = this.readToNodeList();
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < nodeList.getLength(); i ++) {
            Element element = (Element) nodeList.item(i);
            students.add(new Student(
                    Integer.parseInt(element.getAttribute("id")),
                    Integer.parseInt(element.getElementsByTagName("id").item(0).getTextContent()),
                    element.getElementsByTagName("Name").item(0).getLocalName(),
                    element.getElementsByTagName("location").item(0).getTextContent()
            ));
        }
        return students;
    }

}
