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
package org.rapidpm.vaadin.api.fluent.builder.api;

import java.util.function.Consumer;

import com.vaadin.flow.data.provider.DataGenerator;
import com.vaadin.flow.data.provider.HasDataGenerators;
import com.vaadin.flow.shared.Registration;

public interface HasDataGeneratorsMixin<R extends HasDataGeneratorsMixin,
    T extends HasDataGenerators>
    extends NeutralMixin<R, T> {

  default R addDataGenerator(DataGenerator dataGenerator ,
                              Consumer<Registration> registrationConsumer) {
    component()
        .map(component -> component.addDataGenerator(dataGenerator))
        .ifPresent(registrationConsumer);
    return (R) this;
  }
}
