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
package org.rapidpm.vaadin.api.fluent.builder.api.layout;

import java.util.function.Consumer;

import org.rapidpm.vaadin.api.fluent.builder.api.ClickNotifierMixin;
import org.rapidpm.vaadin.api.fluent.builder.api.HasStyleMixin;
import org.rapidpm.vaadin.api.fluent.builder.component.ComponentMixin;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.contextmenu.ContextMenuBase;
import com.vaadin.flow.component.contextmenu.GeneratedVaadinContextMenu.OpenedChangeEvent;
import com.vaadin.flow.shared.Registration;

public interface ContextMenuBaseMixin<
    R extends ContextMenuBaseMixin,
    T extends ContextMenuBase>
    extends
    HasComponentsMixin<R, T>,
    ClickNotifierMixin<R, T>,
    ComponentMixin<R, T>,
    HasStyleMixin<R, T> {

  default R setTarget(Component target) {
    return invoke(c -> c.setTarget(target));
  }

  default R setOpenOnClick(boolean openOnClick) {
    return invoke(c -> c.setOpenOnClick(openOnClick));
  }

  default R add(Component... components) {
    return invoke(c -> c.add(components));
  }

  default R remove(Component... components) {
    return invoke(c -> c.remove(components));
  }

  default R removeAll() {
    return invoke(c -> c.removeAll());
  }

  default R addComponentAtIndex(int index , Component component) {
    return invoke(c -> c.addComponentAtIndex(index , component));
  }

  default R addOpenedChangeListener(ComponentEventListener<OpenedChangeEvent<? extends Component>> listener ,
                                    Consumer<Registration> registrationConsumer) {
    component()
        .map(component -> component.addOpenedChangeListener(listener))
        .ifPresent(registrationConsumer);
    return (R) this;
  }

  default R addOpenedChangeListener(ComponentEventListener<OpenedChangeEvent<? extends Component>> listener) {
    component()
        .ifPresent(component -> component.addOpenedChangeListener(listener));
    return (R) this;
  }
}
