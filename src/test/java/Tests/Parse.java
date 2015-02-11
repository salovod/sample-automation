package Tests;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class Parse {

    private static String getValue(String tag, Element element) {
        NodeList nodes = element.getElementsByTagName(tag).item(0).getChildNodes();
        Node node = (Node) nodes.item(0);
        return node.getNodeValue();
    }

    public String mainParse(String value) {
        String query = "";
        try {
            String path = System.setProperty("testng", getClass().getResource("/stock.xml").getPath());
            System.out.println(getClass().getResource("/stock.xml").getPath());
            File stocks = new File("/home/rb/Documents/GIT/sample-automation/stock.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(stocks);
            doc.getDocumentElement().normalize();

            NodeList nodes = doc.getElementsByTagName("stock");

            for (int i = 0; i < nodes.getLength(); i++) {
                Node node = nodes.item(i);

                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    query = getValue(value, element);
                    System.out.println("Stock Symbol: " + getValue(value, element));
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return query;
    }
}
