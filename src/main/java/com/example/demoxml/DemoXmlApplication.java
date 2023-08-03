package com.example.demoxml;

import com.example.demoxml.entity.Student;
import com.example.demoxml.reader.StudentXmlReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.ResourceUtils;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

@SpringBootApplication
public class DemoXmlApplication {
    @Autowired

    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        StudentXmlReader studentReader = new StudentXmlReader(ResourceUtils.getFile("classpath:students.xml"), "student");
        for (Student student : studentReader.findStudents()) {
            System.out.println(student.toString());
        }
    }

}
