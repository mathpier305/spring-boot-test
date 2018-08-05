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
import com.vaadin.ui.TextField;
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
		
		String nameValue = "";
	
		
		ObjectProperty<String> property = new ObjectProperty<String>(nameValue);
		TextField textField = new TextField("Name: ", property);
		textField.setImmediate(true);
		//textField.setMaxLength(3);
		
		Label label = new Label(property);
		label.setCaption("Result: ");
		
		textField.setValue("setting the value here");
		
		root.addComponent(textField);
		root.addComponent(label);
		
		setContent(root);
		
	}

}
