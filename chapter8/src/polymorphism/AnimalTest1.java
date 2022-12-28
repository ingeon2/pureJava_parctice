package polymorphism; 


class Animal {
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal {
	public void move() {
		System.out.println("사람이 걷습니다.");
	}
	
	public void read() {
		System.out.println("사람이 읽습니다.");
	}
}

class Tiger extends Animal {
	public void move() {
		System.out.println("호랑이가 네발로 뜁니다.");
	}
	
	public void hunting() {
		System.out.println("호랑이가 사냥합니다.");
	}
}

class Eagle extends Animal {
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");
	}
	
	public void flying() {
		System.out.println("독수리가 납니다.");
	}
}

//여기까지 상위클래스 하위클래스



public class AnimalTest1 {

	public static void main(String[] args) {
		
		AnimalTest1 atest = new AnimalTest1(); //atest 인스턴스 만들기
		
		atest.moveAnimal(new Animal()); //애니멀 클래스의 인스턴스를 변수로 사용하는 무브 애니멀 매서드를 AnimalTest1 에서 만들었으니,
										//AnimalTest1 인스턴스인 atest 에서 사용가능한것! (무 조 건 이 해 해)
		atest.moveAnimal(new Human());
		atest.moveAnimal(new Tiger());
		
		//Animal E = new Eagle();
		//atest.moveAnimal(E); 이게 아래와 같은거
		atest.moveAnimal(new Eagle());
		
		}
		
		
		public void moveAnimal(Animal animal) { //Animal 클래스의 인스턴스 animal(애니멀 휴먼 타이거 이글)을 변수로 받아 인스턴스.무브 를 실행하는 매서드 
			animal.move(); //Animal의 다른 인스턴스들마다 재정의된 매서드로 간다! (Animal, Human, Tiger, Eagle)
			
		//다운캐스팅 instanceof (상속받긴 했지만, 오버라이드 매서드가 아닌 각각의 함수를 사용하고 싶을때 윗 단계의 클래스로 올라가는것)
			if( animal instanceof Human) {
				Human human = (Human) animal;
				human.read();
			}
			else if( animal instanceof Tiger) {
				Tiger tiger = (Tiger) animal;
				tiger.hunting();
			}
			else if( animal instanceof Eagle) {
				Eagle eagle = (Eagle) animal;
				eagle.flying();
			}
			else {
				System.out.println("Animal 클래스는 상위 클래스이기 때문에 다운캐스팅을 위한 매서드는 없습니다.");
			}
			
			
		}

}
