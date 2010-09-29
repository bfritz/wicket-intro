package net.indyjug;

import org.apache.wicket.PageParameters;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.model.StringResourceModel;

/**
 * Homepage
 */
public class HomePage extends WebPage {

	private static final long serialVersionUID = 1L;

	// TODO Add any page properties or variables here

    /**
	 * Constructor that is invoked when page is invoked without a session.
	 * 
	 * @param parameters
	 *            Page parameters
	 */
    public HomePage(final PageParameters parameters) {

        // Add the simplest type of label
        long t = parameters.getAsLong("ms", System.currentTimeMillis());

        add(new Label("message",
                    new StringResourceModel(
                        "msg", this, null, new Object[] {t})));

        add(new BookmarkablePageLink("linkHome", HomePage.class));

        add(new BookmarkablePageLink("linkToForm", SimpleFormPage.class));
    }
}
