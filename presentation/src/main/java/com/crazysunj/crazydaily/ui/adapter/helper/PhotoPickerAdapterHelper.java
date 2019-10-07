/*
  Copyright 2017 Sun Jian
  <p>
  Licensed under the Apache License, Version 2.0 (the "License");
  you may not use this file except in compliance with the License.
  You may obtain a copy of the License at
  <p>
  http://www.apache.org/licenses/LICENSE-2.0
  <p>
  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an "AS IS" BASIS,
  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  See the License for the specific language governing permissions and
  limitations under the License.
 */
package com.crazysunj.crazydaily.ui.adapter.helper;

import com.crazysunj.crazydaily.R;
import com.crazysunj.domain.entity.photo.MediaEntity;
import com.crazysunj.multitypeadapter.helper.AsynAdapterHelper;

/**
 * @author: sunjian
 * created on: 2018/9/21 下午1:56
 * description: https://github.com/crazysunj/CrazyDaily
 */
public class PhotoPickerAdapterHelper extends AsynAdapterHelper<MediaEntity> {

    public static final int LEVEL_PHOTO_PICKER = 0;

    public PhotoPickerAdapterHelper() {
        super();
        registerModule();
    }

    private void registerModule() {
        registerModule(LEVEL_PHOTO_PICKER)
                .type(MediaEntity.TYPE_PHOTO_PICKER)
                .layoutResId(R.layout.item_photo_picker)
                .register();
    }
}
