package ie.bhaa.ui;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

import javax.annotation.PostConstruct;

@SpringView(name = DefaultView.VIEW_NAME)
public class DefaultView extends VerticalLayout implements View {
    /*
     * This view is registered automatically based on the @SpringView annotation.
     * As it has an empty string as its view name, it will be shown when navigating to the Homepage
     */
    public static final String VIEW_NAME = "";

    @PostConstruct
    void init() {
        addComponent(new Label("Welcome View"));
    }

    @Override
    public void enter(ViewChangeListener.ViewChangeEvent event) {
        // the view is constructed in the init() method()
    }
}