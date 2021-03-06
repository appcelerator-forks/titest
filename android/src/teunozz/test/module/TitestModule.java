/**
 * This file was auto-generated by the Titanium Module SDK helper for Android
 * Appcelerator Titanium Mobile
 * Copyright (c) 2009-2010 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 *
 */
package teunozz.test.module;

import teunozz.test.module.AndroidWearClient;

import org.appcelerator.kroll.KrollDict;
import org.appcelerator.kroll.KrollModule;
import org.appcelerator.kroll.annotations.Kroll;
import org.appcelerator.titanium.TiApplication;
import org.appcelerator.titanium.util.TiIntentWrapper;
import org.appcelerator.kroll.common.Log;
import org.appcelerator.kroll.common.TiConfig;

import android.app.Activity;
import android.content.Intent;


@Kroll.module(name="Titest", id="teunozz.test.module")
public class TitestModule extends KrollModule
{

	// Standard Debugging variables
	private static final String LCAT = "TitestModule";
	private static final boolean DBG = TiConfig.LOGD;
	
	private AndroidWearClient client = new AndroidWearClient();

	// You can define constants with @Kroll.constant, for example:
	// @Kroll.constant public static final String EXTERNAL_NAME = value;

	public TitestModule()
	{
		super();
	}

	@Kroll.onAppCreate
	public static void onAppCreate(TiApplication app)
	{
		// put module init code that needs to run when the application is created
	}
	
	@Override
	public void onDestroy(Activity activity) {	
		client.stop();
	}
	
	@Kroll.method
	public void start() {

		TiApplication appContext = TiApplication.getInstance();
		Activity activity = appContext.getCurrentActivity();
		
		client.start(this);
	}

    @Kroll.method
	public void stop() {
    	client.stop();
    }

    @Kroll.method
	public void sendData() {
    	client.sendData();
    }
}

