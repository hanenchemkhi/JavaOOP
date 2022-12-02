package hackerrankabstractclass;

public class MyBook extends Book {
	String title;
    @Override
    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle() {
    	return  title;
    }

}
