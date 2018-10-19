package com.imagegrafia.collectioncase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ListMapMix {
	
	//print a list of pair List->Map
	List<Map<String,Integer>> pairList=new ArrayList<>();
	
	
	Map<String , Integer> map=new HashMap<>();
	//add object to map
	public void addObjectToMap() {
		for(int i=0;i<10;i++) {
			map.put("A"+i, i);
		}
	}
	//add map to list
	public void addMapToList() {
		pairList.add(map);
		
	}
	//get listofPairs
	public void getListOfPair() {
		//add object to map
		this.addObjectToMap();
		this.addMapToList();
		System.out.println(map);
		System.out.println(pairList);
	}
	//2. requirement get map as list individual element pairs
	//so iterate map as no of element
	List<Map<String,Integer>> mapPair=new ArrayList<>();
	Set<String> keySet=map.keySet();
	Iterator<String> itr=keySet.iterator();
	
	public void mapAsListElement() throws InterruptedException {
//		List<Map<String,Integer>> mapPair=new ArrayList<>();
//		Set<String> keySet=map.keySet();
//		Iterator<String> itr=keySet.iterator();
//		
		
		Thread.sleep(2000);
		System.out.println(itr.getClass());
		while(itr.hasNext()) {
			String key=itr.next();
			Integer value=map.get(key);
			System.out.println(key+"::"+value);
			//form a new map
			Map<String,Integer> map2=new HashMap<>();
			//add map key and value
			map2.put(key, value);
			//add new map to list on each iteration
			mapPair.add(map2);
		}
//		System.out.println(mapPair);
//		System.out.println(map);
//		System.out.println(pairList);
	}
	
}
