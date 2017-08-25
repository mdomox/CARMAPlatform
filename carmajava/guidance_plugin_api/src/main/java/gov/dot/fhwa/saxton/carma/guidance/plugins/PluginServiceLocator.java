/*
 * TODO: Copyright (C) 2017 LEIDOS.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package gov.dot.fhwa.saxton.carma.guidance.plugins;

import gov.dot.fhwa.saxton.carma.guidance.ArbitratorService;
import gov.dot.fhwa.saxton.carma.guidance.pubsub.IPubSubService;

/**
 * Service collection for the Plugin interface. Provides access to the generic, ROS agnostic interfaces
 * the plugins can use to interact with platform systems and other Guidance sub-components.
 */
public class PluginServiceLocator {
    protected ArbitratorService arbitratorService;
    protected PluginManagementService pluginManagementService;
    protected IPubSubService IPubSubService;

    public PluginServiceLocator(ArbitratorService arbitratorService,
        PluginManagementService pluginManagementService, IPubSubService IPubSubService) {
        this.arbitratorService = arbitratorService;
        this.IPubSubService = IPubSubService;
        this.pluginManagementService = pluginManagementService;
    }

    /**
     * Get the ArbitratorService instance available to the plugins
     */
    public ArbitratorService getArbitratorService() {
        return arbitratorService;
    }

    /**
     * Get the PluginManagementService instance available to the plugins
     */
    public PluginManagementService getPluginManagementService() {
        return pluginManagementService;
    }

    /**
     * Get the PubSubService instance available to the plugins
     */
    public IPubSubService getPubSubService() {
        return IPubSubService;
    }
}