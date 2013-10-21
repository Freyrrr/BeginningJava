public class Constructor2 {
	private String womanName;
	
	public Constructor2 (String name) {
		womanName=name;
	}
    public void setName (String name) {
    	womanName=name;
    }
    public String getName() {
    	return womanName;
    }
    public void out() {
    	System.out.printf("Your first girlfriends name was %s\n ", womanName);
    }
}