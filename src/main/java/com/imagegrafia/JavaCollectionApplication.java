package com.imagegrafia;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.imagegrafia.collectioncase.ListMapMix;

@SpringBootApplication
public class JavaCollectionApplication {

	public static void main(String[] args) throws InterruptedException{
		SpringApplication.run(JavaCollectionApplication.class, args);
		ListMapMix listMapMix= new ListMapMix();
		listMapMix.getListOfPair();
		Thread.sleep(2000);
		listMapMix.mapAsListElement();
		
		///

		/*Map<String , Integer> map=new HashMap<>();
		//add object to map
		
			for(int i=0;i<10;i++) {
				map.put("A"+i, i);
			}
			Set<String> keySet=map.keySet();
			Iterator<String> itr=keySet.iterator();
			while(itr.hasNext()) {
				String key=itr.next();
				Integer value=map.get(key);
				//System.out.println(key+"::"+value);
				//form a new map
				Map<String,Integer> map2=new HashMap<>();
				//add map key and value
				map2.put(key, value);
				//add new map to list on each iteration
				System.out.println(map2);
			}*/
	}
}
