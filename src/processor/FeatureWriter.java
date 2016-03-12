package processor;

import java.io.FileWriter;
import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class FeatureWriter {

	public static void processingDone() {
		jaxbWriter(FeatureContainer.getInstance(), "./resources/model.xml", "./resources/featureide.xsd");
	}
	
	private static void jaxbWriter(Object root, String path, String schema) {
		try {
			JAXBContext context = JAXBContext.newInstance(root.getClass());
			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_SCHEMA_LOCATION, schema);
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,Boolean.TRUE);
			marshaller.marshal(root, new FileWriter(path));
		} catch (JAXBException e) {
			System.err.println("Error while preparing to write the JAXB model in: "	+ path);
			e.printStackTrace();
		} catch (IOException e) {
			System.err.println("Error while writting the JAXB model in: "+ path);
			e.printStackTrace();
		}
	}
}
