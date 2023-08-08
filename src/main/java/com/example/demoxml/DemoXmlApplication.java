package com.example.demoxml;

import com.example.demoxml.entity.Student;
import com.example.demoxml.reader.StringXmlReader;
import com.example.demoxml.reader.StudentXmlReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.ResourceUtils;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.List;

@SpringBootApplication
public class DemoXmlApplication {
    @Autowired

    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        StudentXmlReader studentReader = new StudentXmlReader(ResourceUtils.getFile("classpath:students.xml"), "student");
        StringXmlReader reader = new StringXmlReader(ResourceUtils.getFile("classpath:strings.xml"), "item");

    }

}
