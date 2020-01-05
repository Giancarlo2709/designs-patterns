package com.pluralsight.factory;

public class WebSiteFactory {
	
	public static Website getWebSite(WebSiteType siteType) {
		switch(siteType) {
			case BLOG : {
				return new Blog();
			}
			
			case SHOP : {
				return new Shop();
			}
			
			default: {
				return null;
			}
		}
	}

}
