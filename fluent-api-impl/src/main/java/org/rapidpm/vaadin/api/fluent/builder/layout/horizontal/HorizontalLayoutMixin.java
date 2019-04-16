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
package org.rapidpm.vaadin.api.fluent.builder.layout.horizontal;

import org.rapidpm.vaadin.api.fluent.builder.api.layout.FlexComponentMixin;
import org.rapidpm.vaadin.api.fluent.builder.api.layout.ThemableLayoutMixin;
import org.rapidpm.vaadin.api.fluent.builder.component.ComponentMixin;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasElement;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

public interface HorizontalLayoutMixin
    extends
    FlexComponentMixin<HorizontalLayoutMixin, HorizontalLayout>,
    ThemableLayoutMixin<HorizontalLayoutMixin, HorizontalLayout>,
    ComponentMixin<HorizontalLayoutMixin, HorizontalLayout> {

  default HorizontalLayoutMixin setSpacing(boolean spacing) {
    return invoke(c -> c.setSpacing(spacing));
  }

  default HorizontalLayoutMixin setVerticalComponentAlignment(FlexComponent.Alignment alignment , Component... componentsToAlign) {
    return invoke(c -> c.setVerticalComponentAlignment(alignment , componentsToAlign));
  }

  default HorizontalLayoutMixin setDefaultVerticalComponentAlignment(FlexComponent.Alignment alignment) {
    return invoke(c -> c.setDefaultVerticalComponentAlignment(alignment));
  }

  default HorizontalLayoutMixin setAlignItems(FlexComponent.Alignment alignment) {
    return invoke(c -> c.setAlignItems(alignment));
  }

  default HorizontalLayoutMixin setAlignSelf(FlexComponent.Alignment alignment , HasElement... elementContainers) {
    return invoke(c -> c.setAlignSelf(alignment , elementContainers));
  }
}
