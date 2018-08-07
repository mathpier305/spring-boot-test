package com.matt.spring;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.data.Property.ValueChangeEvent;
import com.vaadin.data.Property.ValueChangeListener;
import com.vaadin.data.util.ObjectProperty;
import com.vaadin.event.FieldEvents.TextChangeEvent;
import com.vaadin.event.FieldEvents.TextChangeListener;
import com.vaadin.server.VaadinRequest;
import com.vaadin.shared.ui.label.ContentMode;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Notification;
import com.vaadin.ui.TextArea;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.AbstractTextField.TextChangeEventMode;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.CheckBox;

@SpringUI(path="/ui")
@Title("This is the title")
@Theme("valo")
public class MainView extends UI {

	@Override
	protected void init(VaadinRequest request) {
		HorizontalLayout root = new HorizontalLayout();
	
		CheckBox checkbox = new CheckBox("Has Degree");
		
//		checkbox.addValueChangeListener(new ValueChangeListener() {
//			
//			@Override
//			public void valueChange(ValueChangeEvent event) {
//				// TODO Auto-generated method stub
//				System.out.println(checkbox.getValue());
//				
//			}
//		});
		
		checkbox.addValueChangeListener(event -> {
			System.out.println(checkbox.getValue() +" with lamdba");
		});
		root.addComponent(checkbox);
		
		setContent(root);
		
	}

}
