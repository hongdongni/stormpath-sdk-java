/*
 * Copyright 2016 Stormpath, Inc.
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
package com.stormpath.sdk.impl.saml;

import com.stormpath.sdk.lang.Assert;
import com.stormpath.sdk.saml.CreateSamlServiceProviderRegistrationRequest;
import com.stormpath.sdk.saml.SamlServiceProviderRegistration;
import com.stormpath.sdk.saml.SamlServiceProviderRegistrationOptions;

/**
 * @since 1.2.0
 */
public class DefaultCreateSamlServiceProviderRegistrationRequest implements CreateSamlServiceProviderRegistrationRequest {

    private final SamlServiceProviderRegistration samlServiceProviderRegistration;
    private final SamlServiceProviderRegistrationOptions options;

    public DefaultCreateSamlServiceProviderRegistrationRequest(SamlServiceProviderRegistration samlServiceProviderRegistration, SamlServiceProviderRegistrationOptions options) {
        Assert.notNull(samlServiceProviderRegistration, "samlServiceProviderRegistration cannot be null.");
        this.samlServiceProviderRegistration = samlServiceProviderRegistration;
        this.options = options;
    }

    @Override
    public SamlServiceProviderRegistration getSamlServiceProviderRegistration() {
        return this.samlServiceProviderRegistration;
    }

    @Override
    public boolean hasSamlServiceProviderRegistrationOptions() {
        return this.options != null;
    }

    @Override
    public SamlServiceProviderRegistrationOptions getSamlServiceProviderRegistrationOptions() throws IllegalStateException {
        return options;
    }

}
