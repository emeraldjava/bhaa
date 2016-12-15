package ie.bhaa.registration.enumeration;

/**
 * Created by pauloconnell on 15/12/16.
 */
public enum Page {

    MEMBER("Member","btn-primary"),
    DAYMEMBER("Day Member","btn-info"),
    PREREGISTERED("Pre Reg","btn-success"),
    LIST("List","btn-warning"),
    EXPORT("Export","btn-danger"),
    ADMIN("Admin","");

    private String display;
    private String button;

    private Page(String display,String button){
        this.display=display;
        this.button=button;
    }

    public String getDisplay() {
        return display;
    }

    public String getLink() {
        return display.replace(" ","").toLowerCase();
    }

    public String getButton() {
        return button;
    }
}
