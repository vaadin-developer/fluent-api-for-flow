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
package org.rapidpm.vaadin.api.fluent.builder.combobox;

import java.util.function.Consumer;

import org.rapidpm.vaadin.api.fluent.builder.api.AbstractSinglePropertyFieldMixin;
import org.rapidpm.vaadin.api.fluent.builder.api.FocusableMixin;
import org.rapidpm.vaadin.api.fluent.builder.api.HasFilterableDataProviderMixin;
import org.rapidpm.vaadin.api.fluent.builder.api.HasSizeMixin;
import org.rapidpm.vaadin.api.fluent.builder.api.HasStyleMixin;
import org.rapidpm.vaadin.api.fluent.builder.api.HasValidationMixin;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.ItemLabelGenerator;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.data.renderer.Renderer;
import com.vaadin.flow.shared.Registration;

public interface ComboBoxMixin
    extends
    HasSizeMixin<ComboBoxMixin, ComboBox>,
    HasValidationMixin<ComboBoxMixin, ComboBox>,
    HasStyleMixin<ComboBoxMixin, ComboBox>,
    FocusableMixin<ComboBoxMixin, ComboBox>,
    AbstractSinglePropertyFieldMixin<ComboBoxMixin, ComboBox>,
    HasFilterableDataProviderMixin<ComboBoxMixin, ComboBox> {

  default ComboBoxMixin setRenderer(Renderer renderer) {
    return invoke(c -> c.setRenderer(renderer));
  }
// V10 - was removed
//  default ComboBoxMixin setFilteredItems(Object[] filteredItems) {
//    return invoke(c -> c.setFilteredItems(filteredItems));
//  }
//
//  default ComboBoxMixin setFilteredItems(Collection filteredItems) {
//    return invoke(c -> c.setFilteredItems(filteredItems));
//  }

  default ComboBoxMixin setItemLabelGenerator(ItemLabelGenerator itemLabelGenerator) {
    return invoke(c -> c.setItemLabelGenerator(itemLabelGenerator));
  }

  default ComboBoxMixin setOpened(boolean opened) {
    return invoke(c -> c.setOpened(opened));
  }

  default ComboBoxMixin setAllowCustomValue(boolean allowCustomValue) {
    return invoke(c -> c.setAllowCustomValue(allowCustomValue));
  }

  default ComboBoxMixin setAutofocus(boolean autofocus) {
    return invoke(c -> c.setAutofocus(autofocus));
  }

  default ComboBoxMixin setPreventInvalidInput(boolean preventInvalidInput) {
    return invoke(c -> c.setPreventInvalidInput(preventInvalidInput));
  }

  default ComboBoxMixin setRequired(boolean required) {
    return invoke(c -> c.setRequired(required));
  }

  default ComboBoxMixin setLabel(String label) {
    return invoke(c -> c.setLabel(label));
  }

  default ComboBoxMixin setPlaceholder(String placeholder) {
    return invoke(c -> c.setPlaceholder(placeholder));
  }

  default ComboBoxMixin setPattern(String pattern) {
    return invoke(c -> c.setPattern(pattern));
  }

  default ComboBoxMixin onEnabledStateChanged(boolean enabled) {
    return invoke(c -> c.onEnabledStateChanged(enabled));
  }


  default ComboBoxMixin addCustomValueSetListener(ComponentEventListener listener ,
                                                  Consumer<Registration> registrationConsumer) {
    component()
        .map(component -> component.addCustomValueSetListener(listener))
        .ifPresent(registrationConsumer);
    return this;
  }

  default ComboBoxMixin addCustomValueSetListener(ComponentEventListener listener) {
    component().map(component -> component.addCustomValueSetListener(listener));
    return this;
  }

}
