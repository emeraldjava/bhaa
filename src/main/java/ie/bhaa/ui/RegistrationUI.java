package ie.bhaa.ui;

import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by pauloconnell on 15/01/16.
 */
@Theme("valo")
@SpringUI(path = "")
public class RegistrationUI extends UI {

    @Override
    protected void init(VaadinRequest request) {
        setContent(new Label("BHAA REGISTRAION"));

    }
}
