package ie.bhaa.registration.ui;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.*;
import ie.bhaa.registration.domain.Runner;
import ie.bhaa.registration.ui.form.RunnerForm;

/**
 * Created by pauloconnell on 24/01/16.
 * https://vaadin.com/tutorial
 */
//@Title("RunnerUI")
//@Theme("valo")
//@SpringUI
public class RunnerUI extends UI {

    //HUNDREDS OF WIDGETS
    //Vaadin's user interface components are just Java objects that encapsulate and handle cross-browser support and client-server communication. The default Vaadin components are in the com.vaadin.ui package and there are over 500 more in vaadin.com/directory.
    TextField filter = new TextField();
    Grid contactList = new Grid();
    Button newContact = new Button("New contact");

    // ContactForm is an example of a custom component class
    RunnerForm contactForm = new RunnerForm();

    // ContactService is a in-memory mock DAO that mimics
    // a real-world datasource. Typically implemented for
    // example as EJB or Spring Data based service.
    //ContactService service = ContactService.createDemoService();


    //THE "MAIN METHOD"
    //This is the entry point method executed to initialize and configure the visible user interface. Executed on every browser reload because a new instance is created for each web page loaded.
    @Override
    protected void init(VaadinRequest request) {
        configureComponents();
        buildLayout();
    }


    private void configureComponents() {

        //SYNCHRONOUS EVENT HANDLING
        //Receive user interaction events on the server-side. This allows you to synchronously handle those events. Vaadin automatically sends only the needed changes to the web page without loading a new page.
        //newContact.addClickListener(e -> contactForm.edit(new Contact()));

        filter.setInputPrompt("Filter contacts...");
        filter.addTextChangeListener(e -> refreshContacts(e.getText()));

        contactList.setContainerDataSource(new BeanItemContainer<>(Runner.class));
        contactList.setColumnOrder("firstName", "lastName", "email");
        contactList.removeColumn("id");
        contactList.removeColumn("birthDate");
        contactList.removeColumn("phone");
        contactList.setSelectionMode(Grid.SelectionMode.SINGLE);
        //contactList.addSelectionListener(e
          //      -> contactForm.edit((Runner) contactList.getSelectedRow()));
        refreshContacts();
    }

    //ROBUST LAYOUTS

    //Layouts are components that contain other components. HorizontalLayout contains TextField and Button. It is wrapped with a Grid into VerticalLayout for the left side of the screen. Allow user to resize the components with a SplitPanel. In addition to programmatically building layout in Java, you may also choose to setup layout declaratively with Vaadin Designer, CSS and HTML.
    private void buildLayout() {
        HorizontalLayout actions = new HorizontalLayout(filter, newContact);
        actions.setWidth("100%");
        filter.setWidth("100%");
        actions.setExpandRatio(filter, 1);

        VerticalLayout left = new VerticalLayout(actions, contactList);
        left.setSizeFull();
        contactList.setSizeFull();
        left.setExpandRatio(contactList, 1);

        HorizontalLayout mainLayout = new HorizontalLayout(left, contactForm);
        mainLayout.setSizeFull();
        mainLayout.setExpandRatio(left, 1);

        // Split and allow resizing
        setContent(mainLayout);
    }

    //CHOOSE THE DESIGN PATTERNS YOU LIKE
    //It is good practice to have separate data access methods that handle the back-end access and/or the user interface updates. You can further split your code into classes to easier maintenance. With Vaadin you can follow MVC, MVP or any other design pattern you choose.
    void refreshContacts() {
        refreshContacts(filter.getValue());
    }

    private void refreshContacts(String stringFilter) {
        //contactList.setContainerDataSource(new BeanItemContainer<>(
          //      Runner.class, service.findAll(stringFilter)));
        contactForm.setVisible(false);
    }

}
