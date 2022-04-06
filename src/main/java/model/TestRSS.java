package model;



import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UncheckedIOException;

import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.http.MediaType;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class TestRSS {
	
	 public static String asString(Resource resource) {
	        try (Reader reader = new InputStreamReader(resource.getInputStream(), "UTF_8")) {
	            return FileCopyUtils.copyToString(reader);
	        } catch (IOException e) {
	            throw new UncheckedIOException(e);
	        }
	    }

	
	public String loadFileXML() {
		ResourceLoader resourceLoader = new DefaultResourceLoader();
		Resource ressource=resourceLoader.getResource("src/main/resources/xml/item.xml");
		return asString(ressource);
	}
	
	@PostMapping(value = "/postrss", produces=MediaType.APPLICATION_XML_VALUE)
	@ResponseBody
	public String postRSS() {
	TestRSS rss = new TestRSS();
	return rss.loadFileXML();
	}

	
	
}
