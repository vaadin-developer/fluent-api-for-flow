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

import com.vaadin.flow.component.HasTheme;

public interface HasThemeMixin<R extends HasThemeMixin,
    T extends HasTheme>
    extends HasElementMixin<R, T> {

  default HasThemeMixin addThemeName(String themeName) {
    return invoke(component -> component.addThemeName(themeName));
  }

  default HasThemeMixin removeThemeName(String themeName) {
    return invoke(component -> component.removeThemeName(themeName));
  }

  default HasThemeMixin setThemeName(String themeName) {
    return invoke(component -> component.setThemeName(themeName));
  }


  default HasThemeMixin setThemeName(String themeName , boolean set) {
    return invoke(compoment -> compoment.setThemeName(themeName , set));
  }

  default HasThemeMixin addThemeNames(String... themeNames) {
    return invoke(component -> component.addThemeNames(themeNames));
  }

  default HasThemeMixin removeThemeNames(String... themeNames) {
    return invoke(component -> component.removeThemeNames(themeNames));
  }
}
