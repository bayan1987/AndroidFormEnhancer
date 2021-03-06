/*
 * Copyright 2012 Soichiro Kashima
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

package com.androidformenhancer.test;

import com.androidformenhancer.annotation.Email;
import com.androidformenhancer.annotation.Required;
import com.androidformenhancer.annotation.Widget;

/**
 * @author Soichiro Kashima
 */
public class CustomEmailPatternForm {

    @Widget(id = R.id.textfield_email, nameResId = R.string.form_default_email)
    @Required
    @Email
    public String email;

}
