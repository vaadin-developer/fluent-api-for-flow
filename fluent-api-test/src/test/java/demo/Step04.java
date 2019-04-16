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
package demo;

import java.util.Optional;

import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.data.value.ValueChangeMode;

public class Step04 {


  final PasswordField pf = Optional.of(new PasswordField())
                                   .map(pf -> {
                                     pf.setPlaceholder("password");
                                     pf.setId("pf-password-id");
                                     pf.setValueChangeMode(ValueChangeMode.EAGER);
                                     pf.setVisible(true);
                                     pf.setRequired(true);
                                     return pf;
                                   })
                                   .get();
}
