package t240729.Lottery;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class LotteryController {
	// 필드
	private HashSet lottery = new HashSet();
	private HashSet win = new HashSet();
	
	public boolean insertObject(Lottery l) {
		return lottery.add(l);
	}
	
	public boolean deleteObject(Lottery l) {
		boolean isTrue = lottery.remove(l);
		
		if(isTrue) {
			win.remove(l);
		}
		
		return isTrue;
	}
	
	public HashSet winObject() {
		if(lottery.size() < 4) {
			return null;
		}
		
		List<Lottery> list = new ArrayList<>();
		list.addAll(lottery);
		
		while (win.size() < 4) {
			int rand = (int)(Math.random() * list.size());
			win.add(list.get(rand));
		}
		
		return win;
	}
	
	public TreeSet sortedWinObject() {
		TreeSet sortedWinSet = new TreeSet(new SortedLottery());
		sortedWinSet.addAll(win);
		return sortedWinSet;
	}
	
	public boolean searchWinner(Lottery l) {
		return win.contains(l);
	}
}
