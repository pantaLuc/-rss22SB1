package fr.univrouen.rss22;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController

public class RSSController {
	@RestController
	public class GetController {
	@GetMapping("/resume")
	public String getListRSSinXML() {
	return "Envoi de la liste des flux RSS";
	}
	@GetMapping("/id")
	public String getRSSinXML() {
	return "Détail du contenu RSS demandé";
	}
	}

}
