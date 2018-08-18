package com.matt.spring;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

public class SecondView extends VerticalLayout implements View {

	public static final String Name="secondView";
	@Override
	public void enter(ViewChangeEvent event) {
		Label label = new Label("This is the second View");
		addComponent(label);
		
	}

}
