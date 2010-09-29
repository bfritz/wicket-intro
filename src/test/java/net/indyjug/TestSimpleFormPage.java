package net.indyjug;

import junit.framework.TestCase;

import org.apache.wicket.util.tester.WicketTester;

/**
 * Test SimpleFormPage.
 */
public class TestSimpleFormPage extends TestCase {

	private WicketTester tester;

	@Override
	public void setUp() {
		tester = new WicketTester(new WicketApplication());
	}

	public void testRenderSimpleFormPage() {
		tester.startPage(SimpleFormPage.class);

		tester.assertRenderedPage(SimpleFormPage.class);
	}
}
