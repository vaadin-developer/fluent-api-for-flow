/**
 * Copyright © 2018 Sven Ruppert (sven.ruppert@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.rapidpm.vaadin.component.login;


import static org.rapidpm.vaadin.addon.idgenerator.VaadinIDGenerator.buttonID;
import static org.rapidpm.vaadin.addon.idgenerator.VaadinIDGenerator.caption;
import static org.rapidpm.vaadin.addon.idgenerator.VaadinIDGenerator.genericID;
import static org.rapidpm.vaadin.addon.idgenerator.VaadinIDGenerator.passwordID;
import static org.rapidpm.vaadin.addon.idgenerator.VaadinIDGenerator.placeholder;
import static org.rapidpm.vaadin.addon.idgenerator.VaadinIDGenerator.textfieldID;
import static org.rapidpm.vaadin.api.fluent.builder.FluentAPI.horizontalLayoutBuilder;
import static org.rapidpm.vaadin.api.fluent.builder.FluentAPI.textFieldBuilder;
import static org.rapidpm.vaadin.api.fluent.builder.FluentAPI.verticalLayoutBuilder;

import java.util.function.Consumer;
import java.util.function.Function;

import org.rapidpm.dependencies.core.logger.HasLogger;
import org.rapidpm.vaadin.api.fluent.builder.button.ButtonBuilder;
import org.rapidpm.vaadin.api.fluent.builder.checkbox.CheckboxBuilder;
import org.rapidpm.vaadin.api.fluent.builder.passwordfield.PasswordFieldBuilder;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.orderedlayout.FlexComponent.JustifyContentMode;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.shared.Registration;

public abstract class LoginView extends Composite<HorizontalLayout> implements HasLogger {

  public static final String BTN_LOGIN_ID = buttonID().apply(LoginView.class , "btn-login");
  public static final String BTN_CANCEL_ID = buttonID().apply(LoginView.class , "btn-cancel");
  public static final String TF_USERNAME_ID = textfieldID().apply(LoginView.class , "tf-username");
  public static final String PF_PASSWORD_ID = passwordID().apply(LoginView.class , "pf-password");
  public static final String CB_REMEMBER_ME_ID = genericID().apply(LoginView.class , Checkbox.class , "cb-remember-me");

  public static final String BTN_LOGIN_CAPTION = caption().apply(BTN_LOGIN_ID);
  public static final String BTN_CANCEL_CAPTION = caption().apply(BTN_CANCEL_ID);
  public static final String TF_USERNAME_PLACEHOLDER = placeholder().apply(TF_USERNAME_ID);
  public static final String CB_REMEMBER_ME_CAPTION = placeholder().apply(CB_REMEMBER_ME_ID);


//  private final TextField username = new TextFieldBuilder(TextField::new)
//      .set(Component::setId , "tf-username-id")
//      .set(TextField::setPlaceholder, "User Name")
//      .build();

//  private final TextField username = new TextFieldBuilder(TextField::new)
//      .setId("tf-username-id")
//      .setPlaceholder("User Name")
//      .build();

//  private final TextField username = new TextFieldBuilder(TextField::new)
//      .setId(TF_USERNAME_ID)
//      .setPlaceholder(getTranslation(TF_USERNAME_PLACEHOLDER))
//      .build();

  private final TextField username = textFieldBuilder()
      .setId(TF_USERNAME_ID)
      .setPlaceholder(getTranslation(TF_USERNAME_PLACEHOLDER))
      .build();


  private final PasswordField password = new PasswordFieldBuilder(PasswordField::new)
      .setId(PF_PASSWORD_ID)
      .build();


  private final Checkbox rememberMe = new CheckboxBuilder(Checkbox::new)
      .setId(CB_REMEMBER_ME_ID)
      .setRequiredIndicatorVisible(false)
      .setLabel(getTranslation(CB_REMEMBER_ME_CAPTION))
      .setIndeterminate(false)
      .build();


  private final Button btnLogin = new ButtonBuilder(Button::new)
      .setSizeFull()
      .setId(BTN_LOGIN_ID)
      .setText(getTranslation(BTN_LOGIN_CAPTION))
      .addClickListener(e -> validate())
      .component()
      .getOrElse(() -> new Button("dummy button"));

  private final Button btnCancel = new ButtonBuilder(Button::new)
      .setId(BTN_CANCEL_ID)
      .addClickListener(e -> clearFields())
      .setText(getTranslation(BTN_CANCEL_CAPTION))
      .setVisible(true)
      .build();

//  private final VerticalLayout layout = new VerticalLayoutBuilder(VerticalLayout::new)
//      .setDefaultHorizontalComponentAlignment(Alignment.START)
//      .setSizeUndefined()
//      .add(new HorizontalLayout(username , password))
//      .add(rememberMe)
//      .add(new HorizontalLayout(btnLogin , btnCancel))
//      .build();

  private final VerticalLayout layout = verticalLayoutBuilder()
      .setDefaultHorizontalComponentAlignment(Alignment.START)
      .setSizeUndefined()
      .add(horizontalLayoutBuilder()
               .add(username , password)
               .build())
      .add(rememberMe)
      .add(horizontalLayoutBuilder()
               .add(btnLogin , btnCancel)
               .build())
      .build();


  private Function<HorizontalLayout, HorizontalLayout> f = (h) -> horizontalLayoutBuilder(h)
      .setDefaultVerticalComponentAlignment(Alignment.CENTER)
      .setJustifyContentMode(JustifyContentMode.CENTER)
      .add(layout)
      .setSizeFull()
      .build();


  //    horizontalLayoutBuilder(getContent())
//        .setDefaultVerticalComponentAlignment(Alignment.CENTER)
//        .setJustifyContentMode(JustifyContentMode.CENTER)
//        .add(layout)
//        .setSizeFull();

  public LoginView() {
    f.apply(getContent());
  }

  public void clearFields() {
    username.clear();
    password.clear();
  }

  public Registration addButtonOkClickListener(ComponentEventListener<ClickEvent<Button>> cl) {
    return btnLogin.addClickListener(cl);
  }

  public Registration addButtonCancelClickListener(ComponentEventListener<ClickEvent<Button>> cl) {
    return btnCancel.addClickListener(cl);
  }

  public void addButtonOkClickListener(ComponentEventListener<ClickEvent<Button>> cl , Consumer<Registration> c) {
    c.accept(btnLogin.addClickListener(cl));
  }

  public void addButtonCancelClickListener(ComponentEventListener<ClickEvent<Button>> cl , Consumer<Registration> c) {
    c.accept(btnLogin.addClickListener(cl));
  }

  public String username() {
    return username.getValue();
  }

  public String password() {
    return password.getValue();
  }

  public Boolean rememberMe() {
    return rememberMe.getValue();
  }

  public void validate() {
    boolean isValid = checkCredentials();
    if (isValid) {
      navigateToApp();
    } else {
      reactOnFailedLogin();
    }
    clearFields();
  }

  public abstract void reactOnFailedLogin();

  public abstract void navigateToApp();

  public abstract boolean checkCredentials();

}
