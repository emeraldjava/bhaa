package ie.bhaa.registration.ui.form;

import com.vaadin.data.fieldgroup.BeanFieldGroup;
import com.vaadin.data.fieldgroup.FieldGroup;
import com.vaadin.event.ShortcutAction;
import com.vaadin.ui.*;
import com.vaadin.ui.themes.ValoTheme;
import ie.bhaa.registration.domain.Runner;
import ie.bhaa.registration.ui.RegistrationUI;
import ie.bhaa.registration.ui.RunnerUI;

/**
 * Created by pauloconnell on 24/01/16.
 */
public class RunnerForm extends FormLayout {

    Button save = new Button("Save", this::save);
    Button cancel = new Button("Cancel", this::cancel);
    TextField firstName = new TextField("First name");
    TextField lastName = new TextField("Last name");
    TextField phone = new TextField("Phone");
    TextField email = new TextField("Email");
    DateField birthDate = new DateField("Birth date");

    Runner contact;

    // Easily bind forms to beans and manage validation and buffering
    BeanFieldGroup<Runner> formFieldBindings;

    public RunnerForm() {
        configureComponents();
        buildLayout();
    }

    private void configureComponents() {

        //HIGHLIGHT PRIMARY ACTIONS
        //With Vaadin built-in styles you can highlight the primary save button and give it a keyboard shortcut for a better UX.
        save.setStyleName(ValoTheme.BUTTON_PRIMARY);
        save.setClickShortcut(ShortcutAction.KeyCode.ENTER);
        setVisible(false);
    }

    private void buildLayout() {
        setSizeUndefined();
        setMargin(true);

        HorizontalLayout actions = new HorizontalLayout(save, cancel);
        actions.setSpacing(true);

        addComponents(actions, firstName, lastName, phone, email, birthDate);
    }

    //USE ANY JVM LANGUAGE
    //Vaadin supports all languages supported by Java Virtual Machine 1.6+. This allows you to program user interface in Java 8, Scala, Groovy or any other language you choose. The new languages give you very powerful tools for organizing your code as you choose. For example, you can implement the listener methods in your compositions or in separate controller classes and receive to various Vaadin component events, like button clicks. Or keep it simple and compact with Lambda expressions.
    public void save(Button.ClickEvent event) {
        try {
            // Commit the fields from UI to DAO
            formFieldBindings.commit();

            // Save DAO to backend with direct synchronous service API
            //getUI().service.save(contact);

            String msg = String.format("Saved '%s %s'.",
                    contact.getFirstName(),
                    contact.getLastName());
            Notification.show(msg, Notification.Type.TRAY_NOTIFICATION);
            //getUI().refreshContacts();
        } catch (FieldGroup.CommitException e) {
            // Validation exceptions could be shown here
        }
    }

    public void cancel(Button.ClickEvent event) {
        // Place to call business logic.
        Notification.show("Cancelled", Notification.Type.TRAY_NOTIFICATION);
        //getUI().contactList.select(null);
    }

    void edit(Runner contact) {
        this.contact = contact;
        if(contact != null) {
            // Bind the properties of the contact POJO to fiels in this form
            formFieldBindings = BeanFieldGroup.bindFieldsBuffered(contact, this);
            firstName.focus();
        }
        setVisible(contact != null);
    }

    @Override
    public RunnerUI getUI() {
        return (RunnerUI) super.getUI();
    }
}
