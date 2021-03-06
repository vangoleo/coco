/*
 * Copyright 2012-2013 coco Team.
 *
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
 */

package com.leibangzhu.coco.ext4.impl;

import com.leibangzhu.coco.ext4.WithAttributeExt;

import java.util.Map;

/**
 * @author Jerry Lee(oldratlee AT gmail DOT com)
 */
public class WithAttributeExtImpl1 implements WithAttributeExt {
    public String echo(Map<String, String> config, String s) {
        return "Ext1Impl1-echo";
    }

    public String yell(Map<String, String> config, String s) {
        return "Ext1Impl1-yell";
    }
}
