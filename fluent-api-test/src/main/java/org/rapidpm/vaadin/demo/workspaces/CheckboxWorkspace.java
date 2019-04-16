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
package org.rapidpm.vaadin.demo.workspaces;

import org.rapidpm.dependencies.core.logger.HasLogger;
import org.rapidpm.vaadin.api.fluent.builder.FluentAPI;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;

@Route(value = CheckboxWorkspace.NAV)
public class CheckboxWorkspace extends Composite<Div> implements HasLogger {

  public static final String NAV = "Checkbox";

  public CheckboxWorkspace() {
    final Checkbox c = FluentAPI
        .checkBoxBuilder()
        .setLabel("my label")
        .setAutofocus(true)
        .addClickListener(clickEvent -> logger().info(clickEvent.toString()))
        .build();
    getContent().add(c);
  }
}
