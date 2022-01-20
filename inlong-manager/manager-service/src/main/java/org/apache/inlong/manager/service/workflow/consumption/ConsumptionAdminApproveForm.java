/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.inlong.manager.service.workflow.consumption;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.apache.inlong.manager.common.util.Preconditions;
import org.apache.inlong.manager.service.workflow.BaseWorkflowTaskFormType;
import org.apache.inlong.manager.common.exceptions.FormValidateException;

/**
 * New consumption approve form for admin
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel("New data consumption-system administrator form")
public class ConsumptionAdminApproveForm extends BaseWorkflowTaskFormType {

    public static final String FORM_NAME = "ConsumptionAdminApproveForm";

    @ApiModelProperty("Consumer group ID")
    private String consumerGroupId;

    @Override

    public void validate() throws FormValidateException {
        Preconditions.checkNotEmpty(consumerGroupId, "Consumer group cannot be empty");
    }

    @Override
    public String getFormName() {
        return FORM_NAME;
    }
}
