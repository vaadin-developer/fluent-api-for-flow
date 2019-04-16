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

import java.util.Collection;

import com.vaadin.flow.data.binder.HasDataProvider;
import com.vaadin.flow.data.provider.DataProvider;

public interface HasDataProviderMixin<R extends HasDataProviderMixin, T extends HasDataProvider>
    extends HasItemsMixin<R, T> {

  default R setDataProvider(DataProvider dataProvider) {
    return invoke(c -> c.setDataProvider(dataProvider));
  }

  default R setItems(Collection items) {
    return invoke(c -> c.setItems(items));
  }

}
