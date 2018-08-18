package com.matt.spring;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.data.Property.ValueChangeEvent;
import com.vaadin.data.Property.ValueChangeListener;
import com.vaadin.data.Validator;
import com.vaadin.data.fieldgroup.BeanFieldGroup;
import com.vaadin.data.fieldgroup.FieldGroup;
import com.vaadin.data.fieldgroup.FieldGroup.CommitException;
import com.vaadin.data.fieldgroup.PropertyId;
import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.data.util.ObjectProperty;
import com.vaadin.event.FieldEvents.TextChangeEvent;
import com.vaadin.event.FieldEvents.TextChangeListener;
import com.vaadin.navigator.Navigator;
import com.vaadin.server.FontAwesome;
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
import com.vaadin.ui.Panel;
import com.vaadin.ui.PasswordField;
import com.vaadin.ui.TabSheet;
import com.vaadin.ui.TextArea;
import com.vaadin.ui.TextField;
import com.vaadin.ui.Tree;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.AbstractTextField.TextChangeEventMode;
import com.vaadin.ui.AbsoluteLayout;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.CheckBox;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.Grid;
import com.vaadin.ui.Grid.MultiSelectionModel;
import com.vaadin.ui.Grid.SelectionMode;
import com.vaadin.ui.Grid.SingleSelectionModel;
import com.vaadin.ui.themes.ValoTheme;
import com.vaadin.ui.GridLayout;

@SpringUI(path="/ui")
@Title("This is the title")
@Theme("valo")
public class MainView extends UI {
	@Override
	protected void init(VaadinRequest request) {
		
		VerticalLayout root = new VerticalLayout();
		
		Button firstViewButton = new Button("Navigate to first View");
		Button secondViewButton = new Button("Navigate to Second View");
		
		Panel viewContainer = new Panel();
		Navigator navigator = new Navigator(this, viewContainer);
		
		navigator.addView(FirstView.Name, new FirstView());
		navigator.addView(SecondView.Name, new SecondView());
		navigator.addView("",new FirstView());
		
		root.addComponent(new HorizontalLayout(firstViewButton, secondViewButton));
		root.addComponent(viewContainer);
		
		navigator.navigateTo(FirstView.Name);
		
		firstViewButton.addClickListener(event ->{
			navigator.navigateTo(FirstView.Name);
		});
		
		secondViewButton.addClickListener(event -> navigator.navigateTo(SecondView.Name));
		
		setContent(root);
		
	}

}
