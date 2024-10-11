/**
 * Copyright 2024 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.micrometer.core.aop;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Container annotation that aggregates several {@link MeterTag} annotations.
 *
 * Can be used natively, declaring several nested {@link MeterTag} annotations. Can also
 * be used in conjunction with Java 8's support for repeatable annotations, where
 * {@link MeterTag} can simply be declared several times on the same parameter, implicitly
 * generating this container annotation.
 *
 * @author Maksym Symonov
 * @author Marcin Grzejszczak
 * @since 1.14.0
 * @see MeterTag
 */
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Target({ ElementType.METHOD, ElementType.PARAMETER })
@Documented
public @interface MeterTags {

    MeterTag[] value();

}
