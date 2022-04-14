package fr.univrouen.rss22.controllers;

import model.Feed;
import model.Link;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import model.Item;
import model.TestRSS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class PostController {
	@RequestMapping(value = "/testpost", method = RequestMethod.POST, consumes = "application/xml")
	public String postTest(@RequestBody String flux) {
		return ("<result><response>Message reçu : </response>"  + flux + "</result>");
		}
	@PostMapping(value = "/postrss", produces = MediaType.APPLICATION_XML_VALUE)
	@ResponseBody
	public String postRSS() {
	TestRSS rss = new TestRSS();
	return rss.loadFileXML();
	}
	@RequestMapping(value = "/xml", produces = MediaType.APPLICATION_XML_VALUE)
	public @ResponseBody Item getXML() {
		Item it = new Item("12345678","Test item","2022-05-01T11:22:33");
		return it;
	}
	@RequestMapping(value="/xml2" ,produces =MediaType.APPLICATION_XML_VALUE)
	public @ResponseBody Feed getFeed(){
		Item it=new Item("1234444","test Item" ,"2022-05-01T11:22:33");
		Item it2=new Item("1234444","test Item" ,"2022-05-01T11:22:33");
		List<Item> list = new ArrayList<Item>(Arrays.asList(it ,it2));
		Link link=new Link("luc" ,"panta" ,"perin","pameni");
		Feed feed=new Feed("Bonjour" ,"2022-05-01T11:22:33","Luc Perin Panta" , link , list,"fr");
		return  feed;
	}
}
