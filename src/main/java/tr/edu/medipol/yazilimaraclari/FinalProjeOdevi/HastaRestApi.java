package tr.edu.medipol.yazilimaraclari.FinalProjeOdevi;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/hasta")

public class HastaRestApi {
	
	public static List<String> hastalar = new ArrayList<>();
	
	@GetMapping("/listele")
	public List<String> listele(){
		return hastalar;
	}
	
	@PostMapping("/ekle")
	public String ekle(@RequestBody String ad) {
		hastalar.add(ad);
		return ad;
	}

}
