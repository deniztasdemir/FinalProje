package tr.edu.medipol.yazilimaraclari.FinalProjeOdevi;
import static org.junit.Assert.fail;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.web.bind.annotation.RequestBody;

import junit.framework.Assert;

class FinalProjeTest {

	@Test
	void testListele() {
		List<String> hastalar = Arrays.asList("Kemal","veli");
		List<String> listte = Arrays.asList("Kemal","Veli");
 	}
	
	@Test 
	void testEkle() {
		String isim = "Deniz";
		boolean ekle = HastaRestApi.hastalar.add("Deniz");
		Assert.assertEquals("Deniz", isim);
	}

}
