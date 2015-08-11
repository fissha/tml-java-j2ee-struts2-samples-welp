package com.translationexchange.samples.struts.welp.listeners;

import com.translationexchange.core.Tml;
import com.translationexchange.core.Utils;
import com.translationexchange.j2ee.listeners.TmlListener;

public class WelpListener extends TmlListener {

	protected void configureTml() {

		Tml.getConfig().setApplication(Utils.buildMap(
			"key",		"05ebcb1f085f8e2b97b572b5efe61f056159cbbb72b79ef2989bd7260d0c7001",
			"token", 	"c41b8ffaf8c98eb290f9cb9d353afbb72d48a14ecda2e3eacda2b581948a8f2f",
			"host", 	"http://localhost:3000"
		));

		Tml.getConfig().setCache(Utils.buildMap(
			"enabled",  false,	
	    	"class", 	"com.translationexchange.cache.Memcached",
	        "host", 	"localhost:11211",
	        "namespace", "c41b8ffaf8c98"
		));
		
	}
	
}
