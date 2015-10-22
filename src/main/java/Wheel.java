/**
 * Created by USER on 21.10.2015.
 */
public class Wheel {
    private String type;

    public Wheel(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    @Override
    public String toString(){
        return "Wheel{" + type + " }" ;
    }
}
