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
package org.rapidpm.vaadin.api.fluent.builder.checkbox;

import org.rapidpm.vaadin.api.fluent.builder.api.AbstractFieldMixin;
import org.rapidpm.vaadin.api.fluent.builder.api.ClickNotifierMixin;
import org.rapidpm.vaadin.api.fluent.builder.api.FocusableMixin;
import org.rapidpm.vaadin.api.fluent.builder.api.HasElementMixin;
import org.rapidpm.vaadin.api.fluent.builder.api.HasEnabledMixin;
import org.rapidpm.vaadin.api.fluent.builder.api.HasSizeMixin;
import org.rapidpm.vaadin.api.fluent.builder.api.HasStyleMixin;
import org.rapidpm.vaadin.api.fluent.builder.api.HasValueAndElementMixin;
import org.rapidpm.vaadin.api.fluent.builder.api.HasValueMixin;
import org.rapidpm.vaadin.api.fluent.builder.component.ComponentMixin;
import com.vaadin.flow.component.checkbox.Checkbox;

public interface CheckboxMixin
    extends
    ComponentMixin<CheckboxMixin, Checkbox>,
    ClickNotifierMixin<CheckboxMixin, Checkbox>,
    FocusableMixin<CheckboxMixin, Checkbox>,
    HasValueAndElementMixin<CheckboxMixin, Checkbox>,
    HasValueMixin<CheckboxMixin, Checkbox>,
    HasEnabledMixin<CheckboxMixin, Checkbox>,
    HasElementMixin<CheckboxMixin, Checkbox>,
    HasSizeMixin<CheckboxMixin, Checkbox>,
    HasStyleMixin<CheckboxMixin, Checkbox>,
    AbstractFieldMixin<CheckboxMixin, Checkbox> {

  default CheckboxMixin setLabel(String label) {
    return invoke(c -> c.setLabel(label));
  }

  default CheckboxMixin setLabelAsHtml(String htmlContent) {
    return invoke(c -> c.setLabelAsHtml(htmlContent));
  }

  default CheckboxMixin setAriaLabel(String ariaLabel) {
    return invoke(c -> c.setAriaLabel(ariaLabel));
  }

  default CheckboxMixin setAutofocus(boolean autofocus) {
    return invoke(c -> c.setAutofocus(autofocus));
  }

  default CheckboxMixin setIndeterminate(boolean indeterminate) {
    return invoke(c -> c.setIndeterminate(indeterminate));
  }
}
