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
import com.vaadin.flow.component.orderedlayout.BoxSizing;
import com.vaadin.flow.component.orderedlayout.ThemableLayout;

public interface ThemableLayoutMixin<R extends ThemableLayoutMixin, T extends ThemableLayout>
    extends HasElementMixin<R, T> {

  default R setMargin(boolean margin) {
    return invoke(c -> c.setMargin(margin));
  }

  default R setPadding(boolean padding) {
    return invoke(c -> c.setPadding(padding));
  }

  default R setSpacing(boolean spacing) {
    return invoke(c -> c.setSpacing(spacing));
  }

  default R setBoxSizing(BoxSizing boxSizing) {
    return invoke(c -> c.setBoxSizing(boxSizing));
  }
}
