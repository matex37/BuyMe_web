import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class LoadXml {


    //This Class is for obtaining the browser type from an XML


        public static String getData (String keyName) throws Exception {
            File configXmlFile = new File("C:\\Users\\Yosef\\Documents\\load.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(configXmlFile);
            doc.getDocumentElement().normalize();
            return doc.getElementsByTagName(keyName).item(0).getTextContent();
        }

    }


