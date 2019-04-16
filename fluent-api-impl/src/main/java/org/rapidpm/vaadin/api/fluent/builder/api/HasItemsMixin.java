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
import java.util.stream.Stream;

import com.vaadin.flow.data.binder.HasItems;

public interface HasItemsMixin<R extends HasItemsMixin, T extends HasItems>
    extends NeutralMixin<R, T> {

  default R setItems(Collection collection) {
    return invoke(c -> c.setItems(collection));
  }

  default R setItems(Object[] items) {
    return invoke(c -> c.setItems(items));
  }

  default R setItems(Stream streamOfItems) {
    return invoke(c -> c.setItems(streamOfItems));
  }
}
