package com.cn.NvWaCreatePerson;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class XMLUtil {
    public static String getGender(){

        DocumentBuilderFactory documentBuilderFactory=DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder builder =documentBuilderFactory.newDocumentBuilder();
            Document doc;
            doc = builder.parse(new File("/Users/seven/Desktop/JavaWeb/DesignPattern/src/com/cn/NvWaCreatePerson/config.xml"));
            NodeList nl =doc.getElementsByTagName("gender");
            Node classNode = nl.item(0).getFirstChild();
            String gender = classNode.getNodeValue().trim();
            return gender;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }


    }
}
