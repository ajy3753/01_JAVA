package t240731;

import java.util.ArrayList;
import java.util.HashMap;

public class FarmController {
	// 필드
	private HashMap<Farm, Integer> hMap = new HashMap<>();
	private ArrayList<Farm> list = new ArrayList<>();
	
	public FarmController() {
		super();
		this.hMap = hMap;
	}
	
	// 메소드
	public boolean addNewKind(Farm f, int amount) {
		if(hMap.containsValue(f)) {
			
		}
		return true;
	}
	
	public boolean removeKind(Farm f) {
		return false;
	}
	
	public boolean changeAmount(Farm f, int amount) {
		return false;
	}
	
	public HashMap<Farm, Integer> printFarm(){
		return null;
	}
	
	public boolean buyFarm() {
		return true;
	}
	
	public boolean removeFarm(Farm f) {
		return true;
	}
	
	public ArrayList<Farm> printBuyFarm(){
		return null;
	}
}
