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

import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.CompositionEndEvent;
import com.vaadin.flow.component.CompositionNotifier;
import com.vaadin.flow.component.CompositionStartEvent;
import com.vaadin.flow.component.CompositionUpdateEvent;
import com.vaadin.flow.shared.Registration;

public interface CompositionNotifierMixin<R extends CompositionNotifierMixin, T extends CompositionNotifier>
    extends NeutralMixin<R, T> {

  default R addCompositionStartListener(ComponentEventListener<CompositionStartEvent> listener) {
    return invoke(c -> c.addCompositionStartListener(listener));
  }

  default R addCompositionUpdateListener(ComponentEventListener<CompositionUpdateEvent> listener) {
    return invoke(c -> c.addCompositionUpdateListener(listener));
  }

  default R addCompositionEndListener(ComponentEventListener<CompositionEndEvent> listener) {
    return invoke(c -> c.addCompositionEndListener(listener));
  }


  default R addCompositionStartListener(ComponentEventListener<CompositionStartEvent> listener ,
                                        Consumer<Registration> registrationConsumer) {
    component()
        .map(c -> c.addCompositionStartListener(listener))
        .ifPresent(registrationConsumer);
    return (R) this;
  }

  default R addCompositionUpdateListener(ComponentEventListener<CompositionUpdateEvent> listener ,
                                         Consumer<Registration> registrationConsumer) {
    component()
        .map(c -> c.addCompositionUpdateListener(listener))
        .ifPresent(registrationConsumer);
    return (R) this;
  }

  default R addCompositionEndListener(ComponentEventListener<CompositionEndEvent> listener ,
                                      Consumer<Registration> registrationConsumer) {
    component()
        .map(c -> c.addCompositionEndListener(listener))
        .ifPresent(registrationConsumer);
    return (R) this;
  }


}
