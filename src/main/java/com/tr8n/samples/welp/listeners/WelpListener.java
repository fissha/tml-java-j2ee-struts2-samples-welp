package com.tr8n.samples.welp.listeners;

import com.tr8n.core.Tr8n;
import com.tr8n.core.Utils;
import com.tr8n.j2ee.listeners.Tr8nListener;

public class WelpListener extends Tr8nListener {

	protected void configureTr8n() {
//		Tr8n.getConfig().setApplication(Utils.buildMap(
//			"key", 		"a8445a60494c70296",
//			"secret", 	"1958ad820a75d4e66",
//			"host", 	"https://sandbox.tr8nhub.com"
//		));
		
		Tr8n.getConfig().setApplication(Utils.buildStringMap(
			"key", 		"6369467e8d46aed99",
			"secret", 	"135c1dc57af6f85bc",
			"host", 	"http://localhost:3000"
		));

		Tr8n.getConfig().setCache(Utils.buildMap(
	    	"class", 	"com.tr8n.cache.Memcached",
	        "host", 	"localhost:11211",
	        "version", 	1,
	        "timeout",	3600
		));
	}
	
}
