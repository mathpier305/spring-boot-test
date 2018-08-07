package com.matt.spring;

import java.util.Set;

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
import com.vaadin.ui.OptionGroup;
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
	
		Student s1  = new Student("joe", 22);
		Student s2 = new Student("Emily", 32);
		Student s3 = new Student("Adam", 40);
		
		OptionGroup optionGroup = new OptionGroup("students");
		optionGroup.setMultiSelect(true);
		optionGroup.addItem(s1);
		optionGroup.addItem(s2);
		optionGroup.addItem(s3);
		
		optionGroup.addValueChangeListener(event->{
			Set<Student> students = (Set<Student>)event.getProperty().getValue();
			for(Student s : students) {
				System.out.println(s.getAge() +"-"+ s.getName());
			}
		});
	
		root.addComponent(optionGroup);
		
		setContent(root);
		
	}

}
