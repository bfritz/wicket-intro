package net.indyjug;

import org.apache.wicket.protocol.http.WebApplication;
import org.apache.wicket.request.target.coding.QueryStringUrlCodingStrategy;

/**
 * Application object for your web application. If you want to run this application without deploying, run the Start class.
 * 
 * @see net.indyjug.Start#main(String[])
 */
public class WicketApplication extends WebApplication
{    
    /**
     * Constructor
     */
	public WicketApplication()
	{
	}

	@Override
	public void init() {
		mount(new QueryStringUrlCodingStrategy("/form", SimpleFormPage.class));
	}
	
	/**
	 * @see org.apache.wicket.Application#getHomePage()
	 */
	public Class<HomePage> getHomePage()
	{
		return HomePage.class;
	}

}
