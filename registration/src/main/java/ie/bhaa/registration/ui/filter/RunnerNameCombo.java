package ie.bhaa.registration.ui.filter;

import com.vaadin.shared.ui.combobox.FilteringMode;
import com.vaadin.ui.ComboBox;

/**
 * Created by pauloconnell on 31/01/16.
 */
public class RunnerNameCombo extends ComboBox {

    public RunnerNameCombo(String caption) {
        super(caption);
        // the item caption mode has to be PROPERTY for the filtering to work
        setItemCaptionMode(ItemCaptionMode.PROPERTY);

        // define the property name of the CountryBean to use as item caption
        setItemCaptionPropertyId("name");
    }

    public RunnerNameCombo() {
        this(null);
    }

    /**
     * Overwrite the protected method
     * {@link ComboBox#buildFilter(String, FilteringMode)} to return a custom
     * {@link SuggestionFilter} which is only needed to pass the given
     * filterString on to the {@link SuggestingContainer}.
     */
    @Override
    protected Filter buildFilter(String filterString, FilteringMode filteringMode) {
        return null;//new SuggestingContainer.SuggestionFilter(filterString);
    }
}
