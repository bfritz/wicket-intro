package net.indyjug;

import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.form.AjaxFormComponentUpdatingBehavior;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.Model;

/**
 * Simple demo form.
 */
public class SimpleFormPage extends WebPage {

	private static final long serialVersionUID = 1L;

	public SimpleFormPage() {
		final Model<String> somethingModel = Model.of("blah");

		Form<Void> f = new Form<Void>("myForm") {
			private static final long serialVersionUID = 1L;

			@Override
			public void onSubmit() {
				System.out.println("User entered: " + somethingModel.getObject());
			}
		};

		f.add(new TextField<String>("something", somethingModel));

		TextField<String> atf = new TextField<String>("ajaxTextField", somethingModel);
		atf.add(new AjaxFormComponentUpdatingBehavior("onkeyup") {
			@Override
			protected void onUpdate(AjaxRequestTarget target) {
				System.out.println("changed");
			}

		});
		f.add(atf);

		add(f);

		add(new Label("said", somethingModel));
    }
}
