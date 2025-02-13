/*
 * TencentBlueKing is pleased to support the open source community by making
 * 蓝鲸智云-权限中心Java SDK(iam-java-sdk) available.
 * Copyright (C) 2017-2021 THL A29 Limited, a Tencent company. All rights reserved.
 * Licensed under the MIT License (the "License"); you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at http://opensource.org/licenses/MIT
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package com.tencent.bk.sdk.iam.dto;

import com.tencent.bk.sdk.iam.dto.callback.response.BaseInfoDTO;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class PathInfoDTO extends BaseInfoDTO {
    private String type;

    private PathInfoDTO child;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("/");
        sb.append(type).append(',').append(getId());
        if (child == null) {
            return sb.append("/").toString();
        } else {
            return sb.append(child.toString()).toString();
        }
    }
}
