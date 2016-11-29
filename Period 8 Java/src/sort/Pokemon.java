package sort;

public class Pokemon {
	private int level;
	private int hp;
	private String name;
	private boolean poisoned;
	
	public void attack(Pokemon target, Attack attack){
		if(Math.random()<.9){
			attack.attack(target);
			System.out.println("The attack hit!");
		}else{
			System.out.println("The attack missed!");
		}
	}
	
	public void iChooseYou(){
		System.out.println(name+", "+name);
	}
	
	public Pokemon(String name,int level){
		hp=100;
		this.name=name;
		this.level=level;
		this.poisoned=false;
	}
	
	public void lapse(){
		if(poisoned){
			hp-=15;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public boolean isPoisoned() {
		return poisoned;
	}

	public void setPoisoned(boolean poisoned) {
		this.poisoned = poisoned;
	}
}
