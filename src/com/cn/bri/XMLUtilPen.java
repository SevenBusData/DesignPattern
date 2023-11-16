package com.cn.bri;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class XMLUtilPen {

    public static Object getBean(String args){

        DocumentBuilderFactory    documentBuilderFactory=DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder    builder =documentBuilderFactory.newDocumentBuilder();
            Document doc;
            doc = builder.parse(new File("src/com/cn/bri/config.xml"));
            NodeList nl =doc.getElementsByTagName("className");
            Node classNode = null;
            if(args.equals("color")){
                 classNode = nl.item(0).getFirstChild();
            }else if(args.equals("pen")){
                 classNode = nl.item(1).getFirstChild();

            }
            String className = classNode.getNodeValue().trim();
            Class  c =  Class.forName(className);
            Object  o =c.getDeclaredConstructor().newInstance();
            return  o;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }


    }



}
