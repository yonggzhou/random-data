/*
 * #%L
 * random-data
 * %%
 * Copyright (C) 2016 - 2017 Tyro Payments Pty Ltd
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package com.tyro.oss.randomdata;

import static com.tyro.oss.randomdata.RandomLong.*;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class RandomLongTest {

    @Test
    public void shouldReturnRandomLong() throws Exception {
        assertThat(randomLong()).isInstanceOf(Long.class);
    }

    @Test
    public void shouldReturnRandomLongInclusive() throws Exception {
        assertThat(randomLongBetween(10L, 100L)).isBetween(10L, 100L);
        assertThat(randomLongBetween(-100L, -10L)).isBetween(-100L, -10L);
        assertThat(randomLongBetween(-10L, 10L)).isBetween(-10L, 10L);
    }

    @Test
    public void shouldReturnRandomPositiveLong() throws Exception {
        assertThat(randomPositiveLong()).isPositive();
    }
}