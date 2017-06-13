/**
 * 
 */
package org.dimigo.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <pre>
 * org.dimigo.collection
 *   |_ MelonGenreChart
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 6. 13.
 * </pre>
 *
 * @author            : ksw10
 * @version           : 1.0
 */
public class MelonGenreChart {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Music> balladArrayList = new ArrayList<Music>();
		List<Music> danceArrayList = new ArrayList<Music>();
		Map<String, List<Music>> map = new HashMap<>();
		balladArrayList.add(new Music("팔레트", "아이유"));
		map.put("발라드", balladArrayList);
		danceArrayList.add(new Music("I LUV IT", "PSY"));
		danceArrayList.add(new Music("맞지?", "언니쓰"));
		map.put("댄스", balladArrayList);
		System.out.println("--<< 멜론 장르별 챠트 >>--");
		System.out.println("[발라드]");
		printList(balladArrayList);
		System.out.println("[댄스]");
		printList(danceArrayList);
		System.out.println("");
		System.out.println("--<< 댄스 2위 곡 변경 >>--");
		System.out.println("[발라드]");
		printList(balladArrayList);
		System.out.println("[댄스]");
		danceArrayList.set(1, new Music("SIGNAL", "트와이스"));
		printList(danceArrayList);
		System.out.println("--<< 댄스 1위 곡 삭제 >>--");
		System.out.println("[발라드]");
		printList(balladArrayList);
		System.out.println("[댄스]");
		danceArrayList.remove(0);
		printList(danceArrayList);
		System.out.println("--<< 전체 리스트 삭제 >>--");
		map.clear();
	}
	public static void printList(List<Music> list)
	{
		for (Music s : list) {
			System.out.print(list.indexOf(s)+1);
			System.out.println(". " + s);
		}

	}


}
