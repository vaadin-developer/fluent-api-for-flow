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

import com.vaadin.flow.component.HasStyle;

public interface HasStyleMixin<R extends HasStyleMixin, T extends HasStyle>
    extends HasElementMixin<R, T> {

  default R addClassName(String className) {
    return invoke(c -> c.addClassName(className));
  }

  default R removeClassName(String className) {
    return invoke(c -> c.removeClassName(className));
  }

  default R setClassName(String className) {
    return invoke(c -> c.setClassName(className));
  }

  default R setClassName(String className , boolean set) {
    return invoke(c -> c.setClassName(className , set));
  }

  default R addClassNames(String... classNames) {
    return invoke(c -> c.addClassNames(classNames));
  }

  default R removeClassNames(String... classNames) {
    return invoke(c -> c.removeClassNames(classNames));
  }
}
