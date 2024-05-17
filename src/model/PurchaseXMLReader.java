package model;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Element;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class PurchaseXMLReader {
      public List<Object[]> readPurchasesFromXML(String filePath) {
        List<Object[]> purchases = new ArrayList<>();
        try {
            File inputFile = new File(filePath);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();

            NodeList phoneList = doc.getElementsByTagName("product");
            for (int temp = 0; temp < phoneList.getLength(); temp++) {
                Element element = (Element) phoneList.item(temp);
                String name = element.getElementsByTagName("name").item(0).getTextContent();
                String price = element.getElementsByTagName("price").item(0).getTextContent();
                int quantity = Integer.parseInt(element.getElementsByTagName("quantity").item(0).getTextContent());
                purchases.add(new Object[]{name, price, quantity});
            }

            NodeList laptopList = doc.getElementsByTagName("product");
            for (int temp = 0; temp < laptopList.getLength(); temp++) {
                Element element = (Element) laptopList.item(temp);
                String name = element.getElementsByTagName("name").item(0).getTextContent();
                String price = element.getElementsByTagName("price").item(0).getTextContent();
                int quantity = Integer.parseInt(element.getElementsByTagName("quantity").item(0).getTextContent());
                purchases.add(new Object[]{name, price, quantity});
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return purchases;
    }
}
