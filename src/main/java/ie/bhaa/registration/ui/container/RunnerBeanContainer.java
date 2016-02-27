package ie.bhaa.registration.ui.container;

import com.vaadin.data.Container;
import com.vaadin.data.Item;
import com.vaadin.data.util.filter.UnsupportedFilterException;
import ie.bhaa.registration.domain.Runner;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.vaadin.data.util.BeanContainer;

@Component
@Scope("prototype")
public class RunnerBeanContainer extends BeanContainer<String, Runner> {

    private static final long serialVersionUID = 3090067422968423191L;

    public static final String BEAN_ID = "id";

    public static final Object[] PROPERTIES = {"bhaaId", "firstName", "lastName"};

    public static final String[] HEADERS = {"BHAA ID", "First Name", "Last Name"};

    public RunnerBeanContainer() {
        super(Runner.class);
        setBeanIdProperty(BEAN_ID);
    }

    @Override
    protected void addFilter(Filter filter) throws UnsupportedFilterException {
        SuggestionFilter suggestionFilter = (SuggestionFilter) filter;
        filterItems(suggestionFilter.getFilterString());
    }

    private void filterItems(String filterString) {
        if ("".equals(filterString)) {
            if (Boolean.TRUE != null) {
                // if "nothing" has been selected from the dropdown list and a default value is defined, add this default
                // value to this container so that it can be selected as the current value.
    //            addBean(defaultCountry);
            }
            return;
        }

        removeAllItems();
//        List<CountryBean> countries = service.filterCountryTableInDatabase(filterString);
  //      addAll(countries);
    }

    /**
     * This method makes sure that the selected value is the only value shown in the dropdown list of the ComboBox when
     * this is explicitly opened with the arrow icon. If such a method is omitted, the dropdown list will contain the
     * most recently suggested items.
     */
    public void setSelectedCountryBean() {//CountryBean country) {
        removeAllItems();
        //addBean(country);
    }

    /**
     * The sole purpose of this {@link Filter} implementation is to transport the
     * current filterString (which is a private property of ComboBox) to our
     * custom container implementation {@link SuggestingContainer}. Our container
     * needs that filterString in order to fetch a filtered country list from the
     * database.
     */
    public static class SuggestionFilter implements Container.Filter {

        private String filterString;

        public SuggestionFilter(String filterString) {
            this.filterString = filterString;
        }

        public String getFilterString() {
            return filterString;
        }

        @Override
        public boolean passesFilter(Object itemId, Item item) throws UnsupportedOperationException {
            // will never be used and can hence always return false
            return false;
        }

        @Override
        public boolean appliesToProperty(Object propertyId) {
            // will never be used and can hence always return false
            return false;
        }
    }
}
