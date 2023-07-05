/*
 * Copyright 2023 the original author or authors.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * https://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.openrewrite.kotlin.internal;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.jetbrains.kotlin.com.intellij.openapi.util.TextRange;

/**
 * Internal util class to present a PSI token to help developers to debug or trouble-shooting.
 */
@EqualsAndHashCode
@Data
public class PsiToken {
    TextRange range;
    String type;
    String text;

    @Override
    public String toString() {
        return range + " | Type: " + type + " | Text: \"" + text.replace("\n", "\\n") + "\"";
    }
}