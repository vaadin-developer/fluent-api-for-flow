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
package org.rapidpm.vaadin.api.fluent.builder.textfield;

import org.rapidpm.vaadin.api.fluent.builder.api.AbstractSinglePropertyFieldMixin;
import org.rapidpm.vaadin.api.fluent.builder.api.CompositionNotifierMixin;
import org.rapidpm.vaadin.api.fluent.builder.api.FocusableMixin;
import org.rapidpm.vaadin.api.fluent.builder.api.HasAutocapitalizeMixin;
import org.rapidpm.vaadin.api.fluent.builder.api.HasAutocompleteMixin;
import org.rapidpm.vaadin.api.fluent.builder.api.HasAutocorrectMixin;
import org.rapidpm.vaadin.api.fluent.builder.api.HasPrefixAndSuffixMixin;
import org.rapidpm.vaadin.api.fluent.builder.api.HasSizeMixin;
import org.rapidpm.vaadin.api.fluent.builder.api.HasStyleMixin;
import org.rapidpm.vaadin.api.fluent.builder.api.HasValidationMixin;
import org.rapidpm.vaadin.api.fluent.builder.api.HasValueChangeModeMixin;
import org.rapidpm.vaadin.api.fluent.builder.api.InputNotifierMixin;
import org.rapidpm.vaadin.api.fluent.builder.api.KeyNotifierMixin;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.value.ValueChangeMode;

public interface TextFieldMixin
    extends
    HasStyleMixin<TextFieldMixin, TextField>,
    HasSizeMixin<TextFieldMixin, TextField>,
    HasValidationMixin<TextFieldMixin, TextField>,
    HasValueChangeModeMixin<TextFieldMixin, TextField>,
    HasPrefixAndSuffixMixin<TextFieldMixin, TextField>,
    InputNotifierMixin<TextFieldMixin, TextField>,
    KeyNotifierMixin<TextFieldMixin, TextField>,
    FocusableMixin<TextFieldMixin, TextField>,
    CompositionNotifierMixin<TextFieldMixin, TextField>,
    HasAutocompleteMixin<TextFieldMixin, TextField>,
    HasAutocapitalizeMixin<TextFieldMixin, TextField>,
    HasAutocorrectMixin<TextFieldMixin, TextField>,
    AbstractSinglePropertyFieldMixin<TextFieldMixin, TextField> {


  default TextFieldMixin setValueChangeMode(ValueChangeMode valueChangeMode) {
    return invoke(c -> c.setValueChangeMode(valueChangeMode));
  }

  default TextFieldMixin setErrorMessage(String errorMessage) {
    return invoke(c -> c.setErrorMessage(errorMessage));
  }

  default TextFieldMixin setInvalid(boolean invalid) {
    return invoke(c -> c.setInvalid(invalid));
  }

  default TextFieldMixin setLabel(String label) {
    return invoke(c -> c.setLabel(label));
  }

  default TextFieldMixin setPlaceholder(String placeholder) {
    return invoke(c -> c.setPlaceholder(placeholder));
  }

  default TextFieldMixin setAutofocus(boolean autofocus) {
    return invoke(c -> c.setAutofocus(autofocus));
  }

  default TextFieldMixin setMaxLength(int maxLength) {
    return invoke(c -> c.setMaxLength(maxLength));
  }

  default TextFieldMixin setMinLength(int minLength) {
    return invoke(c -> c.setMinLength(minLength));
  }

  default TextFieldMixin setRequired(boolean required) {
    return invoke(c -> c.setRequired(required));
  }

  default TextFieldMixin setPreventInvalidInput(boolean preventInvalidInput) {
    return invoke(c -> c.setPreventInvalidInput(preventInvalidInput));
  }

  default TextFieldMixin setPattern(String pattern) {
    return invoke(c -> c.setPattern(pattern));
  }

  default TextFieldMixin setTitle(String title) {
    return invoke(c -> c.setTitle(title));
  }

  default TextFieldMixin setValue(String value) {
    return invoke(c -> c.setValue(value));
  }

  default TextFieldMixin setRequiredIndicatorVisible(boolean requiredIndicatorVisible) {
    return invoke(c -> c.setRequiredIndicatorVisible(requiredIndicatorVisible));
  }


}
