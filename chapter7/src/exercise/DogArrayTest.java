package exercise;

import java.util.ArrayList;

public class DogArrayTest {

	public static void main(String[] args) {
		
		ArrayList<Dog> DogList = new ArrayList<Dog>(); //DogList 어레이리스트 생성.
		
		DogList.add(new Dog("바둑1", "똥개1"));
		DogList.add(new Dog("바둑2", "똥개2"));
		DogList.add(new Dog("바둑3", "똥개3"));
		DogList.add(new Dog("바둑4", "똥개4"));
		
		for(int i = 0 ; i < DogList.size() ; i++) {
			System.out.println(DogList.get(i).showDogInfo()); //DogList = 어레이리스트 , DogList.get(i) = 어레이리스트의 i번쨰 요소 (여기선 Dog)
															  //DogList.get(i).showDogInfo() 도그리스트 i번쨰 도그에 쇼독인포 매서드 사용.
		}
		
		

	}

}
