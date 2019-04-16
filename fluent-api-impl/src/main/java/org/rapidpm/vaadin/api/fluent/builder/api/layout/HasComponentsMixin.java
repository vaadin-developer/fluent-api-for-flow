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

import org.rapidpm.vaadin.api.fluent.builder.api.HasElementMixin;
import org.rapidpm.vaadin.api.fluent.builder.api.HasEnabledMixin;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasComponents;

public interface HasComponentsMixin<R extends HasComponentsMixin, T extends HasComponents>
    extends
    HasElementMixin<R, T>,
    HasEnabledMixin<R, T> {

  default R add(Component... components) {
    return invoke(c -> c.add(components));
  }

  default R remove(Component... components) {
    return invoke(c -> c.remove(components));
  }

  default R removeAll() {
    return invoke(HasComponents::removeAll);
  }

  default R addComponentAtIndex(int index , Component component) {
    return invoke(c -> c.addComponentAtIndex(index , component));
  }

  default R addComponentAsFirst(Component component) {
    return invoke(c -> c.addComponentAsFirst(component));
  }
}
