package com.translationexchange.samples.struts.welp.listeners;

import com.translationexchange.core.Tml;
import com.translationexchange.core.Utils;
import com.translationexchange.j2ee.listeners.TmlListener;

public class WelpListener extends TmlListener {

	protected void configureTml() {

		Tml.getConfig().setApplication(Utils.buildMap(
			"key",		"c5ed3ddbb96c9ed64c2e739369adf56241225dc46464dba7e52fd8e1aeaf8524",
			"token", 	"d32f6d513875fb223a73a7e3e92f193119191377407defc988e1fa6fda292552",
			"host", 	"http://localhost:3000"
		));

		Tml.getConfig().setCache(Utils.buildMap(
			"enabled",  true,	
	    	"class", 	"com.translationexchange.cache.Memcached",
	        "host", 	"localhost:11211",
	        "namespace", "c5ed3ddbb96c9ed64"
		));
		
	}
	
}
