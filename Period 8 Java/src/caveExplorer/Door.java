package caveExplorer;

public class Door {
	private boolean open;
	private boolean locked;
	private String description;
	private String details;
	
	public Door(){
		open=true;
		locked=false;
		description="Closed";
		details= "";
	}
}
