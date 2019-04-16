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
package org.rapidpm.vaadin.api.fluent.builder.passwordfield;

import org.rapidpm.vaadin.api.fluent.builder.api.AbstractSinglePropertyFieldMixin;
import org.rapidpm.vaadin.api.fluent.builder.api.CompositionNotifierMixin;
import org.rapidpm.vaadin.api.fluent.builder.api.FocusableMixin;
import org.rapidpm.vaadin.api.fluent.builder.api.HasAutocapitalizeMixin;
import org.rapidpm.vaadin.api.fluent.builder.api.HasAutocompleteMixin;
import org.rapidpm.vaadin.api.fluent.builder.api.HasAutocorrectMixin;
import org.rapidpm.vaadin.api.fluent.builder.api.HasElementMixin;
import org.rapidpm.vaadin.api.fluent.builder.api.HasPrefixAndSuffixMixin;
import org.rapidpm.vaadin.api.fluent.builder.api.HasSizeMixin;
import org.rapidpm.vaadin.api.fluent.builder.api.HasStyleMixin;
import org.rapidpm.vaadin.api.fluent.builder.api.HasValidationMixin;
import org.rapidpm.vaadin.api.fluent.builder.api.HasValueChangeModeMixin;
import org.rapidpm.vaadin.api.fluent.builder.api.InputNotifierMixin;
import org.rapidpm.vaadin.api.fluent.builder.api.KeyNotifierMixin;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.data.value.ValueChangeMode;

public interface PasswordFieldMixin
    extends
    HasSizeMixin<PasswordFieldMixin, PasswordField>,
    HasStyleMixin<PasswordFieldMixin, PasswordField>,
    HasValidationMixin<PasswordFieldMixin, PasswordField>,
    HasValueChangeModeMixin<PasswordFieldMixin, PasswordField>,
    HasPrefixAndSuffixMixin<PasswordFieldMixin, PasswordField>,
    HasAutocompleteMixin<PasswordFieldMixin, PasswordField>,
    HasAutocapitalizeMixin<PasswordFieldMixin, PasswordField>,
    HasAutocorrectMixin<PasswordFieldMixin, PasswordField>,
    FocusableMixin<PasswordFieldMixin, PasswordField>,
    InputNotifierMixin<PasswordFieldMixin, PasswordField>,
    KeyNotifierMixin<PasswordFieldMixin, PasswordField>,
    CompositionNotifierMixin<PasswordFieldMixin, PasswordField>,
    AbstractSinglePropertyFieldMixin<PasswordFieldMixin, PasswordField>,
    HasElementMixin<PasswordFieldMixin, PasswordField> {

  default PasswordFieldMixin setValueChangeMode(ValueChangeMode valueChangeMode) {
    return invoke(c -> c.setValueChangeMode(valueChangeMode));
  }

  default PasswordFieldMixin setErrorMessage(String errorMessage) {
    return invoke(c -> c.setErrorMessage(errorMessage));
  }

  default PasswordFieldMixin setInvalid(boolean invalid) {
    return invoke(c -> c.setInvalid(invalid));
  }

  default PasswordFieldMixin setLabel(String label) {
    return invoke(c -> c.setLabel(label));
  }

  default PasswordFieldMixin setPlaceholder(String placeholder) {
    return invoke(c -> c.setPlaceholder(placeholder));
  }

  default PasswordFieldMixin setAutofocus(boolean autofocus) {
    return invoke(c -> c.setAutofocus(autofocus));
  }

  default PasswordFieldMixin setMaxLength(int maxLength) {
    return invoke(c -> c.setMaxLength(maxLength));
  }

  default PasswordFieldMixin setMinLength(int minLength) {
    return invoke(c -> c.setMinLength(minLength));
  }

  default PasswordFieldMixin setRequired(boolean required) {
    return invoke(c -> c.setRequired(required));
  }

  default PasswordFieldMixin setPreventInvalidInput(boolean preventInvalidInput) {
    return invoke(c -> c.setPreventInvalidInput(preventInvalidInput));
  }

  default PasswordFieldMixin setPattern(String pattern) {
    return invoke(c -> c.setPattern(pattern));
  }

  default PasswordFieldMixin setTitle(String title) {
    return invoke(c -> c.setTitle(title));
  }

  default PasswordFieldMixin setRevealButtonVisible(boolean revealButtonVisible) {
    return invoke(c -> c.setRevealButtonVisible(revealButtonVisible));
  }

  default PasswordFieldMixin setValue(String value) {
    return invoke(c -> c.setValue(value));
  }

  default PasswordFieldMixin setRequiredIndicatorVisible(boolean requiredIndicatorVisible) {
    return invoke(c -> c.setRequiredIndicatorVisible(requiredIndicatorVisible));
  }
}
