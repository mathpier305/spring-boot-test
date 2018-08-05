package com.matt.spring;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.data.util.ObjectProperty;
import com.vaadin.event.FieldEvents.TextChangeEvent;
import com.vaadin.event.FieldEvents.TextChangeListener;
import com.vaadin.server.VaadinRequest;
import com.vaadin.shared.ui.label.ContentMode;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.AbstractTextField.TextChangeEventMode;
import com.vaadin.ui.Button.ClickEvent;

@SpringUI(path="/ui")
@Title("This is the title")
@Theme("valo")
public class MainView extends UI {

	@Override
	protected void init(VaadinRequest request) {
		HorizontalLayout root = new HorizontalLayout();
	
		TextField textField = new TextField("character counter");
		Label label = new Label();
		label.setImmediate(true);
		
		textField.addTextChangeListener(new TextChangeListener() {
			
			@Override
			public void textChange(TextChangeEvent event) {
				int lengthOfText = event.getText().length();
				label.setValue("Number of Characters : "+lengthOfText);
			}
		});
		
		textField.setTextChangeEventMode(TextChangeEventMode.EAGER);
		
		root.addComponent(textField);
		root.addComponent(label);
		
		setContent(root);
		
	}

}
