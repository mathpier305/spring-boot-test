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
		
		root.setMargin(true);
		root.setHeight("100%");
		
		Panel panel = new Panel("Login");
		panel.setSizeUndefined();
		
		root.addComponent(panel);
		root.setComponentAlignment(panel, Alignment.MIDDLE_CENTER);
		
		FormLayout loginLayout = new FormLayout();
		loginLayout.addComponent(new TextField("Username"));
		loginLayout.addComponent(new PasswordField("Password: "));
		
		Button loginButton = new Button("Login");
		loginButton.setStyleName(ValoTheme.BUTTON_FRIENDLY);
		
		Button signInButton = new Button("Sign Up");
		signInButton.setStyleName(ValoTheme.BUTTON_PRIMARY);
		
		loginLayout.addComponent(new HorizontalLayout(loginButton, signInButton));
		loginLayout.setWidthUndefined();
		loginLayout.setMargin(true);
		
		panel.setContent(loginLayout);
		
		
		
		setContent(root);
		
	}

}
