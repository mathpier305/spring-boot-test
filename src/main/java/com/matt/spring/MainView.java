package com.matt.spring;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.data.Property.ValueChangeEvent;
import com.vaadin.data.Property.ValueChangeListener;
import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.data.util.ObjectProperty;
import com.vaadin.event.FieldEvents.TextChangeEvent;
import com.vaadin.event.FieldEvents.TextChangeListener;
import com.vaadin.server.VaadinRequest;
import com.vaadin.shared.ui.combobox.FilteringMode;
import com.vaadin.shared.ui.grid.HeightMode;
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
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.Grid;

@SpringUI(path="/ui")
@Title("This is the title")
@Theme("valo")
public class MainView extends UI {

	@Override
	protected void init(VaadinRequest request) {
		HorizontalLayout root = new HorizontalLayout();
		
		List<Student> students = new ArrayList<>();
		students.add(new Student("Joe Smith", 28));
		students.add(new Student("John Doe", 22));
		students.add(new Student("Adam Lopez", 32));
		
		BeanItemContainer<Student> container = new BeanItemContainer<>(Student.class, students);
		
		
		Grid grid = new Grid(container);
		//grid.addColumn("NAME", String.class);
		//grid.addColumn("AGE", Integer.class);
		//grid.addRow("Joe Smith", 22);
		//grid.addRow("Joe Smith", 22);
		//grid.addRow("Joe Smith", 22);

		
		
		grid.setColumnOrder("name", "age");
		
		grid.setHeightMode(HeightMode.ROW);
		grid.setHeightByRows(students.size());
		
		
	
		root.addComponent(grid);
		
		setContent(root);
		
	}

}
