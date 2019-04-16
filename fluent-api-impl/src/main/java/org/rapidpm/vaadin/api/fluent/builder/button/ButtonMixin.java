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
package org.rapidpm.vaadin.api.fluent.builder.button;

import org.rapidpm.vaadin.api.fluent.builder.api.ClickNotifierMixin;
import org.rapidpm.vaadin.api.fluent.builder.api.FocusableMixin;
import org.rapidpm.vaadin.api.fluent.builder.api.HasEnabledMixin;
import org.rapidpm.vaadin.api.fluent.builder.api.HasSizeMixin;
import org.rapidpm.vaadin.api.fluent.builder.api.HasStyleMixin;
import org.rapidpm.vaadin.api.fluent.builder.api.HasTextMixin;
import org.rapidpm.vaadin.api.fluent.builder.component.ComponentMixin;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.button.Button;

public interface ButtonMixin
    extends
    ComponentMixin<ButtonMixin, Button>,
    FocusableMixin<ButtonMixin, Button>,
    ClickNotifierMixin<ButtonMixin, Button>,
    HasStyleMixin<ButtonMixin, Button>,
    HasEnabledMixin<ButtonMixin, Button>,
    HasSizeMixin<ButtonMixin, Button>,
    HasTextMixin<ButtonMixin, Button> {

  default ButtonMixin setText(String text) {
    return invoke(c -> c.setText(text));
  }

  default ButtonMixin setIcon(Component icon) {
    return invoke(c -> c.setIcon(icon));
  }

  default ButtonMixin setIconAfterText(boolean iconAfterText) {
    return invoke(c -> c.setIconAfterText(iconAfterText));
  }

  default ButtonMixin setAutofocus(boolean autofocus) {
    return invoke(c -> c.setAutofocus(autofocus));
  }

  default ButtonMixin click() {
    return invoke(Button::click);
  }
}
