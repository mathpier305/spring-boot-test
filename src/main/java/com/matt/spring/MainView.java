package com.matt.spring;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.data.util.ObjectProperty;
import com.vaadin.server.VaadinRequest;
import com.vaadin.shared.ui.label.ContentMode;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Button.ClickEvent;

@SpringUI(path="/ui")
@Title("This is the title")
@Theme("valo")
public class MainView extends UI {

	@Override
	protected void init(VaadinRequest request) {
		HorizontalLayout root = new HorizontalLayout();
		
		ObjectProperty<String> property = new ObjectProperty<String>("this is with data binding");
		
		//Label label = new Label("<b>this is the label<b>", ContentMode.HTML);
		//Label label = new Label("this the the \nlabel", ContentMode.PREFORMATTED);
		Label label = new Label(property);
		root.addComponent(label);
		
		setContent(root);
		
	}

}
